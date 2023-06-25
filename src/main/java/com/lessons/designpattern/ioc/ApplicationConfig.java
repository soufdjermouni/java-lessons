package com.lessons.designpattern.ioc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class ApplicationConfig {

    //Field-Based Dependency Injection
    @Autowired
    private A a;

    @Autowired
    private B b;

    @Bean
    public A a(){
        return new A();
    }

    @Bean
    public B b(){
        return new B();
    }

    // Constructor-Based Dependency Injection
    @Bean
    public C c(){
        return new C(a, b);
    }

}
