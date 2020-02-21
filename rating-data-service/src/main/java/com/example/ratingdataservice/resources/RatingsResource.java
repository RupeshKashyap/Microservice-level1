package com.example.ratingdataservice.resources;

import com.example.ratingdataservice.models.Rating;
import com.example.ratingdataservice.models.UserRating;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/ratingsdata")
public class RatingsResource {

    @RequestMapping()
    public String defaultMethod(){

        return  "Hello I am ratig-data-service";
    }

    @RequestMapping("/movies/{movieId}")
    public Rating getMovieRating(@PathVariable("movieId") String movieId) {
        return new Rating(movieId, 4);
    }

    @RequestMapping("/user/{userId}")
    public UserRating getUserRatings(@PathVariable("userId") String userId) {
        System.out.println("rating microserice calling getUserRatings  " + userId);
        List<Rating> ratings = Arrays.asList(
                                new Rating("1234",4),
                                new Rating("7777",3)
        );
        UserRating userRating = new UserRating();
//        userRating.initData(userId);
        userRating.setRatings(ratings);
        return userRating;

    }

}
