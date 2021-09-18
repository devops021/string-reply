package com.versiontwo.replyservice.exception;

public class InvalidInputException extends RuntimeException{

    private String message;

    public InvalidInputException(){
        super();
    }

    public InvalidInputException(String message){
        super(message);
        this.message = message;
    }

    public String getMessage(){
        return message;
    }
}
