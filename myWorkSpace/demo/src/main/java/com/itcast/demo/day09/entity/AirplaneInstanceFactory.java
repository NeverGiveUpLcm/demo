package com.itcast.demo.day09.entity;

/**
 * 实例工厂
 *
 * @author lichunmiao
 * @date 2020/6/16
 */
public class AirplaneInstanceFactory {
    public Airplane getAirplane(String jzName){
        return new Airplane();
    }
}
