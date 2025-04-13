package com.scaler.productservice10april.dtos;

import com.scaler.productservice10april.modals.Products;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CreateProductResponseDtos {
    private Long id;
    private String title;
    private String description;
    private Double price;
    private String imageUrl;
    private String categoryName;

    public static CreateProductResponseDtos fromProduct(Products products) {
        CreateProductResponseDtos responseDtos = new CreateProductResponseDtos();
        responseDtos.setId(products.getId());
        responseDtos.setTitle(products.getTitle());
        responseDtos.setDescription(products.getDescription());
        responseDtos.setPrice(products.getPrice());
        responseDtos.setImageUrl(products.getImageUrl());
        responseDtos.setCategoryName(products.getCategory());
        return responseDtos;
    }

}
