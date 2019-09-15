package com.arctouch.tmdb.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;

import com.arctouch.tmdb.model.Genre;
import com.arctouch.tmdb.model.Movie;
import com.arctouch.tmdb.model.MovieModel;
import com.arctouch.tmdb.model.helper.GenreHelper;
import com.arctouch.tmdb.model.helper.MovieHelper;
import com.arctouch.tmdb.service.rest.TmdbRestService;

@Service
public class MovieService extends TmdbRestService {
	@Autowired
	TmdbRestService restService;
	@Autowired
	MovieHelper movieHelper;
	@Value("${tmdb.api.upcoming-path}")
	private String upComingMoviesPath;
	@Value("${tmdb.api.query-path}")
	private String queryPath;
	
	public MovieModel getUpComingMovies(Integer page) {
		MultiValueMap<String, String> params = new LinkedMultiValueMap<String, String>();
		params.add("page", page.toString());
		MovieModel model = movieHelper.populateGenresById(get(upComingMoviesPath, params));
		return model;
	}
	public MovieModel findByQuery(String name, Integer page) {
		MultiValueMap<String, String> params = new LinkedMultiValueMap<String, String>();
		params.add("query", name);
		params.add("page", page.toString());
		MovieModel model = movieHelper.populateGenresById(get(queryPath, params));
		return model;
	}
}
