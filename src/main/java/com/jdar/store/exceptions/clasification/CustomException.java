package com.jdar.store.exceptions.clasification;

import com.jdar.store.exceptions.constants.ExceptionCodes;
import org.springframework.http.HttpStatus;

public class CustomException extends RuntimeException {

    protected String customMessage;
    protected int httpStatus;

    public CustomException(String message) {
        super(message);
        this.customMessage = ExceptionCodes.CUSTOM_EXCEPTION.name();
        this.httpStatus = HttpStatus.INTERNAL_SERVER_ERROR.value();
    }

    public CustomException(String message, Throwable throwable) {
        super(message, throwable);
        this.customMessage = ExceptionCodes.CUSTOM_EXCEPTION.name();
        this.httpStatus = HttpStatus.INTERNAL_SERVER_ERROR.value();
    }

    public CustomException(String message, int httpStatus, Throwable throwable) {
        super(message, throwable);
        this.customMessage = ExceptionCodes.CUSTOM_EXCEPTION.name();
        this.httpStatus = httpStatus;
    }

    public String getCustomMessage() {
        return customMessage;
    }

    public void setCustomMessage(String customMessage) {
        this.customMessage = customMessage;
    }

    public int getHttpStatus() {
        return httpStatus;
    }

    public void setHttpStatus(int httpStatus) {
        this.httpStatus = httpStatus;
    }

}
