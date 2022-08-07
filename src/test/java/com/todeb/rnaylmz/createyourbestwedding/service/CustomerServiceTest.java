package com.todeb.rnaylmz.createyourbestwedding.service;

import com.todeb.rnaylmz.createyourbestwedding.model.entity.Customer;
import com.todeb.rnaylmz.createyourbestwedding.repository.ICustomerRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

@ExtendWith(MockitoExtension.class)
public class CustomerServiceTest {

    @Mock
    private ICustomerRepository customerRepository;

    @InjectMocks
    private CustomerService customerService;

    private Customer testCustomer;


    @Ignore
    @Test
    void getAllCustomers(){
        //init
        //List<Customer> expCustomerList = getSampleTestCustomers();

        //stub
        //Mockito.when(customerRepository.findAll()).thenReturn(expCustomerList);

        //then


    }

}
