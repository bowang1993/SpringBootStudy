package com.springboot.study.ch1.aop;

import org.springframework.stereotype.Service;

@Service
public class DemoAnnotationService {

    @Action(name = "注解拦截的add操作")
    public void add() {
        System.out.println("注解的add操 running......");
    }
}
