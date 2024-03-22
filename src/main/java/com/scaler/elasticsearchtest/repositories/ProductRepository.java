package com.scaler.elasticsearchtest.repositories;

import com.scaler.elasticsearchtest.models.Product;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import java.util.List;

public interface ProductRepository extends ElasticsearchRepository<Product, Long> {
    List<Product> findAllByTitle(String title);
}
