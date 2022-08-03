package com.todeb.rnaylmz.createyourbestwedding.repository;

import com.todeb.rnaylmz.createyourbestwedding.model.entity.BusinessOption;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface IBusinessOptionRepository {
    Optional<BusinessOption> findSelectOwnerByName(String selectOwner);
}
