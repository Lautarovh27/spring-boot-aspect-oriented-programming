package com.springboot.app.aop.springboot_aop.aop;

import java.util.Arrays;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;


@Order(1)
@Component
@Aspect
public class GreetingAspectFoo {

    private Logger logger = LoggerFactory.getLogger(GreetingAspect.class);

    @Before("execution(* com.springboot.app.aop.springboot_aop.services.*.*(..))")
    public void logBeforeGreeting(JoinPoint joinPoint) {

        String method = joinPoint.getSignature().getName();
        String args = Arrays.toString(joinPoint.getArgs());

        logger.info(
            "Antes1: " + method + " invocado con los args: " + args
        );
    }

     @After("execution(* com.springboot.app.aop.springboot_aop.services.*.*(..))")
    public void logAfterGreeting(JoinPoint joinPoint) {

        String method = joinPoint.getSignature().getName();
        String args = Arrays.toString(joinPoint.getArgs());

        logger.info(
            "Después1: " + method + " invocado con los args  : " + args
        );
    }
}
