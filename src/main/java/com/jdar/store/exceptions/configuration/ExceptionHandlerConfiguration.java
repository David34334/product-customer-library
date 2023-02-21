package com.jdar.store.exceptions.configuration;

import com.jdar.store.exceptions.clasification.CustomException;
import com.jdar.store.model.dto.DataResponse;
import com.jdar.store.model.dto.ErrorDetails;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.time.LocalDateTime;

@ControllerAdvice
@Configuration
public class ExceptionHandlerConfiguration extends ResponseEntityExceptionHandler {

    @ExceptionHandler(CustomException.class)
    public final ResponseEntity<DataResponse<Object>> handleAllExceptions(CustomException customException) {
        ErrorDetails errorDetails = ErrorDetails.builder()
                .exceptionType(customException.getCustomMessage())
                .timestamp(LocalDateTime.now())
                .description(customException.getMessage())
                .httpStatus(customException.getHttpStatus())
                .build();
        return new ResponseEntity<>(DataResponse.builder().errorDetails(errorDetails).build(), HttpStatus.OK);
    }

}
