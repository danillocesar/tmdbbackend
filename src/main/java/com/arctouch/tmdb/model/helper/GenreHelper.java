package com.arctouch.tmdb.model.helper;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import com.arctouch.tmdb.exception.GenreNotFoundException;
import com.arctouch.tmdb.model.Genre;
import com.arctouch.tmdb.service.GenreService;

@Component
public class GenreHelper {

	@Autowired
	GenreService genreService;
	
	@Bean
	public List<Genre> genres(){
		return genreService.genres();
	}
	
	public Genre findGenreById(int id) {
		for(Genre genre : genres()) {
			if(genre.getId() == id) return genre;
		}
		throw new GenreNotFoundException();
	}
}
