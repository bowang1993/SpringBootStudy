package com.springboot.study.ch2.el;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("com.springboot.study.ch2.el")
@PropertySource("com/springboot/study/ch2/el/test.properties")
public class ElConfig {

    @Value("I love you")
    private String normal;

    @Value("#systemProperties['os.name']")
    private String osName;



}
