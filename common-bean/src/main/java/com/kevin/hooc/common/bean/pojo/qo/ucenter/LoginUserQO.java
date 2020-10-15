package com.kevin.hooc.common.bean.pojo.qo.ucenter;

import lombok.Data;

import java.io.Serializable;

/**
 * @author:kevinfoo
 * @date:2020/10/15
 * @file:PACKAGE_NAME
 */
@Data
public class LoginUserQO implements Serializable {

    private String nickName;
    private String password;

}
