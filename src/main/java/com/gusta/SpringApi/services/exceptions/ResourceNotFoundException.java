package com.gusta.SpringApi.services.exceptions;

public class ResourceNotFoundException extends  RuntimeException{
    private static final long serialVersion = 1L;

    public ResourceNotFoundException(Object id){
        super("Resource not found. id " + id);
    }

}
