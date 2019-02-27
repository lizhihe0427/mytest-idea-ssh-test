package com.itheima.service.Impl;

import com.itheima.dao.UserDao;
import com.itheima.domain.User;
import com.itheima.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @Author: lizhihe
 * @Date: 2019/2/27 8:54
 * @Version 1.0
 */
@Service
@Transactional
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public List<User> findAll() {
        return userDao.findAll();
    }

    @Override
    public User findById(Integer id) {
        return userDao.findOne(id);
    }

    @Override
    public void update(User user) {
        //有id就更新 没id就新增
        userDao.save(user);
    }


}
