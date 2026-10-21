package com.nt.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("payment-service")
public interface PaymentInvoker {

	@GetMapping("/payment")
	public ResponseEntity<String> paymentService();
}
