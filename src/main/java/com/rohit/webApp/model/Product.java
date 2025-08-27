package com.rohit.webApp.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Data
@NoArgsConstructor

public class Product {
    private  int proId;

    public Product(int proId, String prodName, int price) {
        this.proId = proId;
        this.prodName = prodName;
        this.price = price;
    }

    private  String prodName;
    private int price;

}
