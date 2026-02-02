package com.javatutorial.firstProject.springbootweb.repositories;

import com.javatutorial.firstProject.springbootweb.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public interface ProductRepository extends JpaRepository<Product, Integer> {
}
