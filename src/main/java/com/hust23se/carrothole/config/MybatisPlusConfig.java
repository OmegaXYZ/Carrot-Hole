package com.hust23se.carrothole.config;

import com.baomidou.mybatisplus.annotation.DbType;
import com.baomidou.mybatisplus.core.handlers.MetaObjectHandler;
import com.baomidou.mybatisplus.extension.plugins.MybatisPlusInterceptor;
import com.baomidou.mybatisplus.extension.plugins.inner.BlockAttackInnerInterceptor;
import com.baomidou.mybatisplus.extension.plugins.inner.PaginationInnerInterceptor;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.reflection.MetaObject;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDateTime;

/**
 * mybatis-plus config clss
 *
 * @author MYH
 * @date 2023-10-06
 */
@Configuration
@Slf4j
public class MybatisPlusConfig {

    /**
     * MybatisPlus插件配置
     * @return {@link MybatisPlusInterceptor }
     */
    @Bean
    public MybatisPlusInterceptor mybatisPlusInterceptor() {
        MybatisPlusInterceptor interceptor = new MybatisPlusInterceptor();
        //分页插件
//        interceptor.addInnerInterceptor(new PaginationInnerInterceptor(DbType.MYSQL));
        PaginationInnerInterceptor paginationInnerInterceptor = new PaginationInnerInterceptor(DbType.MYSQL);
        // 处理查询溢出，当超过最大页数时不会报错
        paginationInnerInterceptor.setOverflow(true);
        interceptor.addInnerInterceptor(paginationInnerInterceptor);
        //防止全表更新与删除
        interceptor.addInnerInterceptor(new BlockAttackInnerInterceptor());
        return interceptor;
    }


    /**
     * 表对应的实例，自动填充创建时间和更新时间
     *
     * @return {@link MetaObjectHandler}
     */
    @Bean
    public MetaObjectHandler metaObjectHandler() {
        return new MetaObjectHandler() {
            @Override
            public void insertFill (MetaObject metaObject){
                log.info("auto fill------[insert]");
                metaObject.setValue("registerDate", LocalDateTime.now());
                metaObject.setValue("loginDate", LocalDateTime.now());
                metaObject.setValue("postDate", LocalDateTime.now());
                metaObject.setValue("commentDate", LocalDateTime.now());
            }

            @Override
            public void updateFill (MetaObject metaObject){
                log.info("auto fill------[update]");
                metaObject.setValue("loginDate", LocalDateTime.now());
            }
        };
    }

}

