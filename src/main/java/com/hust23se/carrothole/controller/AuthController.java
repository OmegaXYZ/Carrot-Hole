package com.hust23se.carrothole.controller;

import com.hust23se.carrothole.entity.User;
import com.hust23se.carrothole.service.AuthServiceImpl;
import com.hust23se.carrothole.util.ResultMap;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

/**
 * Auth controller
 *
 * @author MYH
 * @date 2023-10-10
 */
@Slf4j
@RestController
@RequestMapping("/auth")
public class AuthController {

    @Autowired
    AuthServiceImpl authService;

    @PostMapping("/register")
    public boolean register(@RequestBody Map<String,Object> idMap) throws Exception {
        try{
            return authService.register(String.valueOf(idMap.get("userName")),String.valueOf(idMap.get("password")));
        }catch (Exception e){
            throw new Exception("register error");
        }
    }

    @PostMapping("/login")
    public ResultMap login(@RequestBody Map<String,Object> idMap) throws Exception{
        try{
            User user = authService.login(String.valueOf(idMap.get("userName")),String.valueOf(idMap.get("password")));
            ResultMap resultMap = ResultMap.create();
            if(user != null){
                resultMap.setSuccess();
                resultMap.setSuccessMsg("Login success");
                resultMap.setKeyValue("user", user);
            }else{
                resultMap.setError();
                resultMap.setErrorMsg("Login failed");
            }

            return resultMap;
        }catch (Exception e){
            throw new Exception("login error");
        }
    }
}
