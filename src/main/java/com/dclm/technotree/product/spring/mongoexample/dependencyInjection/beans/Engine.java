package com.dclm.technotree.product.spring.mongoexample.dependencyInjection.beans;

import lombok.Getter;
import org.springframework.stereotype.Component;

@Getter
@Component("Engine")
public class Engine {
    private String type;
    public Engine(String type) {
        this.type = type;
    }
    public Engine(){
        this.type = "Fuel";
    }
    public void ignite(){
        System.out.println("Here is Engine");
    }
}
