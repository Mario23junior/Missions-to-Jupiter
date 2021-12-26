package com.project.missaojupiter.exceptionHandlerErro;

import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.context.request.WebRequest;

import com.project.missaojupiter.exceptions.ReturnErrorMessage;

public class ExceptionHandlerErro {
   
	@ExceptionHandler(ReturnErrorMessage.class)
	@ResponseStatus(value = HttpStatus.NOT_FOUND)
	public ResponseErro NotValueData(ReturnErrorMessage ex, WebRequest request) {
		ResponseErro ErroReturn = new ResponseErro(
				HttpStatus.NOT_FOUND.value(),
				new Date(),
				ex.getMessage(),
				request.getDescription(false));
				
		return ErroReturn;
	}
	
	@ExceptionHandler(Exception.class)
	@ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR)
	public ResponseErro erroResponse (Exception ex, WebRequest request) {
		ResponseErro erroNative = new ResponseErro(
				HttpStatus.INTERNAL_SERVER_ERROR.value(),
				new Date(),
				ex.getMessage(), 
				request.getDescription(false));
		
		return erroNative;
	}
}
