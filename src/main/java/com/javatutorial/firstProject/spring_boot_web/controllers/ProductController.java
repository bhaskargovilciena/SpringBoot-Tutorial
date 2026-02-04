package com.javatutorial.firstProject.spring_boot_web.controllers;

import com.javatutorial.firstProject.spring_boot_web.models.Product;
import com.javatutorial.firstProject.spring_boot_web.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.*;

@RestController
public class ProductController {

    private final ProductService productService;

    @Autowired
    public ProductController(ProductService productService) {
        this.productService = productService;
    }
    @GetMapping("/products")
    public List<Product> returnProducts() {
        return productService.getAllProducts();
    }

    @GetMapping("/products/{prodId}")
    public ResponseEntity<Product> getProductById(@PathVariable int prodId) {
        return new ResponseEntity<>(productService.getProductById(prodId), HttpStatus.OK);
    }

    @PostMapping("/product")
    public ResponseEntity<String> addProduct(@RequestBody Product product) {
        productService.addProduct(product);
        System.out.println(product + " added to the products!");
        return new ResponseEntity<>("product has been added", HttpStatus.ACCEPTED);
    }

    @PutMapping("/product/{prodId}")
    public void updateProduct(@RequestBody Product product, @PathVariable int prodId) {
        productService.updateProduct(product, prodId);
    }
}