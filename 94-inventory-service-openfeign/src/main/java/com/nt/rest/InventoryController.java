package com.nt.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nt.client.PIFeignClient;

@RestController
public class InventoryController {

	private final PIFeignClient service;

	public InventoryController(PIFeignClient service) {
		super();
		this.service = service;
	}
	 
	@GetMapping("/inventory-service")
	public String getService()
	{
		return service.getService();
	}
}
