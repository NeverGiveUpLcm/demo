package com.itcast.springcloud.service.impl;

import com.itcast.springcloud.dao.DeptDao;
import com.itcast.springcloud.entity.Dept;
import com.itcast.springcloud.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.LinkedList;
import java.util.List;

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
        if (id == 99) {
            return null;
        }
        Dept dept = new Dept();
        dept.setDeptno(1L);
        dept.setDname("8003");
        dept.setDb_source("dept1");
        return dept;
    }

    @Override
    public List<Dept> list() {
        LinkedList<Dept> depts = new LinkedList<>();
        Dept dept = new Dept();
        dept.setDeptno(1L);
        dept.setDname("8003");
        dept.setDb_source("dept1");
        Dept dept1 = new Dept();
        dept.setDeptno(2L);
        dept.setDname("8003");
        dept.setDb_source("dept1");
        depts.add(dept);
        depts.add(dept1);
        return depts;
    }

    @Override
    public boolean add(Dept dept) {
        return deptDao.addDept(dept);
    }
}
