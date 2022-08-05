package com.todeb.rnaylmz.createyourbestwedding.service;

import com.todeb.rnaylmz.createyourbestwedding.model.dto.CustomerDTO;
import com.todeb.rnaylmz.createyourbestwedding.model.entity.Customer;
import com.todeb.rnaylmz.createyourbestwedding.model.mapper.CustomerMapper;
import com.todeb.rnaylmz.createyourbestwedding.repository.ICustomerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public abstract class CustomerService extends ICustomerRepository {

   // @Qualifier("")
    @Autowired
    private ICustomerRepository ICustomerRepository;

    public List<Customer> getAllCustomer;


    public List<Customer> getAllCustomer(){
        List<Customer> allCustomers = ICustomerRepository.findAll();
        return allCustomers;
    }

    public Optional<Customer> getById(Long id){
        Optional<Customer> byId = ICustomerRepository.getById(id);
        return Optional.ofNullable(byId.orElseThrow(() -> new RuntimeException("Customer does not found!")));
    }

    public Customer create(CustomerDTO customerDTO) {
        Customer customer = CustomerMapper.toEntity(CustomerDTO);
        Customer customer1 = ICustomerRepository.create(customer);
        return customer1;
    }
}
