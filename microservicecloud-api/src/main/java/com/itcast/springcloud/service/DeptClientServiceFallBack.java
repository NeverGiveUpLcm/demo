package com.itcast.springcloud.service;

import com.itcast.springcloud.entity.Dept;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author lichunmiao
 * @date 2020/8/4
 */
@Service
public class DeptClientServiceFallBack implements DeptClientService {
    @Override
    public boolean add(Dept dept) {
        return false;
    }

    @Override
    public Dept get(Long id) {
        return null;
    }

    @Override
    public List<Dept> list() {
        return null;
    }
}
