package com.qingfeng.qingblog.controller;

import com.qingfeng.qingblog.dto.UserRegisterDTO;
import com.qingfeng.qingblog.model.User;
import com.qingfeng.qingblog.service.UserService;
import com.qingfeng.qingblog.vo.ResultVO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.List;
import javax.validation.Valid;

/**
 * @author jinyu
 */

@Api(value = "用户", description = "用户控制器", position = 100, protocols = "http")
@RequestMapping("/user")
public class UserController extends BaseController{

    @Autowired
    private UserService userService;

    @ApiOperation(
            value = "获取用户信息",
            notes = "用于获取用户信息，参数是用户id，返回用户详细信息",
            produces = "application/json",
            consumes = "application/json",
            response = ResultVO.class
    )
    @GetMapping("/info")
    public User getUserInfoById(Integer id){
        return userService.getUserById(id);
    }

    @ApiOperation(
            value = "获取用户信息",
            notes = "用于获取用户信息，参数是用户id，返回用户详细信息",
            produces = "application/json",
            consumes = "application/json",
            response = ResultVO.class
    )
    @PostMapping("/login")
    public ResultVO login(@Validated User user, BindingResult result){
        if(result.hasErrors()){
            return new ResultVO(1001,"信息错误");
        }
        System.out.println("注册成功");
        return null;
    }

    @ApiOperation(
            value = "注册用户",
            notes = "用户注册方法",
            produces = "application/json",
            consumes = "application/json",
            response = ResultVO.class
    )
    @PostMapping("/register")
    public ResultVO register(@Valid UserRegisterDTO userRegisterDTO,BindingResult result){
        return null;
    }
}
