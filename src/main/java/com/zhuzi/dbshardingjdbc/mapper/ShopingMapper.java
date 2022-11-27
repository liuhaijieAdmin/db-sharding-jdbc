package com.zhuzi.dbshardingjdbc.mapper;

import com.zhuzi.dbshardingjdbc.model.Shoping;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface ShopingMapper {
    int deleteByPrimaryKey(Long shopingId);

    int insert(Shoping record);

    int insertSelective(Shoping record);

    Shoping selectByPrimaryKey(Long shopingId);

    int updateByPrimaryKeySelective(Shoping record);

    int updateByPrimaryKey(Shoping record);

    List<Shoping> getAll();
}