package com.dclm.technotree.product;

import com.dclm.technotree.product.service.ProductService;
import lombok.Data;
import lombok.Setter;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@SpringBootApplication(exclude = {SecurityAutoConfiguration.class})
public class ProductApplication {
	private static final org.apache.logging.log4j.Logger Logger = LogManager.getLogger(ProductApplication.class);
	public static void main(String[] args) {
		SpringApplication.run(ProductApplication.class, args);
		Logger.info("Service is up on port "+ 9000);
	}
}
