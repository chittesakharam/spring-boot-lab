package com.nt.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("order-service")
public interface OrderInvoker {

	@GetMapping("/order")
	public ResponseEntity<String> orderService();
}
