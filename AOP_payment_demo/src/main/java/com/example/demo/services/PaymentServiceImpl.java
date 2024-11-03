package com.example.demo.services;

import org.springframework.stereotype.Component;

@Component
public class PaymentServiceImpl implements PaymentService {

	@Override
	public void makePayment() {
		System.out.println("...amount debited...");
		//
		//
		//
		System.out.println("....amount credited...");
	}

}
