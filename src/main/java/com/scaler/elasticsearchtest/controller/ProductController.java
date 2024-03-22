package com.scaler.elasticsearchtest.controller;

import com.scaler.elasticsearchtest.models.Product;
import com.scaler.elasticsearchtest.repositories.ProductRepository;
import com.scaler.elasticsearchtest.services.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/products")
public class ProductController {

    private final ProductService productService;
    @GetMapping
    public Iterable<Product> findAll() {
        return productService.findAll();
    }

    @GetMapping("/find")
    public Iterable<Product> findAllByTitle(@RequestParam String title){
        return productService.findAllByTitle(title);
    }

    @PostMapping
    public void save(@RequestBody Product product) {
        productService.save(product);
    }
}
