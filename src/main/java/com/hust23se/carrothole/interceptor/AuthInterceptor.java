package com.hust23se.carrothole.interceptor;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 检查是否登录
 *
 * @author MYH
 * @date 2023-10-02
 */
@Slf4j
public class AuthInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {

        log.debug("AuthInterceptor preHandle，handler={}", handler.toString());
        // redirect to exception page if not login
//        if(request.getSession().getAttribute("user") == null){
//            response.sendRedirect("");
//            return false;
//        }
        return true;
    }
}