package com.springcourse.AOP.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

@Configuration
@Aspect
public class LoggingAspect {

    private Logger logger = LoggerFactory.getLogger(getClass());
    @Before("com.springcourse.AOP.aspects.CommonPointCutConfig.service()")
    public void logBeforeMethodCall(JoinPoint joinPoint){
        logger.info("Before Aspect - Method is called - {} with arguments",joinPoint,joinPoint.getArgs());
    }

    @After("com.springcourse.AOP.aspects.CommonPointCutConfig.businessPackageConfig()")
    public void logAfterMethodCall(JoinPoint joinPoint){
        logger.info("After  Aspect - Method is called - {} with arguments",joinPoint,joinPoint.getArgs());
    }

    @AfterReturning("com.springcourse.AOP.aspects.CommonPointCutConfig.businessPackageConfig()")
    public void logAfterReturningMethodCall(JoinPoint joinPoint){
        logger.info("AfterReturning  Aspect - Method is called - {} with arguments",joinPoint,joinPoint.getArgs());
    }

    @AfterThrowing("com.springcourse.AOP.aspects.CommonPointCutConfig.businessPackageConfig()")
    public void logAfterThrowingMethodCall(JoinPoint joinPoint ){
        logger.info("AfterThrowing  Aspect - Method is called - {} with arguments , {} exc",joinPoint,joinPoint.getArgs());
    }
}
