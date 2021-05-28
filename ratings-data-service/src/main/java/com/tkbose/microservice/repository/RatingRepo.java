package com.tkbose.microservice.repository;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Repository;

import com.tkbose.microservice.ratings.model.Rating;

@Repository
public class RatingRepo {
	
	List<Rating> ratings = Arrays.asList(
			new Rating("1",7.2,335687),
			new Rating("2",7.1,100505),
			new Rating("3",7.8,1135542),
			new Rating("4",6.2,45902),
			new Rating("5",8.5,1011287)
			);
	
	public Rating getRating(String movieId)
	{
		List<Rating> rating =  ratings.stream().filter(s->s.getMovieId().equals(movieId))
				      .collect(Collectors.toList());
		return (rating!=null && rating.size()!=0)?rating.get(0):new Rating(movieId,-99,-9999);
	}
	
}
