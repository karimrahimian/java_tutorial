package com.dclm.technotree.product.spring.mongoexample.dependencyInjection.config;

import com.dclm.technotree.product.spring.mongoexample.dependencyInjection.beans.Car;
import com.dclm.technotree.product.spring.mongoexample.dependencyInjection.beans.Engine;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


public class CarConfig {
    @Bean
    public Engine dieselEngine() {
        return new Engine("Diesel");
    }

}
