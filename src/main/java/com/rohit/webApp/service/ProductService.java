package com.rohit.webApp.service;

import com.rohit.webApp.model.Product;
import com.rohit.webApp.repository.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class ProductService {
    @Autowired
private ProductRepo repo;
    public List<Product> getAllProducts() {
       return repo.findAll();


    }
}
