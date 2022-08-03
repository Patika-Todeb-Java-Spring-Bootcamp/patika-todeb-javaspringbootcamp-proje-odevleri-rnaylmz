package com.todeb.rnaylmz.createyourbestwedding.service;

import com.todeb.rnaylmz.createyourbestwedding.model.entity.BusinessOwner;
import com.todeb.rnaylmz.createyourbestwedding.model.entity.Customer;
import com.todeb.rnaylmz.createyourbestwedding.repository.ICustomerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public abstract class CustomerService implements ICustomerRepository {

    private final ICustomerRepository customerRepository;

    public List<Customer> getAllCustomer;


    public List<Customer> getAllCustomer(){
        List<Customer> allBusinessOwner = customerRepository.findAll();
        return getAllCustomer();
    }
}
