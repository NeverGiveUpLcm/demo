package com.itcast.demo.day09.dao;

import com.itcast.demo.day09.entity.Key;

import java.util.List;

/**
 * 钥匙dao
 *
 * @author lichunmiao
 * @date 2020/6/5
 */
public interface KeyMapper {

    Key selectById(int id);

    //查询钥匙信息的时候将锁信息也查询数据
    //按需加载:需要的时候再去查询锁信息;全局开启按需加载策略
    Key selectByIdSimple(int id);

    List<Key> getKeysByLockId(int id);
}
