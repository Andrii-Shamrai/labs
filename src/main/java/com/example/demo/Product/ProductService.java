package com.example.demo.Product;

import java.util.List;

public interface ProductService {
    List<ProductDTO> findProductsByCategory(Long categoryId);
    void saveProduct(Product product);
}
