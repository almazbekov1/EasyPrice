package zan.easy_price.domain.mapper;

import org.springframework.stereotype.Component;
import zan.easy_price.domain.dto.UserView;
import zan.easy_price.domain.model.Role;
import zan.easy_price.domain.model.User;
import zan.easy_price.domain.object.ProviderObject;
import zan.easy_price.domain.object.UserObject;

import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;

@Component
public class UserViewMapper {

    public UserView viewUser(User user) {
        if (user == null) {
            return null;
        }
        UserView userView = new UserView();

        if (user.getId() != null) {
            userView.setId(String.valueOf(user.getId()));
        }

        UserObject userObject = new UserObject();
        userObject.setEmail(user.getEmail());
        userObject.setFirstName(user.getFirstName());
        userObject.setLastName(user.getLastName());
        userObject.setPhoneNumber(user.getPhoneNumber());
        userView.setUser(userObject);

        if (user.getProvider() != null) {
            ProviderObject providerObject = new ProviderObject();
            providerObject.setName(user.getProvider().getName());
            providerObject.setEmail(user.getProvider().getEmail());
            userView.setProvider(providerObject);
        }
        if (!user.getRoles().isEmpty()) {
            setAuthority(userView, user.getRoles());

        }

        return userView;
    }

    private void setAuthority(UserView userView, List<Role> roles) {
        Set<String> authorities = new HashSet<>();
        for (Role role : roles) {
            authorities.add(role.getName());
        }
        userView.setAuthorities(authorities);
    }


}
