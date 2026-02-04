package com.javatutorial.firstProject.spring_boot_web.service;

import com.javatutorial.firstProject.spring_boot_web.controllers.ProductController;
import com.javatutorial.firstProject.spring_boot_web.exceptions.ProductNotFoundException;
import com.javatutorial.firstProject.spring_boot_web.models.Product;
import com.javatutorial.firstProject.spring_boot_web.repositories.ProductRepository;
import lombok.extern.java.Log;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;

@Service
public class ProductService {

    private final ProductRepository productRepository;
    private final Logger logger = LoggerFactory.getLogger(ProductController.class);

    @Autowired
    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    // now, we are connecting database;
//    List<Product> allProducts = new ArrayList<>(Arrays.asList(
//            new Product(101, "iphone16", 200000),
//            new Product(102, "iphone 18", 300000)));

    public List<Product> getAllProducts() {
//        return allProducts;
        return productRepository.findAll();
    }

    public Product getProductById(int id) {
//        return allProducts.stream().filter(prod -> prod.getProdId() == id).findFirst().orElseThrow();
        return productRepository.findById(id).orElseThrow();
    }

    public void addProduct(Product product) {
//        allProducts.add(product);
        productRepository.save(product);
    }

    public void updateProduct(Product product, int prodId) {
//        Product oldProduct = getProductById(product.getProdId());
//        allProducts.remove(oldProduct);
//        allProducts.add(product);
        if(productRepository.findById(prodId).isEmpty()) {
            logger.error("error log...");
            logger.info("info log...");
            logger.trace("error log...");
            logger.debug("debug log");
            throw new ProductNotFoundException("product with ID: " + prodId + " cannot be found");
            // this exception can be handled by a handler in GlobalExceptionHandler
        }
        productRepository.save(product); // if product is present then updated else created
    }
}
