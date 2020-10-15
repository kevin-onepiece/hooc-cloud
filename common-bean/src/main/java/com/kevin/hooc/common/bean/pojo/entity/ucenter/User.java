package com.kevin.hooc.common.bean.pojo.entity.ucenter;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;

/**
 * @author:kevinfoo
 * @date:2020/10/15
 * @file:com.kevin.common.bean.pojo.entity.qo.ucenter
 */
@TableName("hooc_user")
@Data
public class User implements Serializable {

    @TableId("user_id")
    private Long userId;
    @TableField("user_name")
    private String userName;
    @TableField("user_password")
    private String password;
    @TableField("user_phone")
    private Long phone;
    @TableField("user_email")
    private String email;
    @TableField("user_sex")
    private String sex;

}
