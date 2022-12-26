package com.knoldus.liquibasedemo.repository;

import com.knoldus.liquibasedemo.entity.Customer;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends CrudRepository<Customer, Integer> {

    @Query("SELECT name FROM Customer c WHERE c.name LIKE %:customerName%")
    String findByName(String customerName);

}
