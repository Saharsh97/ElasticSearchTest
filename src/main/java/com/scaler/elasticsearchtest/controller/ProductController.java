package com.scaler.elasticsearchtest.controller;

import com.scaler.elasticsearchtest.models.Product;
import com.scaler.elasticsearchtest.repositories.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/products")
public class ProductController {

    private final ProductRepository productRepository;
    @GetMapping
    public Iterable<Product> findAll() {
        return productRepository.findAll();
    }

    @GetMapping("/find")
    public Iterable<Product> findByTitle(@RequestParam String title){
        return productRepository.findAllByTitle(title);
    }

    @PostMapping
    public void save(@RequestBody Product product) {
        productRepository.save(product);
    }
}
