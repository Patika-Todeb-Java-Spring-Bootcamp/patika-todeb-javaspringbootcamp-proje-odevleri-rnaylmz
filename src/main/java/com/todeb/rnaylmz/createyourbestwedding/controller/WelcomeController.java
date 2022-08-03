package com.todeb.rnaylmz.createyourbestwedding.controller;

import com.todeb.rnaylmz.createyourbestwedding.model.ResponseModel;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {

    @GetMapping(path = "/welcome")

    public ResponseModel welcomeMessageApı(){
        String welcomeMessage = "Welcome to Create Your Best Wedding Application";
        ResponseModel responseModel = new ResponseModel();
        responseModel.setWelcomeMessage(welcomeMessage);
        return responseModel;
    }
}
