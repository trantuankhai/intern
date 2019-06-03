package com.example.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dao.customerDAO;
import com.example.model.customer;

@Service
public class CustomerServices {
	@Autowired
	private customerDAO customerDAO;
	public String addCustomer( customer customer) {
		return customerDAO.addCustomer(customer);
	}
	public String editCustomer( int id , customer customer) {
		return customerDAO.editCustomer(id, customer);
	}
	public String deleteCustomer(int id) {
		return customerDAO.deleteCustomer(id);
	}
	public List<customer> getAllCustomer(){
		return customerDAO.getAllCustomer();
	}
}
