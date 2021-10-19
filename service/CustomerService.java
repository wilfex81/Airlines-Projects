package com.codewithflex.service;

import com.codewithflex.model.Customers;

public interface CustomerService {

	void saveCustomers( Customers customer);
	Customers getCustomersDetailsById(long id);
}
