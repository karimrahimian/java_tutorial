package com.dclm.technotree.product.spring.mongoexample.dependencyInjection;

import com.dclm.technotree.product.ProductApplication;
import com.dclm.technotree.product.spring.mongoexample.dependencyInjection.beans.Car;
import lombok.Setter;
import org.apache.logging.log4j.LogManager;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

//@SpringBootApplication(exclude = {SecurityAutoConfiguration.class})
public class Application {
    private static final org.apache.logging.log4j.Logger Logger = LogManager.getLogger(ProductApplication.class);

    public static void main(String[] args) {
        //SpringApplication.run(Application.class, args);
        ApplicationContext context = new AnnotationConfigApplicationContext("com.dclm.technotree.product.spring");

        Car car =(Car) context.getBean("car");
        car.start();

        Logger.info("The program is running");
    }


}
