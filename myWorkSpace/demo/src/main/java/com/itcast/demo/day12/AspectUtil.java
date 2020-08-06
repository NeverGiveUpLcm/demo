package com.itcast.demo.day12;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.Arrays;

/**
 * 切面类
 *
 * @author lichunmiao
 * @date 2020/7/1
 */
//@Component
//@Aspect
//@Order(1)
public class AspectUtil {

    @Pointcut("execution(public * com.itcast.demo.day12.*.*(..)))")
    public void pointCut(){

    }

    @Before("pointCut()")
    public void before(JoinPoint joinPoint){
        Object[] args = joinPoint.getArgs();
        System.out.println(Arrays.asList(args));
        Signature signature = joinPoint.getSignature();
        System.out.println(signature.getName());

        System.out.println("计算之前先运行-------------------------");
    }

    @AfterReturning(value = "pointCut()",returning = "result")
    public void afterReturning(JoinPoint joinPoint,Object result){
        Object[] args = joinPoint.getArgs();
        System.out.println(Arrays.asList(args));
        Signature signature = joinPoint.getSignature();
        System.out.println(signature.getName());

        System.out.println("结果为：" + result);
        System.out.println("计算结果返回之前先运行-------------------------");
    }

    @After("pointCut()")
    public void after(JoinPoint joinPoint){
        Object[] args = joinPoint.getArgs();
        System.out.println(Arrays.asList(args));
        Signature signature = joinPoint.getSignature();
        System.out.println(signature.getName());
        System.out.println("计算结果最终返回之前先运行-------------------------");
    }

    @AfterThrowing(value = "pointCut()",throwing = "e" )
    public void afterThrowing(JoinPoint joinPoint,Exception e){
        Object[] args = joinPoint.getArgs();
        System.out.println(Arrays.asList(args));
        Signature signature = joinPoint.getSignature();
        System.out.println(signature.getName());
        System.out.println("计算结果出现异常先运行-------------------------");
    }

    @Around("pointCut()")
    public int circle(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("环绕前置");
        Object[] args = proceedingJoinPoint.getArgs();
        Object proceed = proceedingJoinPoint.proceed(args);
        System.out.println("环绕返回");
        System.out.println("环绕最终");
        System.out.println(proceed);
        return (int) proceed;
    }

}
