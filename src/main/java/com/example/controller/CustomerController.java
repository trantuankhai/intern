package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.example.services.CustomerServices;

@Controller
public class CustomerController {
	@Autowired
	private CustomerServices customerServices;



}
