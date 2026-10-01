package com.nt.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("product-service")
public interface PIFeignClient {

	@GetMapping("/service")
	public String getService();
}
