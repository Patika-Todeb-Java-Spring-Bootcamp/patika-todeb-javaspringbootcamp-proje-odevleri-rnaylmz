package com.todeb.rnaylmz.createyourbestwedding.controller;

import com.todeb.rnaylmz.createyourbestwedding.model.dto.CustomerDTO;
import com.todeb.rnaylmz.createyourbestwedding.model.entity.Customer;
import com.todeb.rnaylmz.createyourbestwedding.service.CustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Validated
@RestController
@RequiredArgsConstructor
@RequestMapping("/api/customer")
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @GetMapping("/all")
    public ResponseEntity getAllCustomer() {
        List<Customer> allCustomer = customerService.getAllCustomer;
        return ResponseEntity.ok(allCustomer);
    }

    @GetMapping("/{id}")
    public ResponseEntity getCustomerByIs(@PathVariable("id") Long id) {
        Optional<Customer> byId;
        try {
            byId = customerService.getById(id);
        } catch (RuntimeException exception) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.status(200).body(byId);

    }

    @PostMapping("/create")
    public ResponseEntity createNewCustomer(@RequestBody CustomerDTO customer) {

        Customer responseCustomer = customerService.create(customer);
        if(responseCustomer == null){
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .body("Customer could not be created successfully");
        }

    }
}
