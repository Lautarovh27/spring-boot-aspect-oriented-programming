package com.springboot.app.aop.springboot_aop.services;

import org.springframework.stereotype.Service;

@Service
public class GreetingServiceImpl implements GreetingService {

    @Override
    public String sayHello(String name, String phrase) {
        System.out.println("GreetingServiceImpl: " + name + " and phrase: " + phrase);
        return phrase + ", " + name + "!";
    }

}
