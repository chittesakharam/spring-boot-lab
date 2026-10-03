package com.nt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class Ms07PrimeServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(Ms07PrimeServiceApplication.class, args);
	}

}
