package zan.easy_price.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import zan.easy_price.domain.dto.UserView;
import zan.easy_price.domain.mapper.UserViewMapper;
import zan.easy_price.repo.UserRepo;
import zan.easy_price.service.UserService;

@Service
public class UserServiceImpl implements UserService {

   private final UserRepo userRepo;

   private final UserViewMapper userViewMapper;

    public UserServiceImpl(UserRepo userRepo, UserViewMapper userViewMapper) {
        this.userRepo = userRepo;
        this.userViewMapper = userViewMapper;
    }

    @Override
    public UserView getById(Long id) {
        return userViewMapper.viewUser(userRepo.findById(id).get());
    }
}
