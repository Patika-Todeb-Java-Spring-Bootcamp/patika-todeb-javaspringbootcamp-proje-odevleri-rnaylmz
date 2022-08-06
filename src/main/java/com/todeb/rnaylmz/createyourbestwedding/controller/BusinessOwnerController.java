package com.todeb.rnaylmz.createyourbestwedding.controller;

import com.todeb.rnaylmz.createyourbestwedding.model.entity.BusinessOwner;
import com.todeb.rnaylmz.createyourbestwedding.service.BusinessOwnerService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Validated
@RestController
@RequiredArgsConstructor
@RequestMapping("/businessOwner")
public class BusinessOwnerController {
    private BusinessOwnerService businessOwnerService;

    @GetMapping("/all")
    public ResponseEntity getAllBusinessOwner(){
        List<BusinessOwner> allBusinessOwner = businessOwnerService.getAllBusiness;
                return ResponseEntity.ok(allBusinessOwner);
    }


}
