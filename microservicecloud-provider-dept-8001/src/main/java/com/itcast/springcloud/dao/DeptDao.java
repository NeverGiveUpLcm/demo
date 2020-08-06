package com.itcast.springcloud.dao;

import com.itcast.springcloud.entity.Dept;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * 部门dao
 *
 * @author lichunmiao
 * @date 2020/6/28
 */
public interface DeptDao {
    boolean addDept(Dept dept);

    Dept findById(Long id);

    List<Dept> findAll();
}
