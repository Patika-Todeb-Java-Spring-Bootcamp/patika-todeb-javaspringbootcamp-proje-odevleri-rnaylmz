package com.todeb.rnaylmz.createyourbestwedding.repository;


import com.todeb.rnaylmz.createyourbestwedding.model.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public interface ICustomerRepository extends JpaRepository<Customer, Long> {


    //private List<Customer> customerList;


   /* public List<Customer> findAll() {
        return customerList;
    }*/

   /* public Optional<Customer> getById(Long id) {

        Optional<Customer> customerOptional = customerList.stream().
                filter(customer -> customer.getId().equals(id)).findFirst();

        return customerOptional;
    }

    public Customer create(Customer customer){
         
        boolean addStatus = customerList.add(customer);
        if (!addStatus){
            return null;
        }
        return customer;
    }
}*/

       /* for(Customer customer: customerList){
            if(customer.getId().equals(id))
                return customer;
        }
        return null;*/

}
