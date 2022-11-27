package com.zhuzi.dbshardingjdbc.service.impl;

import com.zhuzi.dbshardingjdbc.DbShardingJdbcApplicationTests;
import com.zhuzi.dbshardingjdbc.model.UserInfo;
import com.zhuzi.dbshardingjdbc.service.service.UserInfoService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

class UserInfoServiceImplTest extends DbShardingJdbcApplicationTests {

    @Autowired
    private UserInfoService userInfoService;

    @Test
    void insertSelective() {
        // 插入三条性别为男的用户数据
        for (int i = 1; i <= 3; i++){
            UserInfo userInfo = new UserInfo();
            userInfo.setUserName("竹子" + i + "号");
            userInfo.setUserAge(18 + i);
            userInfo.setUserSex("男");
            userInfoService.insertSelective(userInfo);
        }

        // 插入两条性别为女的用户数据
        for (int i = 1; i <= 2; i++){
            UserInfo userInfo = new UserInfo();
            userInfo.setUserName("熊猫" + i + "号");
            userInfo.setUserAge(18 + i);
            userInfo.setUserSex("女");
            userInfoService.insertSelective(userInfo);
        }
    }

    @Test
    void selectByPrimaryKey() {
        UserInfo userInfo = userInfoService.selectByPrimaryKey(74L);
        System.out.println(userInfo);
    }
}