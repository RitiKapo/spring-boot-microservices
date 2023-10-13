package com.demo.ratingsdataservice.controller;

import com.demo.ratingsdataservice.entity.Rating;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ratings")
public class RatingsController {

    @GetMapping("/{movieID}")
    public Rating getRating(@PathVariable String movieID) {
        return new Rating(movieID, 4);
    }
}
