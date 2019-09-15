package com.arctouch.tmdb.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.arctouch.tmdb.rest.ResponseEntityUtil;
import com.arctouch.tmdb.service.MovieService;
import com.arctouch.tmdb.service.rest.ApiResponse;


@RestController
@RequestMapping("/movies")
@CrossOrigin
public class MovieController {
	
	@Autowired
	MovieService movieService;
	
	@GetMapping("/upcoming")
	public ResponseEntity<ApiResponse> getUpcomingMovies(@RequestParam Integer page) {
		return ResponseEntityUtil.okResponseEntity("Success", movieService.getUpComingMovies(page));
	}
	@GetMapping("/query")
	public ResponseEntity<ApiResponse> findByQuery(@RequestParam String query, @RequestParam Integer page) {
		return ResponseEntityUtil.okResponseEntity("Success", movieService.findByQuery(query, page));
	}
}
