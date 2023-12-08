package com.hust23se.carrothole.service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.hust23se.carrothole.entity.User;
import com.hust23se.carrothole.mapper.UserMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * User service interface implementation
 *
 * @author MYH
 * @date 2023-10-04
 */
@Service("UserServiceImpl")
@Slf4j
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService{

}
