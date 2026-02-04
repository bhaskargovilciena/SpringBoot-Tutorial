package com.javatutorial.firstProject.exception_handling.repositories;

import com.javatutorial.firstProject.exception_handling.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {
}
