package com.codewithflex.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.codewithflex.model.Customers;
import com.codewithflex.repository.CustomersRepository;

@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	private CustomersRepository customerrpository;

	@Override
	public void saveCustomers(Customers customer) {
		this.customerrpository.save(customer);

	}

	@Override
	public Customers getCustomersDetailsById(long id) {
		Optional<Customers> optional = customerrpository.findById(id);
		Customers customer = null;
		if (optional.isPresent()) {
			customer = optional.get();
		} else {
			throw new RuntimeException("Employee not found for id :: " + id);
		}
		return customer;
	}

}
