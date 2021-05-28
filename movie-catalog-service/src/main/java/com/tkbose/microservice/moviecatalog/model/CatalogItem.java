package com.tkbose.microservice.moviecatalog.model;

public class CatalogItem {
	
	private String title;
	private int movieId;
	private double ratings;
	private int noOfVotes;
	String genre="";
	String leadMale="";
	String leadFemale="";
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getMovieId() {
		return movieId;
	}
	public void setMovieId(int movieId) {
		this.movieId = movieId;
	}
	public double getRatings() {
		return ratings;
	}
	public void setRatings(double ratings) {
		this.ratings = ratings;
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
	
	
	
	
	public int getNoOfVotes() {
		return noOfVotes;
	}
	public void setNoOfVotes(int noOfVotes) {
		this.noOfVotes = noOfVotes;
	}

	
	
	@Override
	public String toString() {
		return "CatalogItem [title=" + title + ", movieId=" + movieId + ", ratings=" + ratings + ", noOfVotes="
				+ noOfVotes + ", genre=" + genre + ", leadMale=" + leadMale + ", leadFemale=" + leadFemale + "]";
	}
	public CatalogItem(String title) {
		super();
		this.title = title;
	}
	public CatalogItem(String title, int movieId, String genre, String leadMale, String leadFemale) {
		super();
		this.title = title;
		this.movieId = movieId;
		this.genre = genre;
		this.leadMale = leadMale;
		this.leadFemale = leadFemale;
	}
	public CatalogItem() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public static CatalogItem getCatalogItemFromMovie(Movie movie) {
		return new CatalogItem(movie.getName(),movie.getMovieId(),movie.getGenre(),movie.getLeadMale(),movie.getLeadFemale());
	}
	

	
}
