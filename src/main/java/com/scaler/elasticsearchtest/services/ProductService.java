package com.scaler.elasticsearchtest.services;

import com.scaler.elasticsearchtest.models.Product;
import com.scaler.elasticsearchtest.repositories.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

@Service
@RequiredArgsConstructor
public class ProductService {

    private final ProductRepository productRepository;

    public Iterable<Product> findAll() {
        // find only using ES.
        return productRepository.findAll();
    }

    public Iterable<Product> findAllByTitle(@RequestParam String title){
        // find only using ES.
        return productRepository.findAllByTitleContaining(title);
    }

    public void save(@RequestBody Product product) {
        // save to DB.
        // .................

        // save to ES.
        productRepository.save(product);
    }
}
