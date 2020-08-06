package com.itcast.springcloud.controller;

import com.itcast.springcloud.entity.Dept;
import com.itcast.springcloud.service.DeptService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author lichunmiao
 * @date 2020/6/28
 */
@RestController
@RequestMapping("/dept")
public class DeptController {

    @Autowired
    private DeptService deptService;



    @GetMapping("/get/{id}")
    /**
     *  一旦调用服务方法失败并跑出了错误信息后,会自动调用@HystrixCommand标注好的fallbackMethod调用类中指定好的方法
     */
    @HystrixCommand(fallbackMethod="getFallBack")
    public Dept get(@PathVariable("id") Long id){

        Dept dept = deptService.get(id);
        if (dept == null){
            throw new RuntimeException("没有");
        }
        return dept;
    }

    /**
     * fallbackMethod对应的方法,要和调用服务方法参数保持一致
     */
    public Dept getFallBack(@PathVariable("id") Long id){
        Dept dept = new Dept();
        dept.setDname("没有");
        return dept;
    }
    @GetMapping("/list")
    public List<Dept> list(){
        return deptService.list();
    }

    public boolean add(@RequestBody Dept dept){
        return deptService.add(dept);
    }

    /**
     * 服务发现的客户端
     */
    @Autowired
    private DiscoveryClient discoveryClient;

    @GetMapping("/discovery")
    public Object discovery(){
        //获取eureka上所有的服务Id
        List<String> services = discoveryClient.getServices();
        System.out.println("*******" + services);
        //获取服务Id为 MICROSERVICECLOUD-DEPT的所有微服务实例
        List<ServiceInstance> instances = discoveryClient.getInstances("MICROSERVICECLOUD-DEPT");
        for (ServiceInstance instance : instances) {
            System.out.println(instance.getServiceId() + "\t" + instance.getPort() + "\t" + instance.getPort() + "\t" + instance.getUri());
        }
        return this.discoveryClient;

    }
}
