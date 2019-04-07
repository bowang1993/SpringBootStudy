package com.springboot.study.ch1.di;

import org.springframework.stereotype.Service;

@Service
public class FunctionService {

    public String sayHello(String word){

        return "Hello " + word + " !";
    }

}
