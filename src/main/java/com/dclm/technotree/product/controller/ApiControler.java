package com.dclm.technotree.product.controller;

import com.dclm.technotree.product.models.Product;
import com.dclm.technotree.product.service.RestCallService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/version1")
public class ApiControler {
    @Autowired
    private RestCallService restCallService;

    @GetMapping(value = "/apiresult")
    private ResponseEntity<String> apiCall(){
        return new ResponseEntity<>(restCallService.apiCall(), HttpStatus.ACCEPTED);
    }
}
