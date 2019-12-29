package com.qingfeng.qingblog.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@ApiResponses({
        @ApiResponse(code = 100, message = "请求参数有误"),
        @ApiResponse(code = 101, message = "未授权"),
        @ApiResponse(code = 103, message = "禁止访问"),
        @ApiResponse(code = 104, message = "请求路径不存在"),
        @ApiResponse(code = 200, message = "服务器内部错误")
})
public class BaseController {

}
