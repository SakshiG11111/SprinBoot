package com.scaler.productservice10april.services;

import com.scaler.productservice10april.dtos.FakeStoreCreateProductRequestDtos;
import com.scaler.productservice10april.dtos.FakeStoreCreateProductResponseDtos;
import com.scaler.productservice10april.modals.Products;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service("fakeStoreProductService")
//@Primary
 public  class ProductServiceFakestoreImpl implements  ProductService {


    //object of resttemplate can not autowired when we create a configuration
    private RestTemplate restTemplate;

    public ProductServiceFakestoreImpl(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @Override
    public Products createProduct(Products products) {
        FakeStoreCreateProductRequestDtos request = new FakeStoreCreateProductRequestDtos();

        request.setPrice(products.getPrice());
        request.setDescription(products.getDescription());
        request.setTitle(products.getTitle());
        request.setImage(products.getImageUrl());
        request.setCategory(products.getCategory());
        FakeStoreCreateProductResponseDtos response = restTemplate.postForObject("https://fakestoreapi.com/products", request, FakeStoreCreateProductResponseDtos.class);

        Products product1 = new Products();
        product1.setId(response.getId());
        product1.setPrice(response.getPrice());
        product1.setDescription(response.getDescription());
        product1.setTitle(response.getTitle());
        product1.setImageUrl(response.getImage());
        product1.setCategory(response.getCategory());
        return product1;
    }
}


//service should not take dtos