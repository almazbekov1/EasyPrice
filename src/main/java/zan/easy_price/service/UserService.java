package zan.easy_price.service;


import zan.easy_price.domain.dto.UserView;

public interface UserService {
    UserView getById(Long id);
}
