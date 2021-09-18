package com.versiontwo.replyservice.exception;

public class NoSuchAlgorithmException extends java.security.NoSuchAlgorithmException {

    private String message;

    public NoSuchAlgorithmException(){
        super();
    }

    public NoSuchAlgorithmException(String message){
        super(message);
        this.message = message;
    }

    public String getMessage(){
        return message;
    }
}
