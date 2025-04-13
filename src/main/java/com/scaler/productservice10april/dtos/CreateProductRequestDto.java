package com.scaler.productservice10april.dtos;


import com.scaler.productservice10april.modals.Products;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CreateProductRequestDto {
    private String title;
    private String description;
    private Double price;
    private String imageUrl;
    private String categoryName;


    public Products toproduct() {
        Products products = new Products();
        products.setId(null);
        products.setTitle(this.title);
        products.setDescription(this.description);
        products.setPrice(this.price);
        products.setImageUrl(this.imageUrl);
        products.setCategory(this.categoryName);
        return products;

    }
}

