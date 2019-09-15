package com.arctouch.tmdb.service.rest;

import java.net.URI;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import com.arctouch.tmdb.model.MovieModel;

public abstract class TmdbRestService {

	@Autowired
	RestTemplate restTemplate;
	@Value("${tmdb.api.url}")
	private String tmdbUrl;
	@Value("${tmdb.api.access.token}")
	private String accessToken;
	
	protected MovieModel get(String path, MultiValueMap<String, String> params) {
		return get(path, params, MovieModel.class);
	}
	protected <T> T get(String path, MultiValueMap<String, String> params, Class<T> responseType) {
		if(params == null) params = new LinkedMultiValueMap<String, String>();
		
		params.add("api_key", accessToken);
		params.add("language", "en-US");
		URI uri = UriComponentsBuilder
		        .fromUriString(tmdbUrl + path)
		        .queryParams(params)
		        .build()
		        .toUri();
		return restTemplate.getForObject(uri, responseType);
	}
}
