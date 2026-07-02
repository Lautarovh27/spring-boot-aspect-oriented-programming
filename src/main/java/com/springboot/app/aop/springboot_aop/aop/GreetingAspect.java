package com.springboot.app.aop.springboot_aop.aop;

import java.util.Arrays;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class GreetingAspect {

    private Logger logger = LoggerFactory.getLogger(GreetingAspect.class);

    @Before("execution(* com.springboot.app.aop.springboot_aop.services;GreetingService.sayHello(..))")
    public void logBeforeGreeting(JoinPoint joinPoint) {
        String method = joinPoint.getSignature().getName();
        String args = Arrays.toString(joinPoint.getArgs());
        logger.info("Greeting method called with name: {"+method+"} and phrase: {"+args+"}",  method, args);
    }
}
