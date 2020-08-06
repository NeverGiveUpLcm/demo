package com.itcast.demo.day09.entity;

import lombok.Data;

/**
 * 钥匙
 *
 * @author lichunmiao
 * @date 2020/6/5
 */
@Data
public class Key {
    private int id;
    private String keyName;
    //一把钥匙一把锁
    private Lock lock;

}
