package com.todeb.rnaylmz.createyourbestwedding.service;

import com.todeb.rnaylmz.createyourbestwedding.repository.BusinessOwnerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public abstract class BusinessOwnerService implements BusinessOwnerRepository {

    @Autowired
    private BusinessOwnerRepository businessOwnerRepository;
}
