package com.itcast.demo.day09.entity;

/**
 * 静态工厂
 *
 * @author lichunmiao
 * @date 2020/6/16
 */
public class AirplaneStaticFactory {

    public static Airplane getAirplane(String jzName){
        return new Airplane();
    }
}
