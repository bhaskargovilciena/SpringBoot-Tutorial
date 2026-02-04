package com.javatutorial.firstProject.spring_boot_web.repositories;

import com.javatutorial.firstProject.spring_boot_web.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public interface ProductRepository extends JpaRepository<Product, Integer> {
}
