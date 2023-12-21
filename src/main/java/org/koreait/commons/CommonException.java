package org.koreait.commons;

import org.springframework.http.HttpStatus;

import java.util.ResourceBundle;

/**
 * 공통 예외
 * */
public class CommonException extends RuntimeException{
    private static ResourceBundle bundleValidation;
    private static ResourceBundle bundleError;

    protected HttpStatus httpStatus;
    static {
        bundleValidation = ResourceBundle.getBundle("messages.validations");
        bundleError = ResourceBundle.getBundle("message.errors");
    }

    public CommonException(String message, HttpStatus httpStatus) {
        super(message);
        this.httpStatus = httpStatus;
    }
}
