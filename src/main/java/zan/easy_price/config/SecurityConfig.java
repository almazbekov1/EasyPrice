package zan.easy_price.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    private final UserDetailsService userDetailsService;

    public SecurityConfig(@Qualifier("userDetailsServiceImpl")UserDetailsService userDetailsService) {
        this.userDetailsService = userDetailsService;
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {

        http = http.cors().and().csrf().disable();

//        http.authorizeRequests()
//                // Swagger endpoints must be publicly accessible
//                .antMatchers("/").permitAll()
//                // Our public endpoints
//                .antMatchers("/api/public/**").permitAll()
//                // Our private endpoints
//                .anyRequest().authenticated();

        http.csrf().disable()
                .authorizeRequests()
                .antMatchers(
                        "/**.js",
                        "/**.css"
                ).permitAll()
                .antMatchers("/**").permitAll()
//                .antMatchers("/api/admin").access("hasAnyRole('ROLE_ADMIN')")
//                .antMatchers("/api/user").access("hasAnyRole('ROLE_USER')")
//                .antMatchers("/admin.html").access("hasAnyRole('ROLE_ADMIN')")
//                .antMatchers("/user.html").access("hasAnyRole('ROLE_USER')")
                .anyRequest().permitAll()

//                .antMatchers("/").permitAll()
                .and()
                .formLogin()
                .permitAll()
                .and()
                .logout()
                .invalidateHttpSession(true)
                .clearAuthentication(true)
                .permitAll();


    }
    @Bean
    public static NoOpPasswordEncoder passwordEncoder() {
        return (NoOpPasswordEncoder) NoOpPasswordEncoder.getInstance();
    }

    @Autowired
    public void configureGlobalSecurity(AuthenticationManagerBuilder auth) throws Exception {
        auth.userDetailsService(userDetailsService).passwordEncoder(passwordEncoder()); // конфигурация для прохождения аутентификации
    }

}