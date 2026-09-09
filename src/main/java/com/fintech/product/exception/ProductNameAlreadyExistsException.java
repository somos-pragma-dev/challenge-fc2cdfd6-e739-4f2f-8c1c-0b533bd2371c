package com.fintech.product.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.BAD_REQUEST)
public class ProductNameAlreadyExistsException extends RuntimeException {
    public ProductNameAlreadyExistsException(String name) {
        super("Product name already exists: " + name);
    }
}