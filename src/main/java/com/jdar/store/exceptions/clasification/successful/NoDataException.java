package com.jdar.store.exceptions.clasification.successful;

import com.jdar.store.exceptions.clasification.CustomException;
import com.jdar.store.exceptions.constants.ExceptionCodes;
import org.springframework.http.HttpStatus;

public class NoDataException extends CustomException {

    public NoDataException(String message) {
        super(message);
        super.customMessage = ExceptionCodes.NO_DATA_EXCEPTION.name();
        super.httpStatus = HttpStatus.NO_CONTENT.value();
    }

    public NoDataException(String message, Throwable throwable) {
        super(message, throwable);
        super.customMessage = ExceptionCodes.NO_DATA_EXCEPTION.name();
        super.httpStatus = HttpStatus.NO_CONTENT.value();
    }

}
