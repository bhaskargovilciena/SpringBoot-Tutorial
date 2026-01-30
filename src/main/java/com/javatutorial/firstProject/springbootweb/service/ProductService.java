package com.javatutorial.firstProject.springbootweb.service;

import com.javatutorial.firstProject.springbootweb.models.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class ProductService {
    List<Product> allProducts = new ArrayList<>(Arrays.asList(
            new Product(101, "iphone16", 200000),
            new Product(102, "iphone 18", 300000)));

    public List<Product> getAllProducts() {
        return allProducts;
    }

    public Product getProductById(int id) {
        return allProducts.stream().filter(prod -> prod.getProdId() == id).findFirst().orElseThrow();
    }

    public void addProduct(Product product) {
        allProducts.add(product);
    }

    public void updateProduct(Product product) {
        Product oldProduct = getProductById(product.getProdId());
        allProducts.remove(oldProduct);
        allProducts.add(product);
    }
}
