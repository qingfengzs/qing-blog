package com.qingfeng.qingblog.exception;

import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@ControllerAdvice
@Component
public class GlobalExceptionHandler  {
    private static final Logger logger = LoggerFactory.getLogger(GlobalExceptionHandler.class);

    @ExceptionHandler(Exception.class)
    @ResponseBody
    public String handleException(Exception e){
        logger.error(e.getMessage(),e);
        return e.getMessage();
    }

    @ExceptionHandler(MethodArgumentNotValidException.class)
    @ResponseBody
    public String validationExceptionHandler(MethodArgumentNotValidException e){
        BindingResult result = e.getBindingResult();
        final List<FieldError> fieldErrorList = result.getFieldErrors();
        StringBuilder builder = new StringBuilder();

        for(FieldError error : fieldErrorList){
            builder.append("\n" + error.getDefaultMessage());
        }
        logger.error(builder.toString());
        return builder.toString();
    }
}
