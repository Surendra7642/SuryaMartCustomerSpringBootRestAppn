package com.surya.service;

import java.util.List;

import com.surya.modal.Customer;

public interface CustomerService {
	public Customer saveCustomer(Customer cust);
	public void deleteCustomer(Integer cid);
	public Customer getOne(Integer cid);
	public Customer updateCustomer(Customer cust);
	public List<Customer> getAll();


}
