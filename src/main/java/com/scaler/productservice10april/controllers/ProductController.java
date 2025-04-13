package com.scaler.productservice10april.controllers;

import com.scaler.productservice10april.dtos.CreateProductRequestDto;
import com.scaler.productservice10april.dtos.CreateProductResponseDtos;
import com.scaler.productservice10april.modals.Products;
import com.scaler.productservice10april.services.ProductService;
import com.scaler.productservice10april.services.ProductServiceFakestoreImpl;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

@RestController
//we can see that /products is common in every mapping we can write in a other way as well
@RequestMapping("/products/")
public class ProductController {

 private final ProductServiceFakestoreImpl fakeStoreProductService;
 private ProductService productService;

 //constructor
 public ProductController(@Qualifier("fakeStoreProductService") ProductService productService, ProductServiceFakestoreImpl fakeStoreProductService) {
  this.productService = productService;
  this.fakeStoreProductService = fakeStoreProductService;
 }

 @PostMapping
 public CreateProductResponseDtos createProduct(@RequestBody CreateProductRequestDto createProductRequestDto) {
  Products product = productService.createProduct(createProductRequestDto.toproduct());
  return CreateProductResponseDtos.fromProduct(product);
 }

 @GetMapping("")
 public String getAllProduct() {
  return "here";
 }
 @GetMapping("/{id}")
 public String getSingleProduct(@PathVariable("id") Long id) {
     return  "here is a product"+id;
 }

 @DeleteMapping("/{id}")
 public String deleteProduct(@PathVariable("id") String id) {
  return "Deleted product with id: " + id;
 }

 @RequestMapping(name = "SAKSHI", value = "/cus/")
 public String dskhhcd() {
  return "Magic";
 }
}
