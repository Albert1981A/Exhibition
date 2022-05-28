package com.AlbertAbuav.Exhibition.advice;

import com.AlbertAbuav.Exhibition.exceptions.ExhibitionSystemException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@ControllerAdvice
@RestController
public class CompanyControllerAdvice {

    @ExceptionHandler(value = {ExhibitionSystemException.class})
    @ResponseStatus(HttpStatus.BAD_REQUEST)  //==> Error message 400 (without the annotation it is 200)
    public ErrorDetails exceptionHandler(Exception e) {
        return new ErrorDetails("LOL", e.getMessage());
    }
}
