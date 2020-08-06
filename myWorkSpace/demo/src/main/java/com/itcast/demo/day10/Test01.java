package com.itcast.demo.day10;

import org.junit.Test;

import java.util.Arrays;

/**
 * @author lichunmiao
 * @date 2020/6/28
 */
public class Test01 {

    @Test
    public void test02(){
        String url = "http://cmstest.cntv.cn/2012/08/01/ARTI1343804166821433.shtml";
        String[] split = url.split("/");
        System.out.println(Arrays.asList(split));
        String dateTime = new StringBuilder().append(split[3]).append("/").append(split[4]).append("/").append(split[5]).toString();
        System.out.println(dateTime);
    }
}
