package com.tkbose.microservice.repository;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Repository;

import com.tkbose.microservice.movieinfo.model.Movie;

@Repository
public class MovieInfoRepo {
	
	private List<Movie> movies = Arrays.asList(
			new Movie(1,"Speed","Action","Keanu Reeves","Sandra Bullock"),
			new Movie(2,"The Spy Who loved me","007","Roger Moore","Barbara Bach"),
			new Movie(3,"Avatar","Fantasy","Sam Worthington","Zoe Saldana"),
			new Movie(4,"Hard Target","Action","Jean-Claude Van Damme","Yancy Butler"),
			new Movie(5,"Terminator2","Action Sci-Fi","Arnold Schwarzenegger","Linda Hamilton"));
	
	public Movie getMovieInfo(String name) {
		List<Movie> movieInfo = movies.parallelStream()
				.filter(s->s.getName().contentEquals(name))
				.collect(Collectors.toList());
		
		if(movieInfo.size()==0)
			return new Movie();
		else
			return movieInfo.get(0);
	}
	
	public Movie getMovieInfoById(int id) {
		List<Movie> movieInfo = movies.parallelStream()
				.filter(s->s.getMovieId()==id)
				.collect(Collectors.toList());
		
		if(movieInfo.size()==0)
			return new Movie();
		else
			return movieInfo.get(0);
	}
	
}
