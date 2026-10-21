package com.nt.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("notification-service")
public interface NotificationInvoker {
	
	@GetMapping("/notification")
	public ResponseEntity<String> notificationService();

}
