package com.scaler.productservice10april.services;

import com.scaler.productservice10april.modals.Products;

public interface ProductService {
    //this should not take dtos
    Products createProduct(Products products);

}
