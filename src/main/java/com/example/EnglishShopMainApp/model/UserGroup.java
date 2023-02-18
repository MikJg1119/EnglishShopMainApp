package com.example.EnglishShopMainApp.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="UserGroup")
public class UserGroup {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;

    List<Product>ProductsList;

    public UserGroup(){}

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Product> getProductsList() {
        return ProductsList;
    }

    public void setProductsList(List<Product> productsList) {
        ProductsList = productsList;
    }

    public UserGroup(long id, String name, List<Product> productsList) {
        this.id = id;
        this.name = name;
        ProductsList = productsList;
    }

    @Override
    public String toString() {
        return "UserGroup{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", ProductsList=" + ProductsList +
                '}';
    }
}
