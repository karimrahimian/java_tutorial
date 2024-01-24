package com.dclm.technotree.product.models;

import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collation = "customer")
@Setter
@Getter
@AllArgsConstructor

public class Customer {
    @Id
    private String id;
    private String fullName;

}
