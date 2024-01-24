package com.dclm.technotree.product.controller;

import com.dclm.technotree.product.models.Product;
import com.dclm.technotree.product.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/version1")
public class ProductController {
    @Autowired
    private ProductService porductService;

    @PostMapping(value = "/create",produces = "application/json")
    private ResponseEntity<String> createProduct(@RequestBody Product product){
        if (product.getName()==null || product.getCategory().getId()==null){
            return new ResponseEntity<>("ProductName or category id is null",HttpStatus.BAD_REQUEST);
        }
        try {
            Long id = porductService.create(product);
            return new ResponseEntity<>("Product Created successful" + id, HttpStatus.CREATED);
        }catch (Exception er){
            return new ResponseEntity<>(er.getMessage() , HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
    @PutMapping(value = "/update/{id}")
    private ResponseEntity<String> updateProduct(@PathVariable String id, @RequestBody Product product){
        porductService.update(Long.valueOf(id),product);
        return new ResponseEntity<>("Product Created successful" , HttpStatus.CREATED);
    }
    @GetMapping(value = "/products")
    private ResponseEntity<List<Product>> getProducts(){
        return new ResponseEntity<>( porductService.getProducts(),HttpStatus.ACCEPTED);
    }
}
