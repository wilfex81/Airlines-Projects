package com.codewithflex.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.codewithflex.model.Customers;

@Repository
public interface CustomersRepository extends JpaRepository<Customers, Long>{

}
