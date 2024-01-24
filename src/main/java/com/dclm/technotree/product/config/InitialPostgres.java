package com.dclm.technotree.product.config;

import com.dclm.technotree.product.models.Category;
import com.dclm.technotree.product.models.Product;
import com.dclm.technotree.product.repository.CategoryRepository;
import com.dclm.technotree.product.repository.ProductRepository;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Configuration
@Order(1)
public class InitialPostgres {
    private ProductRepository productRepository;
    private CategoryRepository categoryRepository;
    @Autowired
    public void setProductRepository(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }
    @Autowired
    public void setCategoryRepository(CategoryRepository categoryRepository){
        this.categoryRepository = categoryRepository;
    }
    @PostConstruct
    public void init(){
        Product product= new Product();
        product.setName("Sim1");

        Category category = new Category();
        category.setCategory("Prepaid");

        categoryRepository.save(category);
        product.setCategory(category);
        productRepository.save(product);

        Product product1= new Product();
        product1.setName("Sim2");

        Category category1= new Category();
        category1.setCategory("PostPaid");

        categoryRepository.save(category1);
        product1.setCategory(category1);
        productRepository.save(product1);

    }
}
