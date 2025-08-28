package com.rohit.webApp.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Data
@NoArgsConstructor

public class Product {
    private  int proId;

    public int getProId() {
        return proId;
    }

    public void setProId(int proId) {
        this.proId = proId;
    }

    public String getProdName() {
        return prodName;
    }

    public void setProdName(String prodName) {
        this.prodName = prodName;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "proId=" + proId +
                ", prodName='" + prodName + '\'' +
                ", price=" + price +
                '}';
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Product(int proId, String prodName, int price) {
        this.proId = proId;
        this.prodName = prodName;
        this.price = price;
    }

    private  String prodName;
    private int price;

}
