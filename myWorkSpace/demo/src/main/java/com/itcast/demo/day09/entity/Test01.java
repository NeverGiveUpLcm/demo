package com.itcast.demo.day09.entity;

import java.util.HashMap;

/**
 * @author lichunmiao
 * @date 2020/6/17
 */
public class Test01 {
    public static void main(String[] args) {
        HashMap<String, Object> map = new HashMap<>();
        map.put("message","OK");
        if ("OK".equals(map.get("message"))){
            System.out.println("11111");
        }
    }
}
