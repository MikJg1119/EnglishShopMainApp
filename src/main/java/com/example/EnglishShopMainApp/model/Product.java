package com.example.EnglishShopMainApp.model;

import com.sun.istack.FinalArrayList;
import net.bytebuddy.dynamic.loading.InjectionClassLoader;

import javax.persistence.*;
import java.util.Arrays;

@Entity
@Table(name="Product")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id ;
    @Column(name="name", nullable=false)
    private String nameProduct;
    @Column(name="serialNumber", nullable=false)
    private String serialNumber;
    @Column(name="priceNetto")
    private Double priceNetto;
    @Column(name="priceBrutto")
    private Double priceBrutto;
    @Column(name="vat")
    private int vat;
    @Column(name="quantity", nullable=false)
    private int quantity;
    @Column(name="assumedQuantity")
    private int assumedQuantity;
    @Column(name="expirationDate")
    private String expirationDate;
    @Column(name="category", nullable=false)
    private String category;
    @Column(name="producer")
    private String producer;
    @Lob
    private byte [] photo;
    @Column(name="note")
    private String note;
    @Column(name="emptyField1")
    private String emptyField1;
    @Column(name="emptyField2")
    private String emptyField2;
    @Column(name="emptyField3")
    private String emptyField3;

    public Product(){}

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public Double getPriceNetto() {
        return priceNetto;
    }

    public void setPriceNetto(Double priceNetto) {
        this.priceNetto = priceNetto;
    }

    public Double getPriceBrutto() {
        return priceBrutto;
    }

    public void setPriceBrutto(Double priceBrutto) {
        this.priceBrutto = priceBrutto;
    }

    public int getVat() {
        return vat;
    }

    public void setVat(int vat) {
        this.vat = vat;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getAssumedQuantity() {
        return assumedQuantity;
    }

    public void setAssumedQuantity(int assumedQuantity) {
        this.assumedQuantity = assumedQuantity;
    }

    public String getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(String expirationDate) {
        this.expirationDate = expirationDate;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public byte[] getPhoto() {
        return photo;
    }

    public void setPhoto(byte[] photo) {
        this.photo = photo;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public String getEmptyField1() {
        return emptyField1;
    }

    public void setEmptyField1(String emptyField1) {
        this.emptyField1 = emptyField1;
    }

    public String getEmptyField2() {
        return emptyField2;
    }

    public void setEmptyField2(String emptyField2) {
        this.emptyField2 = emptyField2;
    }

    public String getEmptyField3() {
        return emptyField3;
    }

    public void setEmptyField3(String emptyField3) {
        this.emptyField3 = emptyField3;
    }

    public Product(long id, String nameProduct, String serialNumber, Double priceNetto, Double priceBrutto, int vat, int quantity, int assumedQuantity, String expirationDate, String category, String producer, byte [] photo ,String note, String emptyField1, String emptyField2, String emptyField3) {
        this.id = id;
        this.nameProduct = nameProduct;
        this.serialNumber = serialNumber;
        this.priceNetto = priceNetto;
        this.priceBrutto = priceBrutto;
        this.vat = vat;
        this.quantity = quantity;
        this.assumedQuantity = assumedQuantity;
        this.expirationDate = expirationDate;
        this.category = category;
        this.producer = producer;
        this.photo = photo;
        this.note = note;
        this.emptyField1 = emptyField1;
        this.emptyField2 = emptyField2;
        this.emptyField3 = emptyField3;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", nameProduct='" + nameProduct + '\'' +
                ", serialNumber='" + serialNumber + '\'' +
                ", priceNetto=" + priceNetto +
                ", priceBrutto=" + priceBrutto +
                ", vat=" + vat +
                ", quantity=" + quantity +
                ", assumedQuantity=" + assumedQuantity +
                ", expirationDate='" + expirationDate + '\'' +
                ", category='" + category + '\'' +
                ", producer='" + producer + '\'' +
                ", photo=" + Arrays.toString(photo) +
                ", note='" + note + '\'' +
                ", emptyField1='" + emptyField1 + '\'' +
                ", emptyField2='" + emptyField2 + '\'' +
                ", emptyField3='" + emptyField3 + '\'' +
                '}';
    }
}
