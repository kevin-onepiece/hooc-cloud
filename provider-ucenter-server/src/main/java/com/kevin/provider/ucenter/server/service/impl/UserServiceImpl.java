package com.kevin.provider.ucenter.server.service.impl;

import com.kevin.hooc.common.bean.pojo.entity.ucenter.User;
import com.kevin.hooc.common.bean.pojo.qo.ucenter.LoginUserQO;
import com.kevin.hooc.provider.ucenter.server.service.UserService;
import org.apache.dubbo.config.annotation.Service;

/**
 * @author:kevinfoo
 * @date:2020/10/15
 * @file:com.kevin.provider.ucenter.server.service.impl
 */
@Service
public class UserServiceImpl implements UserService {

    @Override
    public User addUser(LoginUserQO loginUserQO) {
        System.out.println("in provider.ucenter.server : hello");
        return null;
    }
}
