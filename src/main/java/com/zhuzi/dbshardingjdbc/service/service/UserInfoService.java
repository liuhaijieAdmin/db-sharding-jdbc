package com.zhuzi.dbshardingjdbc.service.service;


import com.zhuzi.dbshardingjdbc.model.UserInfo;

public interface UserInfoService {
    int deleteByPrimaryKey(Long userId);

    int insert(UserInfo record);

    int insertSelective(UserInfo record);

    UserInfo selectByPrimaryKey(Long userId);

    int updateByPrimaryKeySelective(UserInfo record);

    int updateByPrimaryKey(UserInfo record);
}
