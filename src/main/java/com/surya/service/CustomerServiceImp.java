package com.surya.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.surya.modal.Customer;
import com.surya.repo.CustomerRepo;

@Service
public class CustomerServiceImp implements CustomerService {
	@Autowired

	private CustomerRepo repo;

	public Customer saveCustomer(Customer cust) {

		Customer cust1 = repo.save(logic(cust));
		return cust1;
	}

	public void deleteCustomer(Integer cid) {
		repo.deleteById(cid);

	}

	public Customer getOne(Integer cid) {
		Customer cust2 = repo.findById(cid).get();
		return cust2;
	}

	public Customer updateCustomer(Customer cust) {
		Customer cust3 = null;

		Optional<Customer> op = repo.findById(cust.getCid());

		if (op.isPresent()) {

			cust3 = repo.save(logic(cust));
		} else {
			cust3 = repo.save(logic(cust));
		}
		return cust3;
	}

	public List<Customer> getAll() {
		List<Customer> cust4 = repo.findAll();

		return cust4;
	}

	public Customer logic(Customer cust) {
		double total = cust.getQty() * cust.getPrice();
		cust.setTotal(total);
		double discount = 0.0;
		double bill = 0.0;
		if (total > 5000) {
			discount = 0.15 * total;
			bill = total - discount;
		} else if (total > 10000) {
			discount = 0.20 * total;
			bill = total - discount;
		} else if (total > 15000) {
			discount = 0.25 * total;
			bill = total - discount;
		} else {
			bill=total;
			
		}
		cust.setDiscount(discount);
		cust.setBill(bill);
		return cust;

	}

}
