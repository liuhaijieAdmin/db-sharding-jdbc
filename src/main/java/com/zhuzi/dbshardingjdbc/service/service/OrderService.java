package com.zhuzi.dbshardingjdbc.service.service;


import com.zhuzi.dbshardingjdbc.model.Order;

public interface OrderService {
    int deleteByPrimaryKey(Long orderId);

    int insert(Order record);

    int insertSelective(Order record);

    Order selectByPrimaryKey(Long orderId);

    int updateByPrimaryKeySelective(Order record);

    int updateByPrimaryKey(Order record);
}
