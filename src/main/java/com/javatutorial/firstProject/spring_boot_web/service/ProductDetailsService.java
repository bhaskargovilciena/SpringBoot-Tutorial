package com.javatutorial.firstProject.spring_boot_web.service;

import com.javatutorial.firstProject.spring_boot_web.models.Product;
import com.javatutorial.firstProject.spring_boot_web.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

@Component
public class ProductDetailsService implements UserDetailsService {

    @Autowired
    private ProductRepository productRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        int prodId = Integer.parseInt(username);
        Product product = productRepository.findProductByProdId(prodId);
        if(product != null)
            return User.builder().username(String.valueOf(product.getProdId())).password(product.getProdName()).build();
        throw new UsernameNotFoundException("product not found!!");
    }
}
