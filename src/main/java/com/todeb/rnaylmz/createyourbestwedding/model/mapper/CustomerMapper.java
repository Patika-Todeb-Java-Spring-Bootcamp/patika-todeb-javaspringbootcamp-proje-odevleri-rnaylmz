package com.todeb.rnaylmz.createyourbestwedding.model.mapper;

import com.todeb.rnaylmz.createyourbestwedding.model.dto.CustomerDTO;
import com.todeb.rnaylmz.createyourbestwedding.model.entity.Customer;

public class CustomerMapper {

    public static CustomerDTO toDTO(Customer customer){
        CustomerDTO customerDTO = new CustomerDTO();
        customerDTO.setGiveLike(customer.getGiveLike());
        customerDTO.setGivePoint(customer.getGivePoint());
        customerDTO.setFollowBusinessOwner(customer.getFollowBusinessOwner());
        return customerDTO;
    }

    public static  Customer toEntity(CustomerDTO customerDTO){
        Customer customer = new Customer();
        customer.setGiveLike(customerDTO.getGiveLike());
        customer.setGivePoint(customerDTO.getGivePoint());
        customer.setFollowBusinessOwner(customerDTO.getFollowBusinessOwner());
        return customer;
    }
}
