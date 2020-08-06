package com.itcast.demo.day10;


import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 代理类
 *
 * @author lichunmiao
 * @date 2020/6/17
 */
public class CalculateProxy {
    /**
     * 为传入的参数对象创建一个动态代理对象
     * @param calculate 被代理对象
     * @return 代理对象
     */
    public static CalculateProxy getProxy(Calculate calculate){
        ClassLoader classLoader = calculate.getClass().getClassLoader();
        Class[] interfaces = calculate.getClass().getInterfaces();
        /**
         * InvocationHandler
         * 方法执行器。帮助我们目标对象执行目标方法
         */
        Object proxy = Proxy.newProxyInstance(classLoader, interfaces, new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                /**
                 * proxy : 代理对象,给jdk使用,任何时候都不要动这个对象
                 * method: 当前将要执行的目标对象的方法
                 * args: 这个方法调用时,外界传入的参数值
                 * invoke:利用反射执行目标方法
                 * result: 目标方法执行后的返回值
                 */
                Object result = method.invoke(calculate, args);
                //返回值必须返回出去外界才能拿到真正执行后的返回值
                return result;
            }
        });
        return (CalculateProxy) proxy;
    }
}
