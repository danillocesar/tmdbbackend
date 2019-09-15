package com.arctouch.tmdb.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.arctouch.tmdb.service.rest.ApiResponse;

public class ResponseEntityUtil {

	public static ResponseEntity<ApiResponse> okResponseEntity(String message, Object response){
		return new ResponseEntity<ApiResponse>(new ApiResponse(message, response), HttpStatus.OK);
	}
	public static ResponseEntity<ApiResponse> notFoundResponseEntity(String message, Object response){
		return new ResponseEntity<ApiResponse>(new ApiResponse(message, null), HttpStatus.NOT_FOUND);
	}
}
