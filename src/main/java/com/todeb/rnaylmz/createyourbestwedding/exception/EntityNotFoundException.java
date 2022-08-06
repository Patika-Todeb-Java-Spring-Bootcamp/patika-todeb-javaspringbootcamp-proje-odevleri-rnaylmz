package com.todeb.rnaylmz.createyourbestwedding.exception;

import lombok.Data;

@Data
public class EntityNotFoundException extends RuntimeException {

    public EntityNotFoundException(String entityName, String message) {
        super("Related " + entityName + " not found with : [" + message + "]");
    }
}
