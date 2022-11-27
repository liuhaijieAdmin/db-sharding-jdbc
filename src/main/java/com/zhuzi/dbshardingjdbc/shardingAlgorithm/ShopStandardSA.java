package com.zhuzi.dbshardingjdbc.shardingAlgorithm;

import org.apache.shardingsphere.sharding.api.sharding.standard.PreciseShardingValue;
import org.apache.shardingsphere.sharding.api.sharding.standard.RangeShardingValue;
import org.apache.shardingsphere.sharding.api.sharding.standard.StandardShardingAlgorithm;

import java.math.BigInteger;
import java.util.Collection;
import java.util.Properties;

// 商品表的Standard分库策略
public class ShopStandardSA implements StandardShardingAlgorithm {

    // 实现精确查询的方法（in、=查询会调用方法）
    @Override
    public String doSharding(Collection collection, PreciseShardingValue psv) {
        // 获取逻辑表名：shoping
        String logicTableName = psv.getLogicTableName();
        // 获取路由键：psv.getColumnName()
        // 获取本次SQL语句中具体的路由键值
        long shopingID = (Long)psv.getValue();
        // 将获取到的long值转换为BigInteger数值
        BigInteger shopIdBI = BigInteger.valueOf(shopingID);
        // 通过获取到的ID值对2取模，计算出目标表的后缀
        BigInteger target = shopIdBI.mod(new BigInteger("2"));
        // 拼接上逻辑表名作为前缀，得到最终的目标表名
        String targetTable = logicTableName + "_0" + target;
        // 判断计算出的目标表是否在Logic_DB中存在
        if (collection.contains(target))
            // 如果配置的数据节点中有这张表，则直接返回目标表名
            return targetTable;
        // 不存在则抛出相应的异常信息
        throw new UnsupportedOperationException(targetTable +
                "表在逻辑库中不存在，请检查你的SQL语句或数据节点配置...");
    }

    // 实现范围查询的方法
    @Override
    public Collection<String> doSharding(Collection collection, RangeShardingValue rsv) {
        // 这里实现范围查询具体的处理逻辑....

        // 直接返回查询所有数据节点
        return collection;
    }

    @Override
    public Properties getProps() {
        return null;
    }

    // 初始化方法
    @Override
    public void init(Properties properties) {
        System.out.println("正在使用自定义的Standard分片算法......");
    }
}
