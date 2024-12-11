package com.quickcart.ecommerce.service.impl;

import com.quickcart.ecommerce.model.Product;
import com.quickcart.ecommerce.repository.ProductRepository;
import com.quickcart.ecommerce.service.ProductService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class ProductServiceImpl implements ProductService {

    private final ProductRepository productRepository;

    @Override
    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }
}
