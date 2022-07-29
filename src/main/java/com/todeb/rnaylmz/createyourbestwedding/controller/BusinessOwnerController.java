package com.todeb.rnaylmz.createyourbestwedding.controller;

import com.todeb.rnaylmz.createyourbestwedding.model.entity.BusinessOwner;
import com.todeb.rnaylmz.createyourbestwedding.service.BusinessOwnerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/businessOwner")
public class BusinessOwnerController {

    @Autowired
    private BusinessOwnerService businessOwnerService;

    @GetMapping("/all")
    public ResponseEntity getAllBusinessOwner(){
        List<BusinessOwner> allBusinessOwner = businessOwnerService.getAllBusiness;
                return ResponseEntity.ok(allBusinessOwner);
    }
}
