package com.hust23se.carrothole.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.hust23se.carrothole.entity.User;
import com.hust23se.carrothole.util.UniqueKeyGenerator;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

/**
 * auth service implementation
 *
 * @author MYH
 * @date 2023-10-10
 */
@Service
@Slf4j
public class AuthServiceImpl implements AuthService{

    @Autowired
    UserServiceImpl userService;

    /**
     * register new user
     *
     * @param userName
     * @param password
     * @return
     */
    @Override
    public boolean register(String userName, String password) {
        QueryWrapper<User> userQueryWrapper = new QueryWrapper<>();
        userQueryWrapper.eq("user_name",userName);
        // repeated userName
        if(userService.getOne(userQueryWrapper) != null){
            return false;
        }
        User user = new User();
        user.setUserId(UniqueKeyGenerator.generateUniqueKey());
        user.setUserName(userName);
        user.setPassword(password);
        user.setRegisterDate(LocalDateTime.now());
        user.setLoginDate(LocalDateTime.now());
        user.setLevel(1);
        return userService.save(user);
    }

    /**
     * check user exist
     *
     * @param userName
     * @param password
     * @return
     */
    @Override
    public User login(String userName, String password) {
        QueryWrapper<User> userQueryWrapper = new QueryWrapper<>();
        userQueryWrapper.eq("user_name",userName).eq("password",password);
        User user = userService.getOne(userQueryWrapper);
        if(user !=null){
            user.setPassword(null);
            user.setLoginDate(LocalDateTime.now());
        }
        return user;
    }
}
