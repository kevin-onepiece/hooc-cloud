package com.kevin.provider.ucenter.server;

import com.kevin.hooc.common.bean.pojo.entity.ucenter.User;
import com.kevin.provider.ucenter.server.mapper.UserMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ProviderUcenterServerApplicationTests {

    @Autowired
    UserMapper userMapper;

    @Test
    void contextLoads() {
        User user = userMapper.selectById(13L);
        System.out.println("provider-ucenter-server : user is : " + user);
    }

}
