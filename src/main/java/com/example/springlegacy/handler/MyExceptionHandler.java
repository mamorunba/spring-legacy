package com.example.springlegacy.handler;

import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@RestControllerAdvice
public class MyExceptionHandler extends ResponseEntityExceptionHandler {
    private static Logger logger = LoggerFactory.getLogger(MyExceptionHandler.class);

    @Autowired
	MessageSource messages;

	@Override
    protected ResponseEntity<Object> handleExceptionInternal(Exception ex, Object body, HttpHeaders headers,
            HttpStatus status, WebRequest request) {

    	String msg = messages.getMessage("msg.error.fatal", null, Locale.getDefault());
        logger.error(msg, ex);
        return super.handleExceptionInternal(ex, body, headers, status, request);
    }

    @ExceptionHandler(Exception.class)
    public ResponseEntity<Object> handleAllException(Exception ex, WebRequest request) {
    	System.out.println("handleAllException");
        return handleExceptionInternal(ex, "test", new HttpHeaders(), HttpStatus.INTERNAL_SERVER_ERROR, request);
    }
}
