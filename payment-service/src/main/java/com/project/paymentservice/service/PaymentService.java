package com.project.paymentservice.service;

import com.project.paymentservice.model.Payment;

public interface PaymentService {
	
	void sendPayment(Payment payment);
}
