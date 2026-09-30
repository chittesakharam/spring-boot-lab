package com.nt.service;

import java.util.List;

import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;



@Component
public class PaymentService {

	private DiscoveryClient client;

	public PaymentService(DiscoveryClient client) {
		super();
		this.client = client;
	}
	
	public String doPaymet()
	{
		List<ServiceInstance> list = client.getInstances("payment-service");
		ServiceInstance si =list.get(0);
		String uri = si.getUri()+"/payment";
		RestTemplate template = new RestTemplate();
		
		ResponseEntity<String> exchange = template.exchange(uri,HttpMethod.GET, null,String.class);
		return exchange.getBody();
	}
}
