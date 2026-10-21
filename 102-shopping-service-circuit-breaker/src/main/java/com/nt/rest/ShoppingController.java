package com.nt.rest;

import java.util.LinkedHashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nt.client.NotificationInvoker;
import com.nt.client.OrderInvoker;
import com.nt.client.PaymentInvoker;

@RestController
public class ShoppingController {
	private final OrderInvoker order;
	private final NotificationInvoker notify;
	private final PaymentInvoker pay;
	private static int count=0;
	
	public ShoppingController(OrderInvoker order, NotificationInvoker notify, PaymentInvoker pay) {
		super();
		this.order = order;
		this.notify = notify;
		this.pay = pay;
	}


	@GetMapping("/shop")
	public ResponseEntity<Map<String,String>> shopping()
	{
		Map<String ,String> map = new LinkedHashMap<>();
		
		ResponseEntity<String> os = order.orderService();
		ResponseEntity<String> ns = notify.notificationService();
		ResponseEntity<String> ps = pay.paymentService();
		map.put(os.getBody(),os.getStatusCode()+"" );
		map.put(ns.getBody(), ns.getStatusCode()+"");
		map.put(ps.getBody(), ps.getStatusCode()+" ");
		System.out.println("ShoppingController.shopping() :: "+ count++);
		return new ResponseEntity<Map<String,String>>(map,HttpStatus.OK);
	}
	

}
