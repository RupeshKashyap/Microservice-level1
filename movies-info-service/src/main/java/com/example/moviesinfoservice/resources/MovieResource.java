package com.example.moviesinfoservice.resources;

import com.example.moviesinfoservice.models.Movie;
import com.example.moviesinfoservice.models.MovieSummary;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
@RequestMapping("/movies")
public class MovieResource {

//    @Value("${api.key}")
//    private String apiKey;

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping()
    public String defaultMethod(){

        return  "Hello I am Movies service info";
    }
    @RequestMapping("/{movieId}")
    public Movie getMovieInfo(@PathVariable("movieId") String movieId) {
        System.out.println("movies info microservice executing"+movieId);

//        MovieSummary movieSummary = restTemplate.getForObject("https://api.themoviedb.org/3/movie/" + movieId + "?api_key=" +  apiKey, MovieSummary.class);
        MovieSummary movieSummary = new MovieSummary("123","hello brother","good");
        return new Movie(movieId, movieSummary.getTitle(), movieSummary.getOverview());

    }

}

