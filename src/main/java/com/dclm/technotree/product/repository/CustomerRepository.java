package com.dclm.technotree.product.repository;

import com.dclm.technotree.product.models.Customer;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CustomerRepository extends MongoRepository<Customer,String> {
}
