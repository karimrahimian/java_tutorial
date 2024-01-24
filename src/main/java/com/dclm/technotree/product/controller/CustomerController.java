package com.dclm.technotree.product.controller;

import com.dclm.technotree.product.models.Customer;
import com.dclm.technotree.product.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/version3/customer")
public class CustomerController {
    private CustomerService customerService;

    @Autowired
    public void setCustomerService(CustomerService customerService) {
        this.customerService = customerService;
    }
    @PostMapping("/create")
    public Customer createCustomer(@RequestBody Customer customer){
        return  customerService.createCustomer(customer);
    }

}
