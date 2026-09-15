package com.nt.runner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class CourierConsumerRunner implements CommandLineRunner {


	private final RestTemplate template;
	
	
	public CourierConsumerRunner(RestTemplate template) {
		super();
		this.template = template;
	}


	@Override
	public void run(String... args) throws Exception {

    String url="http://localhost:4040/ProducerApp/courier/status";
    
    ResponseEntity<String> res = template.getForEntity(url, String.class);
    IO.println(res.getBody());
    IO.println(res.getHeaders());
    IO.println(res.getStatusCode());
    System.exit(0);

	}

}
