package com.surya.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.surya.modal.Customer;
import com.surya.service.CustomerServiceImp;

@RestController
public class CustomerController {
	@Autowired
	private CustomerServiceImp service;
	@PostMapping("/save")
	public String saveCust(@RequestBody Customer cust)
	{
		Customer c1=service.saveCustomer(cust);
		String mes=null;
		if(c1!=null)
		{
			mes="data is inserted successfully";
		}
		else
		{
			mes="data is not saved in database";
		}
		return mes;
	}
    @DeleteMapping("/delete/{cid}")
    public void deleteCust(@PathVariable Integer cid)
    {
    	service.deleteCustomer(cid);
    }
    @GetMapping("/getOne/{cid}")
    public Customer getCust(@PathVariable Integer cid)
    {
    	Customer c2=service.getOne(cid);
    	return c2;
    }
    @GetMapping("/getAll")
    public List<Customer> getCustomers()
    {
    	List<Customer> c3=service.getAll();
    	return c3;
    }
    @PutMapping("/update")
    public Customer updateCust(@RequestBody Customer cust)
    {
    	Customer c4=service.updateCustomer(cust);
    	return c4;
    }

}
