package com.todeb.rnaylmz.createyourbestwedding.controller;

import com.todeb.rnaylmz.createyourbestwedding.exception.EntityNotFoundException;
import com.todeb.rnaylmz.createyourbestwedding.model.dto.CustomerDTO;
import com.todeb.rnaylmz.createyourbestwedding.model.entity.Customer;
import com.todeb.rnaylmz.createyourbestwedding.service.CustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Validated
@RestController
@RequiredArgsConstructor
@RequestMapping("/api/customer")
public class CustomerController {

    private CustomerService customerService;

    @GetMapping("/all")
    public ResponseEntity getAllCustomer() {
        List<Customer> allCustomer = customerService.getAllCustomer;
        return ResponseEntity.ok(allCustomer);
    }

    @GetMapping("/{id}")
    public ResponseEntity getCustomerByIs(@PathVariable("id") Long id) {
        Customer byId = customerService.getById(id);
        return ResponseEntity.status(200).body(byId);

    }

    @PostMapping("/create")
    public ResponseEntity createNewCustomer(@RequestBody CustomerDTO customer) {

        Customer responseCustomer = customerService.create(customer);
        if (responseCustomer == null) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .body("Customer could not be created successfully");

        }
        return ResponseEntity.status(HttpStatus.CREATED).body(responseCustomer);
    }

    @DeleteMapping("/delete")
    public ResponseEntity deleteCustomer(@RequestParam(name = "id") Long id) {
        customerService.delete(id);
        return ResponseEntity.status(HttpStatus.OK).body("Customer were deleted");
    }

    @PutMapping("/{id}")
    public ResponseEntity updateCustomer(@PathVariable("id") Long id, @RequestBody CustomerDTO customer) {

        Customer update = customerService.update(id, customer);
        if (update == null) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Customer could not updated successfully");
        }
        return ResponseEntity.status(HttpStatus.OK).body(update);
    }
}
