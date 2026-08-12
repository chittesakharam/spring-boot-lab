package com.nt.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class EmailService {

    @Autowired
    private JavaMailSender mailSender;

    public void sendAcknowledgementMail(String customerName, String email) {

        String subject = "Feedback Received Successfully";

        String body =
                "Dear " + customerName + ",\n\n" +
                "Thank you for your valuable feedback.\n\n" +
                "We have successfully received your feedback and appreciate you taking the time to share your thoughts with us.\n\n" +
                "Our team will review your feedback carefully.\n\n" +
                "Thank you for helping us improve our services.\n\n" +
                "Best Regards,\n" +
                "Customer Support Team";

        SimpleMailMessage message = new SimpleMailMessage();
        message.setTo(email);
        message.setSubject(subject);
        message.setText(body);

        mailSender.send(message);

        IO.println("Acknowledgement Email Sent Successfully...");
    }
}