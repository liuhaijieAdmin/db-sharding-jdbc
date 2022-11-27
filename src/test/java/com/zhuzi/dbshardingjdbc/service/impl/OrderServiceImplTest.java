package com.zhuzi.dbshardingjdbc.service.impl;

import com.zhuzi.dbshardingjdbc.DbShardingJdbcApplicationTests;
import com.zhuzi.dbshardingjdbc.model.Order;
import com.zhuzi.dbshardingjdbc.model.OrderInfo;
import com.zhuzi.dbshardingjdbc.service.service.OrderInfoService;
import com.zhuzi.dbshardingjdbc.service.service.OrderService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

class OrderServiceImplTest extends DbShardingJdbcApplicationTests {

    @Autowired
    private OrderService orderService;

    @Autowired
    private OrderInfoService orderInfoService;


    /**
     * 测试绑定表的效果
     * **/
    @Test
    void orderOrOrderInfoInsert() {
        // 插入一条订单数据
        Order order = new Order();
        order.setUserId(111111L);
        order.setOrderPrice(100000);
        orderService.insertSelective(order);

        // 对同一笔订单插入三条订单详情数据
        for (int i = 1; i <= 3; i++) {
            OrderInfo orderInfo = new OrderInfo();
            // 前面插入订单的方法执行完成后会返回orderID
            orderInfo.setOrderId(order.getOrderId());
            orderInfo.setShopingName("黄金1号竹子");
            orderInfo.setShopingPrice(8888);

            orderInfoService.insertSelective(orderInfo);
        }

    }


}