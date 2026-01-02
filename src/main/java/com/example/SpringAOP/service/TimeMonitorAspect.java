package com.example.SpringAOP.service;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.context.annotation.Configuration;

@Aspect
@Configuration
public class TimeMonitorAspect {

    @Around("@annotation(com.example.SpringAOP.service.TimeMonitor)")
    public Object logTime(ProceedingJoinPoint joinPoint) throws Throwable {

        long start = System.currentTimeMillis();

        Object result = joinPoint.proceed();

        long end = System.currentTimeMillis();

        System.out.println("total time taken to execute code " + (end - start));

        return result;







    }
}
