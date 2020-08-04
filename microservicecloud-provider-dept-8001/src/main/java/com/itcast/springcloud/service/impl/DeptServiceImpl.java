package com.itcast.springcloud.service.impl;

import com.itcast.springcloud.dao.DeptDao;
import com.itcast.springcloud.entity.Dept;
import com.itcast.springcloud.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;

/**
 * @author lichunmiao
 * @date 2020/6/28
 */
@Service
public class DeptServiceImpl implements DeptService {
    @Autowired
    private DeptDao deptDao;

    @Override
    public Dept get(Long id) {
        Dept dept = new Dept();
        dept.setDeptno(1L);
        dept.setDname("8001");
        dept.setDb_source("dept1");
        return dept;
    }

    @Override
    public List<Dept> list() {
        return deptDao.findAll();
    }

    @Override
    public boolean add(Dept dept) {
        return deptDao.addDept(dept);
    }
}
