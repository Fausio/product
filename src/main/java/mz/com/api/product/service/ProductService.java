package mz.com.api.product.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mz.com.api.product.model.Product;
import mz.com.api.product.repository.ProductRepository;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public Iterable<Product> read() {
        return productRepository.findAll();
    }
}
