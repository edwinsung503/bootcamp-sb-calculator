package com.vtxlab.bootcamp.democalculator.exception;

import org.springframework.beans.TypeMismatchException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.client.RestClientException;
import com.vtxlab.bootcamp.democalculator.infra.ApiResponse;
import com.vtxlab.bootcamp.democalculator.infra.Syscode;

@RestControllerAdvice
public class GlobalExceptionHandler {
  
    @ExceptionHandler(Exception.class)
    @ResponseStatus(value = HttpStatus.BAD_REQUEST)
    public ApiResponse<Void> ExceptionHanlder(){
        return ApiResponse.<Void>builder()
            .status(Syscode.UNKNOWN_ERROR)
            .build();
    }
    
    @ExceptionHandler(TypeMismatchException.class)
    @ResponseStatus(value = HttpStatus.BAD_REQUEST)
    public ApiResponse<Void> TypeMismatchExceptionHanlder(){
        return ApiResponse.<Void>builder()
            .status(Syscode.INVALID_RESPONSE)
            .build();
    }
}
