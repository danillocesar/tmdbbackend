package com.arctouch.tmdb.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Movie {
	@JsonProperty("poster_path")
	String posterPath;
	Boolean adult;
	String overview;
	@JsonProperty("release_date")
	String releaseDate;
	@JsonProperty("genre_ids")
	List<Integer> genreIds;
	Integer id;
	@JsonProperty("original_title")
	String originalTitle;
	@JsonProperty("original_language")
	String originalLanguage;
	String title;
	@JsonProperty("backdrop_path")
	String backdropPath;
	Integer popularity;
	@JsonProperty("vote_count")
	Integer voteCount;
	Boolean video;
	@JsonProperty("vote_average")
	Integer voteAverage;
	List<Genre> genres;
	
	public String getPosterPath() {
		return posterPath;
	}
	public void setPosterPath(String posterPath) {
		this.posterPath = posterPath;
	}
	public Boolean getAdult() {
		return adult;
	}
	public void setAdult(Boolean adult) {
		this.adult = adult;
	}
	public String getOverview() {
		return overview;
	}
	public void setOverview(String overview) {
		this.overview = overview;
	}
	public String getReleaseDate() {
		return releaseDate;
	}
	public void setReleaseDate(String releaseDate) {
		this.releaseDate = releaseDate;
	}
	public List<Integer> getGenreIds() {
		return genreIds;
	}
	public void setGenreIds(List<Integer> genreIds) {
		this.genreIds = genreIds;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getOriginalTitle() {
		return originalTitle;
	}
	public void setOriginalTitle(String originalTitle) {
		this.originalTitle = originalTitle;
	}
	public String getOriginalLanguage() {
		return originalLanguage;
	}
	public void setOriginalLanguage(String originalLanguage) {
		this.originalLanguage = originalLanguage;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getBackdropPath() {
		return backdropPath;
	}
	public void setBackdropPath(String backdropPath) {
		this.backdropPath = backdropPath;
	}
	public Integer getPopularity() {
		return popularity;
	}
	public void setPopularity(Integer popularity) {
		this.popularity = popularity;
	}
	public Integer getVoteCount() {
		return voteCount;
	}
	public void setVoteCount(Integer voteCount) {
		this.voteCount = voteCount;
	}
	public Boolean getVideo() {
		return video;
	}
	public void setVideo(Boolean video) {
		this.video = video;
	}
	public Integer getVoteAverage() {
		return voteAverage;
	}
	public void setVoteAverage(Integer voteAverage) {
		this.voteAverage = voteAverage;
	}
	public List<Genre> getGenres() {
		return genres;
	}
	public void setGenres(List<Genre> genres) {
		this.genres = genres;
	}
}
