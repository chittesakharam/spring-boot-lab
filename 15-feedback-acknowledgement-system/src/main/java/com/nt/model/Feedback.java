package com.nt.model;


public class Feedback {

    private int id;
    private String customerName;
    private String email;
    private String message;

    public Feedback() {
    }

    public Feedback(int id, String customerName, String email, String message) {
        this.id = id;
        this.customerName = customerName;
        this.email = email;
        this.message = message;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "Feedback [id=" + id +
                ", customerName=" + customerName +
                ", email=" + email +
                ", message=" + message + "]";
    }
}