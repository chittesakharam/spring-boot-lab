package com.nt.service;

import java.util.List;

import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;



@Component
public class NotificationService {
	
	private final DiscoveryClient client;

	public NotificationService(DiscoveryClient client) {
		super();
		this.client = client;
	}
	
	public String sendNotification()
	{
		List<ServiceInstance> list = client.getInstances("notification-service");
		
		ServiceInstance si = list.get(0);
		
		String uri = si.getUri()+"/notification";
		
		RestTemplate template = new RestTemplate();
		
		ResponseEntity<String> res = template.exchange(uri,HttpMethod.GET, null,String.class);
		return res.getBody();
	}
	

}
