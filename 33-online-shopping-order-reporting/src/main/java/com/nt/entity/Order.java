package com.nt.entity;


import jakarta.persistence.*;

@Entity
@Table(name = "order_report")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer orderId;

    private String customerName;
    private String productName;
    private String category;
    private Double totalAmount;
    private String paymentMode;
    private String orderStatus;

    public Order() {
    }

    public Order(String customerName, String productName, String category,
                 Double totalAmount, String paymentMode, String orderStatus) {
        this.customerName = customerName;
        this.productName = productName;
        this.category = category;
        this.totalAmount = totalAmount;
        this.paymentMode = paymentMode;
        this.orderStatus = orderStatus;
    }

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(Double totalAmount) {
        this.totalAmount = totalAmount;
    }

    public String getPaymentMode() {
        return paymentMode;
    }

    public void setPaymentMode(String paymentMode) {
        this.paymentMode = paymentMode;
    }

    public String getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }

    @Override
    public String toString() {
        return "Order ID : " + orderId +
                "\nCustomer Name : " + customerName +
                "\nProduct Name : " + productName +
                "\nCategory : " + category +
                "\nTotal Amount : " + totalAmount +
                "\nPayment Mode : " + paymentMode +
                "\nOrder Status : " + orderStatus +
                "\n----------------------------";
    }
}