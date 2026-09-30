package com.nt.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nt.service.ClientServiceCunsumer;

@RestController
public class ClientController {

	private final ClientServiceCunsumer con;

	ClientController(ClientServiceCunsumer con) {
		this.con = con;
	}

	@GetMapping("/recieved")
	public String getEmployeeMassege()
	{
		String employeeMessage = con.getEmployeeMessage();
		return employeeMessage;
		
	}
}
