package com.itheima.service;

import com.itheima.domain.User;

import java.util.List;

/**
 * @Author: lizhihe
 * @Date: 2019/2/27 8:53
 * @Version 1.0
 */
public interface UserService {
    //查询所有
    List<User>findAll();

    User findById( Integer id);

    void update(User user);
}
