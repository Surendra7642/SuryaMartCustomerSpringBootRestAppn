package com.surya.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.surya.modal.Customer;

@Repository
public interface CustomerRepo extends JpaRepository<Customer, Integer> {

}
