package com.itcast.springcloud.service;

import com.itcast.springcloud.entity.Dept;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

/**
 * @author lichunmiao
 * @date 2020/7/1
 * fallbackFactory属性:降级处理的类
 */
@FeignClient(value = "MICROSERVICECLOUD-DEPT",fallback = DeptClientServiceFallBack.class)
public interface DeptClientService {

    @PostMapping("/dept/add")
    boolean add(Dept dept);

    @GetMapping("/dept/get/{id}")
    Dept get(@PathVariable("id") Long id);

    @GetMapping("dept/list")
    List<Dept> list();
}
