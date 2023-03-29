package mz.com.api.product.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import mz.com.api.product.model.Product;
import mz.com.api.product.model.ResponseModel;
import mz.com.api.product.repository.ProductRepository;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    @Autowired
    private ResponseModel responseModel;

    public Iterable<Product> read() {
        return productRepository.findAll();
    }

    public ResponseEntity<?> create(Product model) {

        if (model.getName().equals("")) {

            responseModel.setMsg("Name of the product is required.");
            return new ResponseEntity<ResponseModel>(responseModel, HttpStatus.BAD_REQUEST);
        } else if (model.getBrand().equals("")) {

            responseModel.setMsg("Brand of the product is required.");
            return new ResponseEntity<ResponseModel>(responseModel, HttpStatus.BAD_REQUEST);
        } else {

            return new ResponseEntity<Product>(productRepository.save(model), HttpStatus.CREATED);
        }
    }
}
