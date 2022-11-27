package com.zhuzi.dbshardingjdbc.service.impl;

import com.zhuzi.dbshardingjdbc.mapper.ShopingMapper;
import com.zhuzi.dbshardingjdbc.model.Shoping;
import com.zhuzi.dbshardingjdbc.service.service.ShopingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ShopingServiceImpl implements ShopingService {


    @Autowired
    private ShopingMapper shopingMapper;

    @Override
    public int deleteByPrimaryKey(Long shopingId) {
        return shopingMapper.deleteByPrimaryKey(shopingId);
    }

    @Override
    public int insert(Shoping record) {
        return shopingMapper.insert(record);
    }

    @Override
    public int insertSelective(Shoping record) {
        return shopingMapper.insertSelective(record);
    }

    @Override
    public Shoping selectByPrimaryKey(Long shopingId) {
        return shopingMapper.selectByPrimaryKey(shopingId);
    }

    @Override
    public int updateByPrimaryKeySelective(Shoping record) {
        return shopingMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Shoping record) {
        return shopingMapper.updateByPrimaryKey(record);
    }

    @Override
    public List<Shoping> getAll() {
        return shopingMapper.getAll();
    }
}
