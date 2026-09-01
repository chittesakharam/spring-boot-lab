package com.nt.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class StudentController {

	
	@GetMapping("/")
	public String showHomePage()
	{
		return "home";
	}
	@GetMapping("bill")
	public String bill()
	{
		return "bill";
	}
	@PostMapping("bill")
	public String calculateAndDisplayBill(Map<String,Object> map,@RequestParam String cName,@RequestParam Double units)
	{
		map.put("cName", cName);
		map.put("units", units);
		map.put("bill", (units*8));
		
		return "bill_result";
	}
	
}
