package com.rohit.webApp.controller;

import com.rohit.webApp.model.Product;
import com.rohit.webApp.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@CrossOrigin

@RestController
@RequestMapping("/api")
public  class ProductController{
    @Autowired
    private ProductService service;
    @RequestMapping("/")
     public String  greet(){
         return "Hello Wolrd";
     }
     @GetMapping("/products")
     public List<Product> getAllProducts(){
        return  service.getAllProducts();
     }

}
