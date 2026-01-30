package com.javatutorial.firstProject.springbootweb.controllers;

import com.javatutorial.firstProject.springbootweb.models.Product;
import com.javatutorial.firstProject.springbootweb.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping("/products")
    public List<Product> returnProducts() {
        return productService.getAllProducts();
    }

    @GetMapping("/products/{prodId}")
    public Product getProductById(@PathVariable int prodId) {
        return productService.getProductById(prodId);
    }

    @PostMapping("/product")
    public void addProduct(@RequestBody Product product) {
        productService.addProduct(product);
        System.out.println(product + " added to the products!");
    }

    @PutMapping("/product/{prodId}")
    public void updateProduct(@RequestBody Product product) {
        productService.updateProduct(product);
    }
}