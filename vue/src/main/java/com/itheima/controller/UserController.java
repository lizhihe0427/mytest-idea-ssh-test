package com.itheima.controller;

import com.itheima.domain.User;
import com.itheima.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


/**
 * @Author: lizhihe
 * @Date: 2019/2/27 8:58
 * @Version 1.0
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping(value = "/findAll",method = RequestMethod.GET)
    public List<User> findAll() {
        return userService.findAll();
    }

    /**
     * 主键查询
     * @param id
     * @return
     *
     */
    @RequestMapping(value = "/findById/{id}",method = RequestMethod.GET)
    public User findById(@PathVariable(value = "id") Integer id) {
        return userService.findById(id);
    }

    /**
     * 主键查询
     * @param id
     * @return
     */
    @RequestMapping(value = "/update",method = RequestMethod.POST)
    public void update(@RequestBody User user) {
        userService.update(user);
    }
}
