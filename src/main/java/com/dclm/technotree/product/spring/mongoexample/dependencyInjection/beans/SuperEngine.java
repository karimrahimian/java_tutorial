package com.dclm.technotree.product.spring.mongoexample.dependencyInjection.beans;

import org.springframework.stereotype.Component;

@Component(value = "SuperEngine")
public class SuperEngine extends Engine {
    public void ignite(){
        System.out.println("Here is Super Engine");
    }
}
