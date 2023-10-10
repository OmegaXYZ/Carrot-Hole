package com.hust23se.carrothole;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.hust23se.carrothole"})
@MapperScan(basePackages = {"com.hust23se.carrothole.mapper"})
public class CarrotholeApplication {

    public static void main(String[] args) {
        SpringApplication.run(CarrotholeApplication.class, args);
    }

}
