package com.springboot.study.ch5;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class Ch522Application {

    @RequestMapping("/")
    String index(){
        return "Hello Spring Boot.";
    }

    public static void main(String[] args) {
        SpringApplication.run(Ch522Application.class,args);
    }
}
