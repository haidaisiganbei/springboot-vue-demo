package com.lyj.springbootvuedemo.user.service.impl;


import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.lyj.springbootvuedemo.user.entity.User;
import com.lyj.springbootvuedemo.user.mapper.UserMapper;
import com.lyj.springbootvuedemo.user.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 * 服务实现类
 * </p>
 *
 * @author Lyj
 * @since 2018-12-27
 */
@Service
public class UserServiceImpl implements IUserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public int addOneUser(User user) {
        return userMapper.insert(user);
    }

    @Override
    public User getUserById(Long id) {
        return userMapper.selectById(id);
    }

    @Override
    public List<User> getUserList() {
        return userMapper.selectList(null);
    }

    @Override
    public void deleteUserById(Long id) {
        userMapper.deleteById(id);
    }

    @Override
    public User getUserByName(String name) {
        Wrapper<User> wrapper = new QueryWrapper<>();
        ((QueryWrapper<User>) wrapper).eq("name", name);
        return userMapper.selectOne(wrapper);
    }

    @Override
    public User getUserByNameAndPassword(String name, String password) {
        Wrapper<User> wrapper = new QueryWrapper<>();
        ((QueryWrapper<User>) wrapper).eq("name", name);
        ((QueryWrapper<User>) wrapper).eq("password", password);
        return userMapper.selectOne(wrapper);
    }
}
