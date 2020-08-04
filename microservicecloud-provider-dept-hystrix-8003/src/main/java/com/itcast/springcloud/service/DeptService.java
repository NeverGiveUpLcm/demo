package com.itcast.springcloud.service;

import com.itcast.springcloud.entity.Dept;

import java.util.List;

/**
 * @author lichunmiao
 * @date 2020/6/28
 */
public interface DeptService {
    Dept get(Long id) ;

    List<Dept> list();

    boolean add(Dept dept);
}
