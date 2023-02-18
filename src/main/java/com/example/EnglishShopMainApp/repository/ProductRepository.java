package com.example.EnglishShopMainApp.repository;

import com.example.EnglishShopMainApp.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Long> {
}
