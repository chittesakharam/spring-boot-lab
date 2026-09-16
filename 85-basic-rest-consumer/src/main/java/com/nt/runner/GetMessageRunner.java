package com.nt.runner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class GetMessageRunner implements CommandLineRunner {
 
	private final RestTemplate template;
	
	public GetMessageRunner(RestTemplate template) {
		super();
		this.template = template;
	}

	@Override
	public void run(String... args) throws Exception {
		String url ="http://localhost:4040/MessageProducerApp/producer/message";
		ResponseEntity<String> message = template.exchange(url, HttpMethod.GET,null,String.class);
		IO.println("Message received from Producer:");
		IO.println(message.getBody());
		System.exit(0);

	}

}
