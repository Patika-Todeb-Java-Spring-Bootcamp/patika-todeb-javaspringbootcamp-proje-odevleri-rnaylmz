package com.todeb.rnaylmz.createyourbestwedding.service;

import com.todeb.rnaylmz.createyourbestwedding.exception.EntityNotFoundException;
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


    private final ICustomerRepository customerRepository;

    public List<Customer> getAllCustomer;


    public List<Customer> getAllCustomer(){
        List<Customer> allCustomers = customerRepository.findAll();
        return allCustomers;
    }

    public Customer getById(Long id){
        Optional<Customer> byId = customerRepository.findById(id);
        return byId.orElseThrow(() -> new EntityNotFoundException("customer","Customer does not found!"));
    }

    public Customer create(CustomerDTO customerDTO) {
        Customer customer = CustomerMapper.toEntity(customerDTO);
        return customerRepository.save(customer);
    }

    public void delete(Long id){
        getById(id);
        customerRepository.deleteById(id);
    }

    public Customer update(Long id, CustomerDTO customer){
       Optional<Customer> customerbyId = customerRepository.findCustomerById(id);
        return customerbyId.orElseThrow(() -> new EntityNotFoundException("customer","Customer could not be updated!"));
    }

 /*   public void giveLike(int giveLike){
        getById(id);
        customerRepository.giveLikeById(id);
    }*/
}
