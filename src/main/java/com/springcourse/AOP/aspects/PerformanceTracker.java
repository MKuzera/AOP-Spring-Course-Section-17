package com.springcourse.AOP.aspects;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;
@Aspect
@Configuration
public class PerformanceTracker {
    private Logger logger = LoggerFactory.getLogger(getClass());

    @Around("execution(* com.springcourse.AOP.Bussines.*.*(..))")
    public Object findExecTime(ProceedingJoinPoint joinPoint) throws Throwable {
        long start = System.currentTimeMillis();

        Object returnVal = joinPoint.proceed();

        long end = System.currentTimeMillis();
        long duration = end - start;
        logger.info("Around Time Method: {}  Time: {}",joinPoint,duration);

        return returnVal;
    }
}
