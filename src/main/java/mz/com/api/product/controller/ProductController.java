package mz.com.api.product.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import mz.com.api.product.model.Product;
import mz.com.api.product.repository.ProductRepository;
import mz.com.api.product.service.ProductService;

@RestController
@RequestMapping("/product")
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping("/read")
    public Iterable<Product> read() {

        return productService.read();
    }
    
    @GetMapping("/")
    public String route(){

        return "ProductController works ✅";
    }

}
