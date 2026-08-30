package com.nt.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MessageController {
	
	@RequestMapping("/")
	public String displayMessage()
	{
		System.out.println("MessageController.displayMessage()");
		return "welcome";
	}

}
