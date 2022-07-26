package com.todeb.rnaylmz.createyourbestwedding.service;

import com.todeb.rnaylmz.createyourbestwedding.model.entity.BusinessOwner;
import com.todeb.rnaylmz.createyourbestwedding.model.entity.Photograph;
import com.todeb.rnaylmz.createyourbestwedding.repository.IBusinessOwnerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public abstract class BusinessOwnerService implements IBusinessOwnerRepository {

    private final IBusinessOwnerRepository businessOwnerRepository;

    public List<BusinessOwner> getAllBusiness;

    public List<BusinessOwner> getAllBusinessOwner(){
        List<BusinessOwner> allBusinessOwner = businessOwnerRepository.findAll();
        return getAllBusinessOwner();
    }


   /* public List<Photograph> getAllPhotographsByBusinessOwner(Long iban) {
        BusinessOwner byId = getById(iban);
        return byId.getPhotograph();
    }*/
}
