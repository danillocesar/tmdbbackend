package com.arctouch.tmdb.model.helper;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.arctouch.tmdb.model.Genre;
import com.arctouch.tmdb.model.Movie;
import com.arctouch.tmdb.model.MovieModel;
import com.arctouch.tmdb.service.MovieService;

@Component
public class MovieHelper {

	@Autowired
	MovieService movieService;
	@Autowired
	GenreHelper genreHelper;
	
	public MovieModel populateGenresById(MovieModel model) {
		for(Movie movie : model.getResults()) {
			movie = populateGenresById(movie);
		}
		return model;
	}
	public Movie populateGenresById(Movie movie) {
		List<Genre> genres = new ArrayList<Genre>();
		for(Integer id : movie.getGenreIds()) {
			try {
				genres.add(genreHelper.findGenreById(id));
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println(e.getMessage());
			}
		}
		movie.setGenres(genres);
		return movie;
	}
}
