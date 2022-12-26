package com.knoldus.liquibasedemo.controller;

import com.knoldus.liquibasedemo.entity.Customer;
import com.knoldus.liquibasedemo.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("customer")
public class CustomerDetails {

    @Autowired
    private CustomerRepository customerRepository;

    @PostMapping("createcustomer")
    public String createCustomer(@RequestParam String name) {
        customerRepository.save(new Customer(2, name, "Delhi"));
        return customerRepository.findByName(name) + " Saved Successfully";
    }

    @GetMapping("fetchcustomer")
    public List<Customer> getAllTheCustomers() {
        return (List<Customer>) customerRepository.findAll();
    }
}
