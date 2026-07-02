package com.springboot.app.aop.springboot_aop.aop;

import java.util.Arrays;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class GreetingAspect {


    private Logger logger = LoggerFactory.getLogger(GreetingAspect.class);

    @Before("execution(* com.springboot.app.aop.springboot_aop.services.*.*(..))")
    public void logBeforeGreeting(JoinPoint joinPoint) {

        String method = joinPoint.getSignature().getName();
        String args = Arrays.toString(joinPoint.getArgs());

        logger.info(
            "Antes: " + method + " con argumentos: " + args
        );
    }

    @After("execution(* com.springboot.app.aop.springboot_aop.services.*.*(..))")
    public void logAfterGreeting(JoinPoint joinPoint) {

        String method = joinPoint.getSignature().getName();
        String args = Arrays.toString(joinPoint.getArgs());

        logger.info(
            "Después: " + method + " con argumentos: " + args
        );
    }

    @AfterReturning("execution(* com.springboot.app.aop.springboot_aop.services.*.*(..))")
    public void logAfterReturningGreeting(JoinPoint joinPoint) {

        String method = joinPoint.getSignature().getName();
        String args = Arrays.toString(joinPoint.getArgs());

        logger.info(
            "Después de retornar: " + method + " con argumentos: " + args
        );
    }

    @AfterThrowing("execution(* com.springboot.app.aop.springboot_aop.services.*.*(..))")
    public void logAfterThrowingGreeting(JoinPoint joinPoint) {

        String method = joinPoint.getSignature().getName();
        String args = Arrays.toString(joinPoint.getArgs());

        logger.info(
            "Después de lanzar excepción: " + method + " con argumentos: " + args
        );
    }

}
