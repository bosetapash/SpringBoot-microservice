package com.tkbose.microservice.movieinfo.model;

public class Movie {
	private int movieId=-111;
	private String name="";
	String genre="";
	String leadMale="";
	String leadFemale="";
	
	


	public int getMovieId() {
		return movieId;
	}

	public void setMovieId(int movieId) {
		this.movieId = movieId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public String getLeadMale() {
		return leadMale;
	}

	public void setLeadMale(String leadMale) {
		this.leadMale = leadMale;
	}

	public String getLeadFemale() {
		return leadFemale;
	}

	public void setLeadFemale(String leadFemale) {
		this.leadFemale = leadFemale;
	}

	public Movie(int movieId, String name, String genre, String leadMale, String leadFemale) {
		super();
		this.movieId = movieId;
		this.name = name;
		this.genre = genre;
		this.leadMale = leadMale;
		this.leadFemale = leadFemale;
	}

	public Movie() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Movie [movieId=" + movieId + ", name=" + name + ", genre=" + genre + ", leadMale=" + leadMale
				+ ", leadFemale=" + leadFemale + "]";
	}


	
	
	

}
