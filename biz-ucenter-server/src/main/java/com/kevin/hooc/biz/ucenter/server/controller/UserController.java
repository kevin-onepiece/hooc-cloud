package com.kevin.hooc.biz.ucenter.server.controller;

import com.kevin.hooc.common.bean.pojo.qo.ucenter.LoginUserQO;
import com.kevin.hooc.provider.ucenter.server.service.UserService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author:kevinfoo
 * @date:2020/10/14
 * @file:com.kevin.biz.ucenter.server.controller
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Reference
    private UserService userService;

    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public void register(String value) {
        userService.addUser(new LoginUserQO());
        System.out.println("value is : " + value);
    }

}
