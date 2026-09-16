package com.nt.runner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class GetMessageRunnner implements CommandLineRunner {

	private final RestTemplate template;
	
	public GetMessageRunnner(RestTemplate template) {
		super();
		this.template = template;
	}

	@Override
	public void run(String... args) throws Exception {
		String helloUrl="http://localhost:4040/DiffMessageProducer/producer/hello";
	    String welcomeUrl="http://localhost:4040/DiffMessageProducer/producer/welcome";
	    
	    ResponseEntity<String> helloMsg = template.exchange(helloUrl, HttpMethod.GET,null,String.class);
	    ResponseEntity<String> welcomeMsg = template.exchange(welcomeUrl,HttpMethod.GET, null,String.class);
	    IO.println(helloMsg.getBody());
	    IO.println(welcomeMsg.getBody());
	    System.exit(0);

	}

}
