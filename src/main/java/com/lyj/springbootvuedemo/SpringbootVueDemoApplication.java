package com.lyj.springbootvuedemo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.lyj.springbootvuedemo.mapper")
public class SpringbootVueDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootVueDemoApplication.class, args);
    }

}

