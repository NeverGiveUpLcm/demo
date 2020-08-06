package com.itcast.springcloud.service;

import com.itcast.springcloud.entity.Dept;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

import java.util.LinkedList;
import java.util.List;

/**
 * @author lichunmiao
 * @date 2020/7/1
 * 根据已经有的DeptClientService接口,新建一个实现了FallbackFactory接口的类DeptClientServiceFallBackFactory
 * 不要忘记在实现类上添加@Component注解,不然不会生效
 */
@Component
public class DeptClientServiceFallBackFactory implements FallbackFactory<DeptClientService> {
    @Override
    public DeptClientService create(Throwable throwable) {
        return new DeptClientService() {
            @Override
            public boolean add(Dept dept) {
                return false;
            }
            @Override
            public Dept get(Long id) {
                Dept dept = new Dept();
                dept.setDname("降级");
                return dept;
            }
            @Override
            public List<Dept> list() {
                return new LinkedList<>();
            }
        };
    }
}
