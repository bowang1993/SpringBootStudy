package com.springboot.study.ch3.annotation;

import org.springframework.stereotype.Service;

@Service
public class DemoService {

    public void outputResult(){
        System.out.println("从组合注解里照样获得bean");
    }
}
