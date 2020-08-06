package com.itcast.springcloud.controller;

import com.itcast.springcloud.entity.Dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * 消费者controller
 *
 * @author lichunmiao
 * @date 2020/6/29
 */
@RestController
@RequestMapping("/consumer/dept")
public class DeptController_Consumer {
    //路径采用euraka上服务提供者的服务Id作为路径名
    private static final String URL_PREFIX = "http://MICROSERVICECLOUD-DEPT/dept/";
    /**
     * RestTemplate提供了多种便捷访问远程Http服务的方法
     * 是一种简单便捷的访问restful服务模板类,是spring提供的用于访问Rest服务的客户端模板工具集
     * (url、requestMap、ResponseBean.class)这三个参数分别代表
     * REST请求地址、请求参数、HTTP响应转换被转换成的对象类型
     */
    @Autowired
    private RestTemplate restTemplate;

    @PostMapping("/add")
    public boolean add(@RequestBody Dept dept) {
        return restTemplate.postForObject(URL_PREFIX + "dept/add", dept, Boolean.class);

    }

    @GetMapping("/get/{id}")
    public Dept get(@PathVariable("id") Long id) {
        return restTemplate.getForObject(URL_PREFIX + "get/" + id, Dept.class);
    }

    @GetMapping("/list")
    public List<Dept> list() {
        return restTemplate.getForObject(URL_PREFIX + "list", List.class);
    }
}
