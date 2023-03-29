package mz.com.api.product.repository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import  mz.com.api.product.model.Product;
 
 

@Repository
public interface ProductRepository extends CrudRepository<Product,Long>{
    
}
