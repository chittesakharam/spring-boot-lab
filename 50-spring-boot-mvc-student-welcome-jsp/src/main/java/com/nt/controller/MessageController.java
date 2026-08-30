package com.nt.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MessageController {
	
	@RequestMapping("/student")
	public String displayMessage(Map<String,String> map)
	{
		System.out.println("MessageController.displayMessage()");
		
		map.put("msg", "Welcome Student");
		return "welcome";
	}

}
