package com.scaler.productservice10april.dtos;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class FakeStoreCreateProductResponseDtos {
    public Long id;
    public String title;
    public Double price;
    public String image;
    public String description;
    public String category;
}
