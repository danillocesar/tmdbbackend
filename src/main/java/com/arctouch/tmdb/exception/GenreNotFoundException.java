package com.arctouch.tmdb.exception;

public class GenreNotFoundException extends RuntimeException{

	private static final long serialVersionUID = -7565776951224979727L;

	public GenreNotFoundException() {
		super("Genre id not found in the service");
	}
}
