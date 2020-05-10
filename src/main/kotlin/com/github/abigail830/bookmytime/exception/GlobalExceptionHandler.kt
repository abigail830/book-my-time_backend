package com.github.abigail830.bookmytime.exception

import com.github.abigail830.bookmytime.infrastructure.util.JsonUtil
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.ControllerAdvice
import org.springframework.web.bind.annotation.ExceptionHandler
import org.springframework.web.bind.annotation.ResponseBody

@ControllerAdvice
class GlobalExceptionHandler {

    @ExceptionHandler(value = [BizException::class])
    @ResponseBody
    fun bizExceptionHandler(e: BizException): ResponseEntity<*>? {
        val errorResponse = e.message
        return ResponseEntity<Any?>(JsonUtil.toJson(errorResponse), HttpStatus.BAD_REQUEST)
    }

}