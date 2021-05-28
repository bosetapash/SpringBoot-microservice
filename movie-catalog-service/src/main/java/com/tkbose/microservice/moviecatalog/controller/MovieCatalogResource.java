package com.tkbose.microservice.moviecatalog.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.tkbose.microservice.moviecatalog.model.CatalogItem;
import com.tkbose.microservice.moviecatalog.model.Movie;
import com.tkbose.microservice.moviecatalog.model.Rating;
import com.tkbose.microservice.repository.CatalogRepo;

@RestController
@RequestMapping("/catalog")
public class MovieCatalogResource {
	
	@Autowired
	private RestTemplate restTemplate;
	@Autowired
	private CatalogRepo repo;

	@RequestMapping("/{userId}")
	public List<CatalogItem> getCatalog(@PathVariable("userId") String userId){
		List<String> movieList = repo.getCatalogByUserId(userId);
		List<CatalogItem> catalog = Arrays.asList();
		if(movieList.size()!=0)
		{
		catalog = movieList.stream().map(s->{
	
			Movie movie = restTemplate.getForObject("http://movie-info-service/movies/"+s, Movie.class);
			return CatalogItem.getCatalogItemFromMovie(movie);
			
		}).collect(Collectors.toList());
		}
		
		catalog = catalog.stream()
		     .map(s ->{
		    	 Rating rating = restTemplate.getForObject("http://ratings-service/ratings/"+s.getMovieId(), Rating.class);
		    	 s.setRatings(rating.getRating());
		    	 s.setNoOfVotes(rating.getNoOfVotes() );
		    	 return s;
		     })
		     .collect(Collectors.toList());
		return catalog;
		
	}
}
