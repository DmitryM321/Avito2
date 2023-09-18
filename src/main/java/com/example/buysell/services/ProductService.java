package com.example.buysell.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.buysell.models.Product;
import com.example.buysell.repositories.ProductRepository;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Service
@RequiredArgsConstructor
@Slf4j
public class ProductService { 
    private final ProductRepository productRepository;
    public List<Product> listProduct(String title){
        List<Product> products = productRepository.findAll();
        if(title != null)
        productRepository.findByTitle(title);
        return productRepository.findAll();
    }
    public void saveProduct(Product product){ 
        log.info("Saving new {}", product);
        productRepository.save(product);
    }
    public void deleteProduct(long id){
        productRepository.deleteById(id);
    }
    public Product getProductById(Long id) {
       return productRepository.findById(id).orElse(null);
        
        
    }

}
