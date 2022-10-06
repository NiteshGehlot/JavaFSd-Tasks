package com.star.restemsexception.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;

import com.star.restemsexception.exceptions.ErrorResponse;
import com.star.restemsexception.exceptions.UserNotFound;

@RestControllerAdvice
public class ExceptionController {
	
	 private String INCORRECT_REQUEST = "INCORRECT_REQUEST";

		
		  @ExceptionHandler(value = UserNotFound.class) 
		  public ResponseEntity<String> userNotFoundException(UserNotFound userNotFound) { 
			  return new ResponseEntity<String>("Employee Not Found",HttpStatus.NOT_FOUND);
		  
		  }
		  
		  @ExceptionHandler(value = Exception.class) 
		  public ResponseEntity<String> handler() { 
			  return new ResponseEntity<String>("Some Error Message",HttpStatus.BAD_REQUEST);
		  
		  }
		 

		/*
		 * @ExceptionHandler(value = UserNotFound.class) public final
		 * ResponseEntity<ErrorResponse> handleUserNotFoundException(UserNotFound
		 * ex,WebRequest request) { List<String> details = new ArrayList<>();
		 * details.add(ex.getLocalizedMessage()); System.out.println(details);
		 * ErrorResponse error = new ErrorResponse(INCORRECT_REQUEST, details); return
		 * new ResponseEntity<>(error, HttpStatus.NOT_FOUND); }
		 */

}
