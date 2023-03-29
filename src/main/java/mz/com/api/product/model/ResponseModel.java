package mz.com.api.product.model;

import org.hibernate.annotations.Comment;
import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.Setter;

@Component
@Getter
@Setter
public class ResponseModel {
    
    public String msg;
}
