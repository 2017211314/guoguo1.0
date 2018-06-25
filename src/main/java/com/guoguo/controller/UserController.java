package com.guoguo.controller;

import com.guoguo.common.utils.Response;
import com.guoguo.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Author: liuda
 * @CreateDate: 2018/6/25$ 19:06$
 * @Description:
 */
@Controller
@Api(description = "用户管理")
public class UserController {

    @Autowired
    UserService userService;

    @ApiOperation(value = "添加用户信息",httpMethod ="POST", notes = "用户管理")
    @PostMapping(value = "/userManage/addUserInfo")
    public Response addUserInfo(){

        return Response.from(1,"注册成功");

    }

}
