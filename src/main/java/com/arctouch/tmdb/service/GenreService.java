package com.arctouch.tmdb.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import com.arctouch.tmdb.model.Genre;
import com.arctouch.tmdb.model.GenreModel;
import com.arctouch.tmdb.service.rest.TmdbRestService;

@Service
public class GenreService extends TmdbRestService {
	@Value("${tmdb.api.genres-path}")
	private String genresPath;
	
	@Cacheable("genres")
	public List<Genre> genres(){
		return get(genresPath, null,  GenreModel.class).getGenres();
	}
}
