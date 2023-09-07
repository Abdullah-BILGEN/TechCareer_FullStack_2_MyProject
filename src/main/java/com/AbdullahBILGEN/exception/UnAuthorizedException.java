package com.AbdullahBILGEN.exception;
// 401: Yetkisiz giriş
public class UnAuthorizedException extends RuntimeException{
    public UnAuthorizedException(String message){
        super(message);
    }
}
