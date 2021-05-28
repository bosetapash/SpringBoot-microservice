package com.tkbose.microservice.movieinfo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tkbose.microservice.movieinfo.model.Movie;
import com.tkbose.microservice.repository.MovieInfoRepo;

@RestController
@RequestMapping("/movies")
public class MovieResource {

	@Autowired
	MovieInfoRepo movieInfoRepo;
	@RequestMapping("/{movieName}")
	public Movie getMovieInfo(@PathVariable("movieName") String movieName){
		
		return movieInfoRepo.getMovieInfo(movieName);
		
	}
}
