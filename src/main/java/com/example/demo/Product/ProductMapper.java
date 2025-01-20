package com.example.demo.Product;

import org.springframework.stereotype.Component;

@Component
public class ProductMapper {
    private Object film;

    public ProductDTO toDto(Product product) {
        Object Anime = null;
        return new ProductDTO(
                product.getId(),
                product.getName(),
                product.getPrice(),
                product.getCategory().getId()
        );
    }
}
