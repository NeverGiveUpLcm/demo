package com.itcast.demo.day10;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * 切面类
 *
 * @author lichunmiao
 * @date 2020/6/18
 */
@Component
@Aspect
@Order(2) //使用order改变切面熟顺序,数值越小,优先级越高


public class ValidateUtils {

    /**
     * 告诉spring每个方法都什么时候运行
     *
     * @Before(): 在目标方法之前运行       前置通知
     * @After(): 在目标方法结束之后运行    后置通知
     * @AfterThrowing: 在目标方法抛出异常之后运行     异常通知
     * @AfterReturning: 在目标方法正常返回之后运行    返回通知
     * @Around() : 环绕通知
     */

    /**
     * 我们可以在通知方法运行的时候,拿到目标方法的详细信息
     * 1)、只需要为通知方法的参数列表上写一个参数
     * JoinPoint joinPoint :封装了当前目标方法的详细信息
     */


    /**
     * 抽取可重用的切入点表达式:
     * 1、随便声明一个没有实现的返回void的空方法
     * 2、给方法上标注@Pointcut注解
     * 3、通知注解的value属性写入方法名即可
     */
    @Pointcut("execution(* com.itcast.demo.day10.*.*(..))")
    public void point() {

    }

    @Before("point()")

    public void before(JoinPoint joinPoint) {
        System.out.println("前置通知");
    }

    @AfterReturning(value = ("execution(public int com.itcast.demo.day10.Calculate.*(int ,*))"), returning = "result")
    public void after(JoinPoint joinPoint, Object result) {
        System.out.println("返回通知");
    }

    /**
     * 告诉spring哪个参数用来接收异常返回信息
     * throwing = "exception"
     */
    @AfterThrowing(value = ("execution(public int com.itcast.demo.day10.Calculate.*(int ,*))"), throwing = "exception")
    public void exception(JoinPoint joinPoint, Exception exception) {
        System.out.println("异常通知");
    }

    @After(value = ("execution(public int com.itcast.demo.day10.Calculate.*(int ,*))"))
    public void end() {
        System.out.println("最终通知");
    }

    /**
     * 环绕通知是spring中最强大的通知
     * 前置、后缀、返回和异常通知四合一就是环绕通知
     * 环绕通知中有一个参数:
     * ProceedingJoinPoint proceedingJoinPoint
     * 环绕通知其实就相当于一个完整的动态代理
     */
    @Around("point()")
    public Object around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        Object result = null;
        try {
            Object[] args = proceedingJoinPoint.getArgs();
            System.out.println("方法运行之前的前置通知");
            //就是利用反射调用目标方法,相当于method.invoke();
            result = proceedingJoinPoint.proceed(args);
            System.out.println("方法运行之后的返回通知");
        } catch (Exception e) {
            System.out.println("异常通知");
            //为了让外界能感知这个异常,我们需要将这个异常抛出去
            throw new RuntimeException(e);
        } finally {
            System.out.println("这是后置通知");
        }
        return result;
    }

    public void transaction() {
        //编程式事务
        try {
            //获取连接
            //设置非自动提交
            //方法执行
            //提交事务
        } catch (Exception e) {
            //回滚
        } finally {
            //关闭连接释放资源
        }
    }


}
