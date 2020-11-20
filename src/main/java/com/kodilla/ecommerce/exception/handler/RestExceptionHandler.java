package com.kodilla.ecommerce.exception.handler;

import com.kodilla.ecommerce.exception.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class RestExceptionHandler extends ResponseEntityExceptionHandler {

    private static final Logger logger = LoggerFactory.getLogger(RestExceptionHandler.class);

    @ExceptionHandler({NotFoundException.class})
    public ResponseEntity<ApiError> handleBookExistException(NotFoundException ex) {
        return handleException(ex);
    }

    @ExceptionHandler({NotValidException.class})
    public ResponseEntity<ApiError> handleBookNotFoundException(NotValidException ex) {
        return handleException(ex);
    }

    @ExceptionHandler({ProductAlreadyExistException.class})
    public ResponseEntity<ApiError> handleCopyExistException(ProductAlreadyExistException ex) {
        return handleException(ex);
    }

    @ExceptionHandler({UserAlreadyBlockedException.class})
    public ResponseEntity<ApiError> handleCopyNotFoundException(UserAlreadyBlockedException ex) {
        return handleException(ex);
    }

    @ExceptionHandler({UserAlreadyExists.class})
    public ResponseEntity<ApiError> handleCopyIsBorrowedException(UserAlreadyExists ex) {
        return handleException(ex);
    }

    @ExceptionHandler({UserIsNotBlockedException.class})
    public ResponseEntity<ApiError> handleRentalExistException(UserIsNotBlockedException ex) {
        return handleException(ex);
    }

    private ResponseEntity<ApiError> handleException(RuntimeException ex) {
        String message = ex.getMessage();
        logger.error("ErrorMessage: {} , exceptionBody: {}", message, ex);
        final ApiError apiError = new ApiError(HttpStatus.BAD_REQUEST, message, ex);
        return new ResponseEntity<>(apiError, apiError.getStatus());
    }
}