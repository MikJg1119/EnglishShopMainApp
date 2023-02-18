package com.example.EnglishShopMainApp.service.impl;

import com.example.EnglishShopMainApp.Exception.ResourceNotFoundException;
import com.example.EnglishShopMainApp.model.Product;
import com.example.EnglishShopMainApp.repository.ProductRepository;
import com.example.EnglishShopMainApp.service.ProductService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductServiceImpl implements ProductService {
    private ProductRepository productRepository;

    public ProductServiceImpl(ProductRepository productRepository) {
        super();
        this.productRepository = productRepository;
    }

    // zapisywanie produktu.
    @Override
    public Product saveProduct(Product product) {
        return productRepository.save(product);
    }

    // zwracanie listy produktów
    @Override
    public List<Product> getAllProduct() {
        return productRepository.findAll();
    }
    // szukanie produktu po id
    @Override
    public Product getProductById(Long id) {
        return productRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Product", "id", id));
    }
    // aktualizacja  produktu
    @Override
    public Product updateProductById(Product product, long id) {

        Product existingProduct =  productRepository.findById(id).orElseThrow(()-> new ResourceNotFoundException("Product", "id", id));
        existingProduct.setNameProduct(product.getNameProduct());
        existingProduct.setSerialNumber(product.getSerialNumber());
        existingProduct.setPriceNetto(product.getPriceNetto());
        existingProduct.setPriceBrutto(product.getPriceBrutto());
        existingProduct.setVat(product.getVat());
        existingProduct.setQuantity(product.getQuantity());
        existingProduct.setAssumedQuantity(product.getAssumedQuantity());
        existingProduct.setExpirationDate(product.getExpirationDate());
        existingProduct.setCategory(product.getCategory());
        existingProduct.setProducer(product.getProducer());
        existingProduct.setPhoto(product.getPhoto());
        existingProduct.setNote(product.getNote());
        existingProduct.setEmptyField1(product.getEmptyField1());
        existingProduct.setEmptyField2(product.getEmptyField2());
        existingProduct.setEmptyField3(product.getEmptyField3());
        productRepository.save(existingProduct);
        return existingProduct;
    }
    // usuwanie produktów
    @Override
    public void deleteProduct(long id) {
        productRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Product", "id", id));

        productRepository.deleteById(id);
    }
//

}



