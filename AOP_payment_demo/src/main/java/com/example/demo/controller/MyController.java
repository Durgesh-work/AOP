package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.services.PaymentService;

@RestController
public class MyController {

	@Autowired
	PaymentService paymentService;
	
	@GetMapping("/makePayment")
	public String makePayment() {
		paymentService.makePayment();
		return "amount credited";
	}
}
