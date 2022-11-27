package com.zhuzi.dbshardingjdbc.service.service;


import com.zhuzi.dbshardingjdbc.model.OrderInfo;

public interface OrderInfoService {

    int deleteByPrimaryKey(Long orderInfoId);

    int insert(OrderInfo record);

    int insertSelective(OrderInfo record);

    OrderInfo selectByPrimaryKey(Long orderInfoId);

    int updateByPrimaryKeySelective(OrderInfo record);

    int updateByPrimaryKey(OrderInfo record);

}
