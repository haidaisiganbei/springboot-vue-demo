package com.lyj.springbootvuedemo.user.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.lyj.springbootvuedemo.user.entity.User;

import java.util.List;


/**
 * <p>
 *  服务类
 * </p>
 *
 * @author Lyj
 * @since 2018-12-27
 */
public interface IUserService  {

    //    注册用户
    int addOneUser(User user);
    //     查看用户信息
    User getUserById(Long id);
    //      用户列表
   List<User> getUserList();

    //  删除用户
    void deleteUserById(Long id);

    User getUserByName(String name);


    User getUserByNameAndPassword(String name, String password);

}
