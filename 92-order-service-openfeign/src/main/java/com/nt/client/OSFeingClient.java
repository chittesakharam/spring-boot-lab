package com.nt.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("payment-service")
public interface OSFeingClient {
	
	@GetMapping("/payment")
	public String doPayment();

}
