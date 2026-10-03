package com.nt.invoker;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient( name = "prime-service",url = "http://localhost:4040")
public interface NumerServiceInvoker {

	@GetMapping("/check-prime/{num}")
	public String checkPrime(@PathVariable Integer num);
	@GetMapping("/check-palindrome/{num}")
	public String checkPalindrome(@PathVariable Integer num);
	@GetMapping("/check-armstrong/{num}")
	public String checkArmstrong(@PathVariable Integer num);
}
