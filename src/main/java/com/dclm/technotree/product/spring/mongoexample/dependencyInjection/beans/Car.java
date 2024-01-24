package com.dclm.technotree.product.spring.mongoexample.dependencyInjection.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("car")
public class Car {
    private Engine engine ;

    @Autowired
    @Qualifier("SuperEngine")
    public void setEngine(Engine engine) {
        this.engine = engine;
    }
    public void start() {
        this.engine.ignite();
        System.out.println("Car is starting with " + engine.getType() + " engine.");
    }
}
