package com.qingfeng.qingblog.controller;

import com.qingfeng.qingblog.dto.UserRegisterDTO;
import com.qingfeng.qingblog.model.User;
import com.qingfeng.qingblog.service.UserService;
import com.qingfeng.qingblog.vo.ResultVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/info")
    public User getUserInfoById(Integer id){
        return userService.getUserById(id);
    }

    @PostMapping("/login")
    public ResultVO login(@Validated User user, BindingResult result){
        if(result.hasErrors()){
            return new ResultVO(1001,"信息错误");
        }
        System.out.println("注册成功");
        return null;
    }

    @PostMapping("/register")
    public ResultVO register(@Valid UserRegisterDTO userRegisterDTO,BindingResult result){
        return null;
    }
}
