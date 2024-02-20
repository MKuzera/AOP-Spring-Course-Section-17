package com.springcourse.AOP.aspects;

import org.aspectj.lang.annotation.Pointcut;

public class CommonPointCutConfig {
    @Pointcut("execution(* com.springcourse.AOP.Bussines.*.*(..))")
    public void businessPackageConfig(){

    }

    @Pointcut("bean(*Service*)")
    public void service(){}

}
