package zan.easy_price.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import zan.easy_price.domain.dto.UserView;
import zan.easy_price.domain.model.User;
import zan.easy_price.domain.object.ProviderObject;
import zan.easy_price.service.UserService;

import java.util.ArrayList;
import java.util.List;

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
