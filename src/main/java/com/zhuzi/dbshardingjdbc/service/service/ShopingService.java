package com.zhuzi.dbshardingjdbc.service.service;

import com.zhuzi.dbshardingjdbc.model.Shoping;

import java.util.List;

public interface ShopingService {

    int deleteByPrimaryKey(Long shopingId);

    int insert(Shoping record);

    int insertSelective(Shoping record);

    Shoping selectByPrimaryKey(Long shopingId);

    int updateByPrimaryKeySelective(Shoping record);

    int updateByPrimaryKey(Shoping record);

    List<Shoping> getAll();

}
