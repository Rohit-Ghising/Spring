package com.rohit.webApp.service;

import com.rohit.webApp.model.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
@Service
public class ProductService {
    List<Product> products = new ArrayList<>(Arrays.asList(new Product(101,"iphone",123),
            new Product(102,"Canon",123), new Product(102,"msnon",123)));
    public List<Product> getProducts(){
        return products;
    }

    public Product getProductById(int prodId) {
        return  products.stream().filter(p ->p.getProId()==prodId).findFirst().orElse(
                new Product(100,"no products found",4));
    }

    public void addProduct(Product prod){
        products.add(prod);
    }

    public void updateProduct(Product prod) {
        int index =0;
        for (int i=0;i<products.size();i++){
            if(products.get(i).getProId()==prod.getProId())
                index=1;

        }
        products.set(index,prod)  ;
    }

    public void deleteProduct(int prodId) {
        int index =0;
        for (int i=0 ;i<products.size();i++)    {
            if(products.get(i).getProId()==prodId)
                index=1;
        }
        products.remove(index)  ;



    }
        
}
