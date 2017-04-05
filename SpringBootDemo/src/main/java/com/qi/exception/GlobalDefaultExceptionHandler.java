package com.qi.exception;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalDefaultExceptionHandler {
	
	 @ExceptionHandler(value = Exception.class)
	 public void defaultErrorHandler(HttpServletRequest req, Exception e)  {
		 
		 e.printStackTrace();
		 System.out.println(e.getMessage());
		 
	 }

}
