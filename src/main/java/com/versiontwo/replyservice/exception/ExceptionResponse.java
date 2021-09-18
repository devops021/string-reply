package com.versiontwo.replyservice.exception;

public class ExceptionResponse {

    private String errorMessage;

    public ExceptionResponse(){
        super();
    }

    public ExceptionResponse(String errorMessage){
        super();
        this.errorMessage = errorMessage;
    }

    public void setErrorMessage(String errorMessage){
        this.errorMessage = errorMessage;
    }

    public String getErrorMessage(){
        return errorMessage;
    }
}
