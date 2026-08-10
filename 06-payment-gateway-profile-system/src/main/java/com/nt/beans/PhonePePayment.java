package com.nt.beans;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("phonepe")
public class PhonePePayment implements PaymentService {

    @Value("${companyName}")
    private String companyName;

    @Value("${transactionLimit}")
    private double transactionLimit;

    @Value("${paymentType}")
    private String paymentType;

    @Override
    public void makePayment() {
        System.out.println("Payment processed through PhonePe");
    }

    @Override
    public void showPaymentDetails() {
        System.out.println("Company Name : " + companyName);
        System.out.println("Transaction Limit : " + transactionLimit);
        System.out.println("Payment Type : " + paymentType);
    }
}