package com.nt.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("mail")
public class EmailNotification implements NotificationService {

	@Value("${name}")
	private String senderName;
	@Value("${sMail}")
	private String supportEmail;
	@Value("${type}")
	private String notificationType;
	@Override
	public void sendNotification() {
		IO.println("Send notification through Email");

	}

	@Override
	public void displayNotificationInfo() {
		IO.println("Sender Name: "+senderName);
		IO.println("Support Email: "+supportEmail);
		IO.println("Notification Type : "+notificationType);

	}

}
