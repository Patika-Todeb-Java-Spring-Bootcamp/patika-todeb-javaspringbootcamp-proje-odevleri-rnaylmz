package com.todeb.rnaylmz.createyourbestwedding.repository;

import com.todeb.rnaylmz.createyourbestwedding.model.entity.User;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IUserRepository {
    User findByUserName(String username);

    List<User> findAll();

    User findByUsername(String username);

    boolean existsByUsername(String username);

    void save(User user);

    void deleteByUsername(String username);

}

