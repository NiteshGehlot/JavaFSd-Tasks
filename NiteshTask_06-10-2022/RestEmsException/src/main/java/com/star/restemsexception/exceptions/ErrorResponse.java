package com.star.restemsexception.exceptions;

import java.util.List;

public class ErrorResponse {
	
	public ErrorResponse(String message, List<String> details) {
        super();
        this.message = message;
        this.details = details;
    }
  
    private String message;
    private List<String> details;

}
