package com.zhuzi.dbshardingjdbc.service.impl;

import com.zhuzi.dbshardingjdbc.DbShardingJdbcApplicationTests;
import com.zhuzi.dbshardingjdbc.model.Shoping;
import com.zhuzi.dbshardingjdbc.service.service.ShopingService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

class ShopingServiceImplTest extends DbShardingJdbcApplicationTests {

    @Autowired
    private ShopingService shopingService;

    /**
     * 测试数据节点是否可用
     * **/
    @Test
    void insertSelective() {
        Shoping shoping = new Shoping();
        shoping.setShopingId(11111111L);
        shoping.setShopingName("黄金零号竹子");
        shoping.setShopingPrice(8888);
        shopingService.insertSelective(shoping);
    }

    /**
     * 测试分库策略是否有效
     * **/
    @Test
    void databaseStrategyInsert() {
        for (int i = 1; i <= 10; i++){
            Shoping shoping = new Shoping();
            shoping.setShopingId((long) i);
            shoping.setShopingName("黄金"+ i +"号竹子");
            shoping.setShopingPrice(1111 * i);
            shopingService.insertSelective(shoping);
        }
    }

    /**
     * 测试按商品名称的分表策略是否有效
     * **/
    @Test
    void tableStrategyInsert() {
        for (int i = 1; i <= 20; i++){
            Shoping shoping =
                    new Shoping((long) i, "白玉"+ i +"号竹子", i * 888);
            shopingService.insertSelective(shoping);
        }
    }

    /**
     * 根据商品ID查询单条数据
     * **/
    @Test
    void findByShopingID() {
        Shoping shoping = shopingService.selectByPrimaryKey(1L);
        System.out.println(shoping);
    }

    /**
     * 查询所有商品数据
     * **/
    @Test
    void queryAllShopingData() {
        List<Shoping> shopings = shopingService.getAll();
        shopings.forEach(System.out::println);
    }

    /**
     * 测试分布式序列算法 - 雪花算法的效果
     * **/
    @Test
    void insertSnowflake() {
        for (int i = 1; i <= 10; i++) {
            Shoping shoping = new Shoping();
            shoping.setShopingName("黄金"+ i +"号竹子");
            shoping.setShopingPrice(8888);
            shopingService.insertSelective(shoping);
        }
    }

}