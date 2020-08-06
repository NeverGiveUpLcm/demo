package com.itcast.demo.day09.dao;


import com.itcast.demo.day09.entity.Lock;

/**
 * @author lichunmiao
 * @date 2020/6/5
 */
public interface LockMapper {
    Lock getLockById(int id);

    Lock getLockByIdBtStep(int id);
}
