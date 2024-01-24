package com.dclm.technotree.product.service;

import com.dclm.technotree.product.models.Category;
import com.dclm.technotree.product.models.Product;
import com.dclm.technotree.product.repository.CategoryRepository;
import com.dclm.technotree.product.repository.ProductRepository;
import lombok.Getter;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Getter
@Service
public class ProductService {
    private static final Logger Logger = LogManager.getLogger(ProductService.class);
    private ProductRepository productRepository;
    private CategoryRepository categoryRepository;

    @Autowired
    public void setProductRepository(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }
    @Autowired
    public void setCategoryRepository(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    public Long create(Product product) {
        Logger.info("create product started");
        Optional<Category> categoryFetched = categoryRepository.findById(product.getCategory().getId());
        categoryFetched.ifPresentOrElse(product::setCategory, () -> {
            Logger.error("can not fetch product");
            throw new RuntimeException("Error in getting category");
        });
        Logger.info("category fetched successful");
        /*
        if (categoryFetched.isPresent()){
            product.setCategory(categoryFetched.get());
        }
        else{
            throw new Exception("Error in getting category");
        }
*/
        return productRepository.save(product).getId();
    }
    public void update(Long id, Product product){
        Optional<Product> fetchedProduct =  productRepository.findById(id);
        fetchedProduct.ifPresent(value -> value.setName(product.getName()));
        try{

            productRepository.save(fetchedProduct.get()).getId();
        }catch (Exception er){

        }

    }

    public List<Product> getProducts(){
        Logger.info("All Product fetched");
        return productRepository.findAll();
    }
}
