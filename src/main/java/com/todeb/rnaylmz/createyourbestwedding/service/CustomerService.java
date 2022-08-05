package com.todeb.rnaylmz.createyourbestwedding.service;

import com.todeb.rnaylmz.createyourbestwedding.model.dto.CustomerDTO;
import com.todeb.rnaylmz.createyourbestwedding.model.entity.Customer;
import com.todeb.rnaylmz.createyourbestwedding.model.mapper.CustomerMapper;
import com.todeb.rnaylmz.createyourbestwedding.repository.ICustomerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public abstract class CustomerService implements ICustomerRepository {

    private final ICustomerRepository ICustomerRepository;

    public List<Customer> getAllCustomer;


    public List<Customer> getAllCustomer(){
        List<Customer> allCustomers = ICustomerRepository.findAll();
        return allCustomers;
    }

    public Customer getById(Long id){
        Optional<Customer> byId = ICustomerRepository.findById(id);
        return byId.orElseThrow(() -> new RuntimeException("Customer does not found!"));
    }

    public Customer create(CustomerDTO customerDTO) {
        Customer customer = CustomerMapper.toEntity(customerDTO);
        return ICustomerRepository.save(customer);
    }
}
