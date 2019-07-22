package com.code.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class FilmAspect {

    @Pointcut(value = "@annotation(com.code.annotation.FilmAnnotation)")
    public void access() {

    }

    @Before("access()")
    public void deBefore(JoinPoint joinPoint) throws Throwable {
        System.out.println("Before Insert Film Data");
    }

    @After("access()")
    public void doAfter(JoinPoint joinPoint) throws Throwable {
        System.out.println("After Insert Film Data");
    }

}
