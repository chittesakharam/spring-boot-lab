package com.nt.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Service;

import com.nt.service.NotificationService;

@Service
public class NotificationRunner implements CommandLineRunner {

	@Autowired
	private NotificationService service;
	@Override
	public void run(String... args) throws Exception {
		service.sendNotification();
		service.displayNotificationInfo();

	}

}
