package com.todeb.rnaylmz.createyourbestwedding.repository;

import com.todeb.rnaylmz.createyourbestwedding.model.entity.User;
import org.springframework.stereotype.Repository;

@Repository
public interface IUserRepository {
    User findByUserName(String username);
}

