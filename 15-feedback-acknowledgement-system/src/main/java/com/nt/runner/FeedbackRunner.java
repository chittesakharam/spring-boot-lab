package com.nt.runner;



import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.model.Feedback;
import com.nt.service.EmailService;

@Component
public class FeedbackRunner implements CommandLineRunner {

    @Autowired
    private EmailService emailService;

    @Override
    public void run(String... args) throws Exception {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Feedback Id:");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.println("Enter Customer Name:");
        String customerName = sc.nextLine();

        System.out.println("Enter Email:");
        String email = sc.nextLine();

        System.out.println("Enter Feedback Message:");
        String feedbackMsg = sc.nextLine();

        Feedback feedback = new Feedback(
                id,
                customerName,
                email,
                feedbackMsg);

        IO.println("\n----- Feedback Details -----");
        IO.println(feedback);

        emailService.sendAcknowledgementMail(
                feedback.getCustomerName(),
                feedback.getEmail());

        sc.close();
    }
}
