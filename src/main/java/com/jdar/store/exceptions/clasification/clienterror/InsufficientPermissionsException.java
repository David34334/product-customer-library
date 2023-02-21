package com.jdar.store.exceptions.clasification.clienterror;

import com.jdar.store.exceptions.clasification.CustomException;
import com.jdar.store.exceptions.constants.ExceptionCodes;
import org.springframework.http.HttpStatus;

public class InsufficientPermissionsException extends CustomException {

    public InsufficientPermissionsException(String message) {
        super(message);
        super.customMessage = ExceptionCodes.UNAUTHORIZED_EXCEPTION.name();
        super.httpStatus = HttpStatus.UNAUTHORIZED.value();
    }

    public InsufficientPermissionsException(String message, Throwable throwable) {
        super(message, throwable);
        super.customMessage = ExceptionCodes.UNAUTHORIZED_EXCEPTION.name();
        super.httpStatus = HttpStatus.UNAUTHORIZED.value();
    }

}
