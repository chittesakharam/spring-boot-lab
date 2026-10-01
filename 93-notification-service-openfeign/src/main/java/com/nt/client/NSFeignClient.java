package com.nt.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("student-service")
public interface NSFeignClient {

	@GetMapping("/notification")
	public String getNotification();
}
