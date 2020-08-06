package com.itcast.demo.day05;

import org.apache.ibatis.type.Alias;
import redis.clients.jedis.Jedis;

/**
 * @author lichunmiao
 * @date 2020/5/4
 */
//我们可以通过在类上添加注解来为类起别名
@Alias(value = "demo")
public class Demo01 {
    public static void main(String[] args) {

        Jedis jedis = new Jedis("127.0.0.1", 6739);
        jedis.set("name","tom");
        String name = jedis.get("name");
        jedis.close();
    }
}
