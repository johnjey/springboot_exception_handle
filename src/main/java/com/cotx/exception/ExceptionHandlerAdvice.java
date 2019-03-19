package com.cotx.exception;

import com.cotx.Result;
import com.cotx.utils.ResultUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.MethodParameter;
import org.springframework.http.MediaType;
import org.springframework.http.server.ServerHttpRequest;
import org.springframework.http.server.ServerHttpResponse;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.ResponseBodyAdvice;

import java.util.List;

@RestControllerAdvice
public class ExceptionHandlerAdvice implements ResponseBodyAdvice {

    private Logger logger = LoggerFactory.getLogger(ExceptionHandlerAdvice.class);
    private ThreadLocal<Object> modelHolder = new ThreadLocal<>();

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public Result handleIllegalParamException(MethodArgumentNotValidException e){
        List<ObjectError> errors = e.getBindingResult().getAllErrors();
        for (ObjectError error : errors) {
            logger.warn(error.getDefaultMessage());
        }
        return ResultUtils.warn(ResultCode.PARAMETER_ERROR, errors.get(0).getDefaultMessage());
    }

    @Override
    public boolean supports(MethodParameter methodParameter, Class aClass) {
        return false;
    }

    @Override
    public Object beforeBodyWrite(Object body, MethodParameter methodParameter, MediaType mediaType, Class aClass, ServerHttpRequest serverHttpRequest, ServerHttpResponse serverHttpResponse) {
        modelHolder.remove();
        return body;
    }
}
