package com.hust23se.carrothole.config;

import com.hust23se.carrothole.interceptor.AuthInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * web config
 * @author MYH
 * @date 2023-10-02
 */
@Configuration
public class WebConfiguration implements WebMvcConfigurer {

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new AuthInterceptor())
                //  "/**" 表示所有请求路径都拦截，包含静态资源
                .addPathPatterns("/**")
                //放行的路径
                .excludePathPatterns("/css/**", "/img/**", "/js/**", "/error/**", "/zui/**", "/login");
    }

//    @Override
//    public void addResourceHandlers(ResourceHandlerRegistry registry) {
//        //将所有/static/** 访问都映射到classpath:/static/ 目录下
//        registry.addResourceHandler("/static/**/").addResourceLocations("classpath:/static/");
//    }
}
