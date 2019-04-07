package com.springboot.study.ch1.aop;

import org.springframework.stereotype.Service;

@Service
public class DemoMethodService {

    public void add(){
        System.out.println("方法拦截的add操作 running......");
    }
}
