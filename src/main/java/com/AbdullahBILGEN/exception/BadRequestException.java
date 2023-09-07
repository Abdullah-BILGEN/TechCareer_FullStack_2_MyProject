package com.AbdullahBILGEN.exception;
// 400:Kötü istek

public class BadRequestException extends RuntimeException{
    public BadRequestException(String message){
        super(message);
    }
}
