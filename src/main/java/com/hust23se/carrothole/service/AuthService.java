package com.hust23se.carrothole.service;

import com.hust23se.carrothole.entity.User;

public interface AuthService {

    /**
     * register new user
     * @param userName
     * @param password
     * @return
     */
    public boolean register(String userName, String password);

    /**
     * check user exist
     * @param userName
     * @param password
     * @return
     */
    public User login(String userName, String password);
}
