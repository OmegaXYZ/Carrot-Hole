package com.hust23se.carrothole.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.hust23se.carrothole.entity.UserEntity;
import com.hust23se.carrothole.util.UniqueKeyGenerator;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
    UserService userService;

    /**
     * register new user
     *
     * @param userName
     * @param password
     * @return
     */
    @Override
    public boolean register(String userName, String password) {
        QueryWrapper<UserEntity> userQueryWrapper = new QueryWrapper<>();
        // repeated userName
        if(userQueryWrapper.eq("user_name",userName) != null){
            return false;
        }
        UserEntity userEntity = new UserEntity();
        userEntity.setUserId(UniqueKeyGenerator.generateUniqueKey());
        userEntity.setUserName(userName);
        userEntity.setPassword(password);
        userEntity.setLevel(1);
        return userService.save(userEntity);
    }

    /**
     * check user exist
     *
     * @param userName
     * @param password
     * @return
     */
    @Override
    public UserEntity login(String userName, String password) {
        QueryWrapper<UserEntity> userQueryWrapper = new QueryWrapper<>();
        userQueryWrapper.eq("user_name",userName).eq("password",password);
        UserEntity userEntity = userService.getOne(userQueryWrapper);
        if(userEntity!=null){
            userEntity.setPassword(null);
        }
        return userEntity;
    }
}
