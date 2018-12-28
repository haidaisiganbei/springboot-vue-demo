package com.lyj.springbootvuedemo.user.controller;


import com.lyj.springbootvuedemo.user.entity.User;
import com.lyj.springbootvuedemo.user.service.IUserService;
import lombok.extern.slf4j.Slf4j;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


/**
 * <p>
 * 前端控制器
 * </p>
 *
 * @author Lyj
 * @since 2018-12-27
 */
@RestController
@RequestMapping("/user")
@Slf4j
public class UserController {

    @Autowired
    private IUserService iUserService;

    @RequestMapping("/login")
    public String login() {
        return "login";
    }

    @RequestMapping("/loginAction")
    public String loginAction(String name, String password) {
        Subject subject = SecurityUtils.getSubject();
        AuthenticationToken token = new UsernamePasswordToken(name, password);
        try {
            subject.login(token);
        } catch (Exception e) {
            log.info("登录失败.....");
        }
        return "loginAction";
    }


    @PostMapping(value = "/registerUser")
    public String registerUser(@RequestBody User user) {
        log.info(String.valueOf(user));
        if (iUserService.addOneUser(user) == 1) {
            return "success";
        } else {
            return "fail";
        }
    }

    @RequestMapping(value = "/getUserById")
    public User getUserById(@RequestParam("id") Long id) {
        return iUserService.getUserById(id);
    }

    @RequestMapping(value = "/getUserList")
    public List<User> getUserList() {
        return iUserService.getUserList();
    }

    @RequestMapping(value = "/deleteUserById")
    public void deleteUserById(@RequestParam("id") Long id) {
        iUserService.deleteUserById(id);
    }
}
