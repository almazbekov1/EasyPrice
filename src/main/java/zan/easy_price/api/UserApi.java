package zan.easy_price.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import zan.easy_price.domain.dto.UserView;
import zan.easy_price.service.UserService;

@RestController
@RequestMapping("/api/users")
public class UserApi {

    private final UserService userService;

    public UserApi(UserService userService) {
        this.userService = userService;
    }


    @GetMapping("/{id}")
    public UserView getById(@PathVariable Long id) {
        return userService.getById(id);
    }
}
