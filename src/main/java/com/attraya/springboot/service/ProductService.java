package com.attraya.springboot.service;

import com.attraya.springboot.entity.Product;

import java.util.List;

public interface ProductService {
    List<Product> searchProducts(String query);

    Product createProduct(Product product);
}
