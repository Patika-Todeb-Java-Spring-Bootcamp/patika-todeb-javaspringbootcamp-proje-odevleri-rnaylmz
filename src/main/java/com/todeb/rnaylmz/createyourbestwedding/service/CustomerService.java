package com.todeb.rnaylmz.createyourbestwedding.service;

import com.todeb.rnaylmz.createyourbestwedding.repository.ICustomerRepository;
import org.springframework.stereotype.Service;

@Service
public abstract class CustomerService implements ICustomerRepository {

    private final ICustomerRepository customerRepository;

    public CustomerService(ICustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }
}
