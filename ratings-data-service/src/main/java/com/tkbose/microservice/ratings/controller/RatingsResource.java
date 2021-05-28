package com.tkbose.microservice.ratings.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tkbose.microservice.ratings.model.Rating;
import com.tkbose.microservice.repository.RatingRepo;

@RestController
@RequestMapping("/ratings")
public class RatingsResource {
	@Autowired
	private RatingRepo repo;
	
	@RequestMapping("/{movieId}")
	public Rating getRating(@PathVariable("movieId") String movieId){
		
		return repo.getRating(movieId);
		
	}
}
