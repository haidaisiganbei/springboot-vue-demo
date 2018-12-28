package com.lyj.springbootvuedemo.user.service;

import com.lyj.springbootvuedemo.user.entity.User;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class IUserServiceTest {

    @Autowired
    private IUserService userService;

    @Test
    public void addOneUser() {
    }

    @Test
    public void getUserById() {
    }

    @Test
    public void getUserList() {
    }

    @Test
    public void deleteUserById() {
    }

    @Test
    public void getUserByName() {

        User user = userService.getUserByName("Lyj");
        log.info(String.valueOf(user));
    }

    @Test
    public void getUserByNameAndPassword() {
        log.info(String.valueOf(userService.getUserByNameAndPassword("abc", "123")));
    }
}