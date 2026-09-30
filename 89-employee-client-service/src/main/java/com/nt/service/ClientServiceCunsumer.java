package com.nt.service;

import java.util.List;

import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;



@Component
public class ClientServiceCunsumer {

	private final DiscoveryClient client;

	ClientServiceCunsumer(DiscoveryClient client) {
		this.client = client;
	}
	
	public String getEmployeeMessage()
	{
		List<ServiceInstance> list = client.getInstances("employee-service");
		
		ServiceInstance si=list.get(0);
		String uri= si.getUri()+"/employee";
		RestTemplate template = new RestTemplate();
		String res = template.getForObject(uri, String.class);
		return res;
	}
}
