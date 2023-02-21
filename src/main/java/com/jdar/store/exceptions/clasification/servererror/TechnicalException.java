package com.jdar.store.exceptions.clasification.servererror;

import com.jdar.store.exceptions.clasification.CustomException;
import com.jdar.store.exceptions.constants.ExceptionCodes;
import org.springframework.http.HttpStatus;

public class TechnicalException extends CustomException {

    public TechnicalException(String message) {
        super(message);
        super.customMessage = ExceptionCodes.TECHNICAL_EXCEPTION.name();
        super.httpStatus = HttpStatus.INTERNAL_SERVER_ERROR.value();
    }

    public TechnicalException(String message, Throwable throwable) {
        super(message, throwable);
        super.customMessage = ExceptionCodes.TECHNICAL_EXCEPTION.name();
        super.httpStatus = HttpStatus.INTERNAL_SERVER_ERROR.value();
    }

}
