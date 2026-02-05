package com.javatutorial.firstProject.spring_boot_web.repositories;

import com.javatutorial.firstProject.spring_boot_web.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RestController;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {
    Product findProductByProdId(int prodId);
}
