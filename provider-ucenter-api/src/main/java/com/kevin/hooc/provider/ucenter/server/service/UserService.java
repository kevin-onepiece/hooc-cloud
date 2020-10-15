package com.kevin.hooc.provider.ucenter.server.service;

import com.kevin.hooc.common.bean.pojo.entity.ucenter.User;
import com.kevin.hooc.common.bean.pojo.qo.ucenter.LoginUserQO;

/**
 * @author:kevinfoo
 * @date:2020/10/15
 * @file:com.kevin.ucenter.api.service
 */
public interface UserService {
    User addUser(LoginUserQO loginUserQO);
}
