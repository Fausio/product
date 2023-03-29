package mz.com.api.product.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
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

    @PostMapping("/create")
    public ResponseEntity<?> create(@RequestBody Product model) {

        return productService.save(model);
    }

    @PutMapping("/update")
    public ResponseEntity<?> update(@RequestBody Product model) {

        return productService.save(model);
    }

    @GetMapping("/")
    public String route() {

        return "ProductController works ✅";
    }

}
