package com.todeb.rnaylmz.createyourbestwedding.service;

import org.springframework.stereotype.Service;

@Service
public class PhotographService {

    private final PhotographService photographService;

    public PhotographService(PhotographService photographService) {
        this.photographService = photographService;
    }
}
