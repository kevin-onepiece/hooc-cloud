package com.kevin.provider.ucenter.server.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.kevin.hooc.common.bean.pojo.entity.ucenter.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

/**
 * @author:kevinfoo
 * @date:2020/10/15
 * @file:com.kevin.provider.ucenter.server.mapper
 */
@Component
public interface UserMapper extends BaseMapper<User> {
}
