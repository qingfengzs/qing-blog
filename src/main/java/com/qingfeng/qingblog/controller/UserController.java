package com.qingfeng.qingblog.controller;

import com.qingfeng.qingblog.model.User;
import com.qingfeng.qingblog.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/info")
    public User getUserInfoById(Integer id){
        return userService.getUserById(id);
    }
}
