package com.arctouch.tmdb.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class MovieModel {
	Integer page;
	@JsonProperty("total_pages")
	Integer totalPages;
	@JsonProperty("total_results")
	Integer totalResults;
	Dates dates;
	List<Movie> results;
	
	public Integer getPage() {
		return page;
	}
	public void setPage(Integer page) {
		this.page = page;
	}
	public List<Movie> getResults() {
		return results;
	}
	public void setResults(List<Movie> results) {
		this.results = results;
	}
	public Dates getDates() {
		return dates;
	}
	public void setDates(Dates dates) {
		this.dates = dates;
	}
	public Integer getTotalPages() {
		return totalPages;
	}
	public void setTotalPages(Integer totalPages) {
		this.totalPages = totalPages;
	}
	public Integer getTotalResults() {
		return totalResults;
	}
	public void setTotalResults(Integer totalResults) {
		this.totalResults = totalResults;
	}
}
