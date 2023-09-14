package com.example.buysell.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.buysell.models.Product;

@Service
public class ProductService {
    private List<Product> products = new ArrayList<>();
    private long ID = 0 ;
    {
        products.add(new Product(++ID, "PlayStation 5", "best ployka", 
                        67000, "Krasnoyarsk", "Tomas"));
        products.add(new Product(++ID, "Iphone 11", "some better peiger", 
                        112000, "Moscow", "Jerry"));
    }
    public List<Product> listProduct(){
        return products;
    }
    public void saveProduct(Product product){
        product.setId(++ID);
        products.add(product);
    }
    public void deleteProduct(long id){
        products.removeIf(product -> product.getId().equals(id));
    }
    public Product getProductById(Long id) {
        for(Product product : products) {
            if(product.getId().equals(id))
            return product;
        }
        return null;
        
        
    }

}
