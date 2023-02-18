package com.example.EnglishShopMainApp.controller;

import com.example.EnglishShopMainApp.model.Product;
import com.example.EnglishShopMainApp.service.ProductService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/product")
public class ProductController {

    private ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }
    // REST API saveProduct

    @PostMapping
    public ResponseEntity<Product> saveProduct(@RequestBody Product product){
        return new ResponseEntity<Product>(productService.saveProduct(product), HttpStatus.CREATED);
    }
    // REST API getallProduct

    @GetMapping
    public List<Product> getAllProduct(){
        return productService.getAllProduct();
    }
    // REST API getProductByID

    @GetMapping("{id}")
    public ResponseEntity<Product> getProductById(@PathVariable("id")  Long id){
        return new ResponseEntity<Product>(productService.getProductById(id),HttpStatus.OK);
    }
    // REST API updateProductById
    @PutMapping("{id}")
    public ResponseEntity<Product>updateProductById (@PathVariable("id") Long id, @RequestBody Product product){
        return new ResponseEntity<Product>(productService.updateProductById(product,id),HttpStatus.OK);
    }
    // REST API deleteProduct
    @DeleteMapping("{id}")
    public ResponseEntity<String> deleteProduct(@PathVariable("id") Long id ){
        productService.deleteProduct(id);
        return new ResponseEntity<>("Product is delete",HttpStatus.OK);
    }






}
