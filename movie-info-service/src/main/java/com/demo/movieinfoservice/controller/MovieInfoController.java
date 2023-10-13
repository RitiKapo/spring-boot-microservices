package com.demo.movieinfoservice.controller;

import com.demo.movieinfoservice.entity.Movie;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/movies")
public class MovieInfoController {
    @GetMapping("/{movieID}")
    public Movie getMovieInfo(@PathVariable String movieID) {
        return new Movie(movieID, "Test name");
    }
}
