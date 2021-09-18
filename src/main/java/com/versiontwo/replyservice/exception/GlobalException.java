package com.versiontwo.replyservice.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.security.NoSuchAlgorithmException;

@ControllerAdvice
public class GlobalException {
    @ExceptionHandler(InvalidInputException.class)
    @ResponseStatus(value = HttpStatus.BAD_REQUEST)
    public @ResponseBody ExceptionResponse handleInvalidInput(final InvalidInputException invalidInputException){
        ExceptionResponse exceptionResponse = new ExceptionResponse();
        exceptionResponse.setErrorMessage(invalidInputException.getMessage());
        return exceptionResponse;
    }

    @ExceptionHandler(NoSuchAlgorithmException.class)
    @ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR)
    public @ResponseBody ExceptionResponse handleNoSuchAlgorithm(final NoSuchAlgorithmException noSuchAlgorithmException){
        ExceptionResponse exceptionResponse = new ExceptionResponse();
        exceptionResponse.setErrorMessage(noSuchAlgorithmException.getMessage());
        return exceptionResponse;
    }
}