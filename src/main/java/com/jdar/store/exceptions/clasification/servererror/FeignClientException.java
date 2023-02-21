package com.jdar.store.exceptions.clasification.servererror;

import com.jdar.store.exceptions.clasification.CustomException;
import com.jdar.store.exceptions.constants.ExceptionCodes;
import org.springframework.http.HttpStatus;

public class FeignClientException extends CustomException {

    public FeignClientException(String message) {
        super(message);
        super.customMessage = ExceptionCodes.COMMUNICATION_EXCEPTION.name();
        super.httpStatus = HttpStatus.GATEWAY_TIMEOUT.value();
    }

    public FeignClientException(String message, Throwable throwable) {
        super(message, throwable);
        super.customMessage = ExceptionCodes.COMMUNICATION_EXCEPTION.name();
        super.httpStatus = HttpStatus.GATEWAY_TIMEOUT.value();
    }

}
