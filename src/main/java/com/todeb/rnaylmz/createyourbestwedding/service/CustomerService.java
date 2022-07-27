package com.todeb.rnaylmz.createyourbestwedding.service;

import com.todeb.rnaylmz.createyourbestwedding.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public abstract class CustomerService implements CustomerRepository {

    private final CustomerRepository customerRepository;

    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }
}
