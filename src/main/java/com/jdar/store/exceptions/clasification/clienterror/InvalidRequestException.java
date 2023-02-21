package com.jdar.store.exceptions.clasification.clienterror;

import com.jdar.store.exceptions.clasification.CustomException;
import com.jdar.store.exceptions.constants.ExceptionCodes;
import org.springframework.http.HttpStatus;

public class InvalidRequestException extends CustomException {

    public InvalidRequestException(String message) {
        super(message);
        super.customMessage = ExceptionCodes.INVALID_REQUEST_EXCEPTION.name();
        super.httpStatus = HttpStatus.BAD_REQUEST.value();
    }

    public InvalidRequestException(String message, Throwable throwable) {
        super(message, throwable);
        super.customMessage = ExceptionCodes.INVALID_REQUEST_EXCEPTION.name();
        super.httpStatus = HttpStatus.BAD_REQUEST.value();
    }

}
