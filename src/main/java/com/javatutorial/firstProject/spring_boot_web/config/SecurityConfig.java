package com.javatutorial.firstProject.spring_boot_web.config;

import com.javatutorial.firstProject.spring_boot_web.service.ProductDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authorization.AuthenticatedAuthorizationManager;
import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

    @Autowired
    private ProductDetailsService productDetailsService;

    @Bean
    public void configure(HttpSecurity httpSecurity) throws Exception {
        // method tells what req are to be secured and how to secure the endpoints
        httpSecurity.authorizeHttpRequests(req -> req
                .requestMatchers("/product/**").authenticated()
                .anyRequest().permitAll())
                .authenticationManager(authenticationManager());
    }

    @Bean
    public AuthenticationManager authenticationManager() {
        return new AuthenticationConfiguration().getAuthenticationManager();
    }
}
