package com.todeb.rnaylmz.createyourbestwedding.repository;

import com.todeb.rnaylmz.createyourbestwedding.model.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.management.relation.Relation;
import java.util.List;

@Repository
public interface IUserRepository extends JpaRepository<User, Integer> {


    boolean existsByUsername(String username);


    @Transactional
    void deleteByUsername(String username);

   User findByUsername(String username);



}

