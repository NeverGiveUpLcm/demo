package com.itcast.demo.day08.hashTable;

import org.junit.Test;

/**
 * @author lichunmiao
 * @date 2020/6/15
 */
public class DemoTest {
    @Test
    public void test(){
        HashTab hashTab = new HashTab(7);
        Employee employee = new Employee();
        employee.setId(1);
        employee.setName("张三");
        hashTab.add(employee);
        hashTab.traverse();

    }
}
