package com.todeb.rnaylmz.createyourbestwedding.repository;

import com.todeb.rnaylmz.createyourbestwedding.model.entity.BusinessOwner;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IBusinessOwnerRepository extends JpaRepository<BusinessOwner, String> {
}
