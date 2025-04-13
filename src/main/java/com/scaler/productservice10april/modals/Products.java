package com.scaler.productservice10april.modals;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Products {
    public Long id;
    public String title;
    public String description;
    public Double price;
    public String imageUrl;
    public String category;
}
