package com.dclm.technotree.product.service;

import com.dclm.technotree.product.ProductApplication;
import jakarta.annotation.PostConstruct;
import jakarta.persistence.Column;
import org.apache.logging.log4j.LogManager;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class RestCallService {
    @Value("${product.port}")
    private String serverPort;
    @Value("${webservice.url}")
    private String serverUrl;
    private static final org.apache.logging.log4j.Logger Logger = LogManager.getLogger(ProductApplication.class);

    public String apiCall(){
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<String> responseEntity = restTemplate.getForEntity(serverUrl, String.class);
        String responseData = responseEntity.getBody();
        return responseData;
    }

}
