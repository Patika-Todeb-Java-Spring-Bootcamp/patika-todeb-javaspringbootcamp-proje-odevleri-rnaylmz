package com.todeb.rnaylmz.createyourbestwedding.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {

    @GetMapping(
            path = "/welcome"
    )

    public String welcomeMessageApı(){
        String welcomeMessage = "Welcome to Create Your Best Wedding";
        return welcomeMessage;
    }
}
