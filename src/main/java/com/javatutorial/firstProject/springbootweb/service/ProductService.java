package com.javatutorial.firstProject.springbootweb.service;

import com.javatutorial.firstProject.springbootweb.models.Product;
import com.javatutorial.firstProject.springbootweb.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

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

    public void updateProduct(Product product) {
//        Product oldProduct = getProductById(product.getProdId());
//        allProducts.remove(oldProduct);
//        allProducts.add(product);
        productRepository.save(product); // if product is present then updated else created
    }
}
