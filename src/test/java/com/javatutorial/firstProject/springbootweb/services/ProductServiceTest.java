package com.javatutorial.firstProject.springbootweb.services;

import com.javatutorial.firstProject.springbootweb.models.Product;
import com.javatutorial.firstProject.springbootweb.service.ProductService;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
public class ProductServiceTest {

    @Autowired
    private ProductService productRepository;

    @Test
    public void testGetAllProducts() {
        assertEquals(4, 2+2);
        assertNotNull(productRepository.getAllProducts()); // means that this function must not return null
    }

    @Test
    public void testAddProduct() {
        int totalProducts = productRepository.getAllProducts().size();
        productRepository.addProduct(new Product(123, "iphone", 10000));
        assertEquals(totalProducts+1, productRepository.getAllProducts().size());
    }

    @ParameterizedTest
    @CsvSource({
            "1, 2, 3", // this represents the values of the params in the same order as they are mentioned in the function
            "2, 4, 6"
    })
    // @CsvFileSource can also be used where we can directly pass the entire file
//    @Disabled this keyword is used to disable a test
    public void testParamterized(int a, int b, int expected) {
        assertEquals(expected, a + b);
    }
}
