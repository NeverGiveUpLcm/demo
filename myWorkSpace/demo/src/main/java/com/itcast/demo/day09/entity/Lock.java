package com.itcast.demo.day09.entity;

import lombok.Data;

import java.security.KeyStore;
import java.util.List;

/**
 * 锁
 *
 * @author lichunmiao
 * @date 2020/6/5
 */
@Data
public class Lock {
    private int id;
    private String lockName;
    private List<Key> keys;


}
