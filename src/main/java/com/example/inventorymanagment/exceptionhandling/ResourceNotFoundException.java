package com.example.inventorymanagment.exceptionhandling;

public class ResourceNotFoundException extends RuntimeException{
    public ResourceNotFoundException(Long id){
        super("item with ID" +id+ "not found");
    }
}
