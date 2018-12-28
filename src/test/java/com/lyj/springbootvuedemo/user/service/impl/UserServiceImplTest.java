package com.lyj.springbootvuedemo.user.service.impl;

import com.lyj.springbootvuedemo.user.entity.User;
import com.lyj.springbootvuedemo.user.service.IUserService;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

@SpringBootTest
@RunWith(SpringRunner.class)
@Slf4j
public class UserServiceImplTest {

        @Autowired
        private IUserService iUserService;
    @Test
    public void addOneUser() {
    }

    @Test
    public void getUserById() {
    }

    @Test
    public void getUserList() {
        for (User user:iUserService.getUserList()
             ) {
      log.info(String.valueOf(user));
        }
        ;
    }

    @Test
    public void deleteUserById() {
    }
}