package com.itcast.demo;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.itcast.demo.day09.dao.EmployeeMapper;
import com.itcast.demo.day09.dao.KeyMapper;
import com.itcast.demo.day09.entity.Employee;
import com.itcast.demo.day09.entity.Key;
import com.itcast.demo.day09.entity.Person;
import com.itcast.demo.day10.CalculateIn;
import com.itcast.demo.day12.Calcalate;
import com.itcast.demo.day12.Calculator;
import com.sun.org.apache.bcel.internal.generic.NEW;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Map;

/**
 * 测试
 *
 * @author lichunmiao
 * @date 2020/6/1
 */

/**
 * 使用spring的单元测试
 * 1、导包:spring单元测试包
 * 2、@ContextConfiguration: 使用它来指定spring的配置文件的位置
 * 3、@RunWith:指定使用哪种驱动进行单元测试.默认就是junit
 * 使用spring 的单元测试模块来执行标注了@Test注解的测试方法
 */
@ContextConfiguration(locations = {"classpath:ioc.xml"})
@RunWith(SpringJUnit4ClassRunner.class)
public class TestDemo {

    @Autowired
    private Calculator calculator;
    @Test
    public void test01(){
        ClassPathXmlApplicationContext ioc = new ClassPathXmlApplicationContext("ioc.xml");
        Object person = ioc.getBean("person");
        System.out.println(person);

    }

    @Test
    public void test02(){
        System.out.println(calculator.getClass());
        int a = 1;
        int b = 2;
        int add = calculator.add(a, b);
        System.out.println(add);
    }

    @Test
    public void test03(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ioc.xml");
        Person person = context.getBean("person", Person.class);
        System.out.println(person);

    }


}
