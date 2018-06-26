package com.guoguo.controller;

import com.guoguo.common.utils.Response;
import com.guoguo.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.*;
import org.apache.shiro.subject.Subject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Author: liuda
 * @CreateDate: 2018/6/25 19:06
 * @Description:
 */
@Controller
@Api(description = "用户管理")
public class UserController {
    private final Logger logger = LoggerFactory.getLogger(UserController.class);

    @Autowired
    UserService userService;

    @ApiOperation(value = "用户注册",httpMethod ="POST", notes = "user")
    @PostMapping("/doRegister")
    @ResponseBody
    public String doRegister(@ApiParam(value = "用户名",required = true)@RequestParam("username") String username,
                             @ApiParam(value = "密码",required = true)@RequestParam("password") String password,@ApiParam(value = "手机号",required = true)@RequestParam("phone") String phone) {

        logger.info("go doRegister,username:{}",username);
        boolean result = userService.registerUserInfo(username, password, phone);
        if(result){
            System.out.println("注册成功");
        }else {
            System.out.println("注册失败");
        }
        return "";
    }

    @ApiOperation(value = "用户登录",httpMethod ="POST", notes = "user")
    @PostMapping("/doLogin")
    @ResponseBody
    public Response doLogin(@ApiParam(value = "用户名",required = true) @RequestParam("username") String username,
                          @ApiParam(value = "密码",required = true)@RequestParam("password") String password) {
        // 创建Subject实例
        Subject currentUser = SecurityUtils.getSubject();
        // 将用户名及密码封装到UsernamePasswordToken
        UsernamePasswordToken token = new UsernamePasswordToken(username, password);

        try {
            currentUser.login(token);
        }catch(UnknownAccountException uae){
            return Response.failed("未知账户！");
        }catch(IncorrectCredentialsException ice){
            return Response.failed("密码不正确！");
        }catch(LockedAccountException lae){
            return Response.failed("账户已锁定！");
        }catch(ExcessiveAttemptsException eae){
            return Response.failed("用户名或密码错误次数过多！");
        }catch(AuthenticationException ae){
            ae.printStackTrace();
            return Response.failed("用户名或密码不正确！");
        }
        //验证是否登录成功
        if(currentUser.isAuthenticated()){
            return Response.from(1,"登录成功");
        }else{
            token.clear();
            return Response.from(-1,"登录失败");
        }
    }
}
