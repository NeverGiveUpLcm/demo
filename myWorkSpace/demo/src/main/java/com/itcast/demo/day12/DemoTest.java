package com.itcast.demo.day12;

import java.sql.Timestamp;

/**
 * @author lichunmiao
 * @date 2020/7/8
 */
public class DemoTest {
    public static void main(String[] args) {

        Person person = new Person();
        person.setTime(new Timestamp(System.currentTimeMillis()));
    }
}
