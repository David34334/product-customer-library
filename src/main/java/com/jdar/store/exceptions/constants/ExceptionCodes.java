package com.jdar.store.exceptions.constants;

import com.jdar.store.exceptions.clasification.CustomException;
import com.jdar.store.exceptions.clasification.clienterror.InvalidRequestException;
import com.jdar.store.exceptions.clasification.servererror.FeignClientException;
import com.jdar.store.exceptions.clasification.servererror.TechnicalException;
import com.jdar.store.exceptions.clasification.clienterror.InsufficientPermissionsException;
import com.jdar.store.exceptions.clasification.successful.NoDataException;

public enum ExceptionCodes {

    CUSTOM_EXCEPTION(CustomException.class),
    TECHNICAL_EXCEPTION(TechnicalException.class),
    INVALID_REQUEST_EXCEPTION(InvalidRequestException.class),
    UNAUTHORIZED_EXCEPTION(InsufficientPermissionsException.class),
    NO_DATA_EXCEPTION(NoDataException.class),
    COMMUNICATION_EXCEPTION(FeignClientException.class);

    private final Class<? extends CustomException> exceptionClass;

    ExceptionCodes(final Class<? extends CustomException> exceptionClass) {
        this.exceptionClass = exceptionClass;
    }

}