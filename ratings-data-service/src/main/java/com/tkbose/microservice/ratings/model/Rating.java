package com.tkbose.microservice.ratings.model;

public class Rating {
	private String movieId;
	private double rating;
	private int noOfVotes;


	public String getMovieId() {
		return movieId;
	}

	public void setMovieId(String movieId) {
		this.movieId = movieId;
	}

	public double getRating() {
		return rating;
	}

	public void setRating(double rating) {
		this.rating = rating;
	}

	public int getNoOfVotes() {
		return noOfVotes;
	}

	public void setNoOfVotes(int noOfVotes) {
		this.noOfVotes = noOfVotes;
	}

	@Override
	public String toString() {
		return "Rating [movieId=" + movieId + ", rating=" + rating + ", noOfVotes=" + noOfVotes + "]";
	}

	public Rating() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Rating(String movieId, double rating, int noOfVotes) {
		super();
		this.movieId = movieId;
		this.rating = rating;
		this.noOfVotes = noOfVotes;
	}



}
