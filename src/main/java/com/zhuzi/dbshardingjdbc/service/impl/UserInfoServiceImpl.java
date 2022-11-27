package com.zhuzi.dbshardingjdbc.service.impl;

import com.zhuzi.dbshardingjdbc.mapper.UserInfoMapper;
import com.zhuzi.dbshardingjdbc.model.UserInfo;
import com.zhuzi.dbshardingjdbc.service.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserInfoServiceImpl implements UserInfoService {

    @Autowired
    private UserInfoMapper userInfoMapper;

    @Override
    public int deleteByPrimaryKey(Long userId) {
        return userInfoMapper.deleteByPrimaryKey(userId) ;
    }

    @Override
    public int insert(UserInfo record) {
        return userInfoMapper.insert(record) ;
    }

    @Override
    public int insertSelective(UserInfo record) {
        return userInfoMapper.insertSelective(record) ;
    }

    @Override
    public UserInfo selectByPrimaryKey(Long userId) {
        return userInfoMapper.selectByPrimaryKey(userId);
    }

    @Override
    public int updateByPrimaryKeySelective(UserInfo record) {
        return userInfoMapper.updateByPrimaryKeySelective(record) ;
    }

    @Override
    public int updateByPrimaryKey(UserInfo record) {
        return userInfoMapper.updateByPrimaryKey(record) ;
    }
}
