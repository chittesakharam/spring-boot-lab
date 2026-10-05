package com.nt.invoker;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("message-service")
public interface IMessageInvoker {

	@GetMapping("/message")
	public String getMessage();
}
