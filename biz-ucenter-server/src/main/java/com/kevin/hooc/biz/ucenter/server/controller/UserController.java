package com.kevin.hooc.biz.ucenter.server.controller;

import com.kevin.hooc.common.bean.pojo.entity.ucenter.User;
import com.kevin.provider.ucenter.server.mapper.UserMapper;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.RequestMapping;
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
    private UserMapper userMapper;

    @RequestMapping("/register")
    public void register(String value) {
        User user = userMapper.selectById(13L);
        System.out.println("user is : " + user);
        System.out.println("value is : " + value);
    }

}
