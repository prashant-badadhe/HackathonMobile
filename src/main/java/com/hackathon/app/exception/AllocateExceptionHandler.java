package com.hackathon.app.exception;

import org.springframework.http.HttpStatus;
import org.springframework.validation.Errors;

public class AllocateExceptionHandler extends Exception {
	
	public AllocateExceptionHandler(Errors errors, HttpStatus badRequest) {
	
	}

}
