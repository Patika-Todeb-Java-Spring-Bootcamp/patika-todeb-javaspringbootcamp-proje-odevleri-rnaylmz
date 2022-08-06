package com.todeb.rnaylmz.createyourbestwedding.repository;

import com.todeb.rnaylmz.createyourbestwedding.model.entity.BusinessOwner;
import com.todeb.rnaylmz.createyourbestwedding.model.entity.Photograph;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface IBusinessOwnerRepository extends JpaRepository<BusinessOwner, String> {


    Optional<BusinessOwner> findById(Long iban);

}
