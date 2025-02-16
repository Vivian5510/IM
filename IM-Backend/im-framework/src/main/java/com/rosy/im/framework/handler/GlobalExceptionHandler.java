package com.rosy.im.framework.handler;

import com.rosy.im.common.domain.entity.ApiResponse;
import com.rosy.im.common.enums.ErrorCode;
import com.rosy.im.common.exception.BusinessException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * 全局异常处理器
 */
@RestControllerAdvice
@Slf4j
public class GlobalExceptionHandler {

    @ExceptionHandler(BusinessException.class)
    public ApiResponse businessExceptionHandler(BusinessException e) {
        log.error("BusinessException", e);
        return ApiResponse.error(e.getCode(), e.getMessage());
    }

    @ExceptionHandler(RuntimeException.class)
    public ApiResponse runtimeExceptionHandler(RuntimeException e) {
        log.error("RuntimeException", e);
        return ApiResponse.error(ErrorCode.SYSTEM_ERROR.getCode(), ErrorCode.SYSTEM_ERROR.getMessage());
    }
}
