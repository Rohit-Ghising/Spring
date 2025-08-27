package com.rohit.webApp.service;

import com.rohit.webApp.model.Product;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
@Service
public class ProductService {
    List<Product> products = Arrays.asList(new Product(101,"iphone",123),
            new Product(102,"Canon",123));
    public List<Product> getProducts(){
        return products;
    }

}
