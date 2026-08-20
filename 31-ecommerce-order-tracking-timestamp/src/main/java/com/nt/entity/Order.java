package com.nt.entity;

import java.time.LocalDateTime;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.PrePersist;
import jakarta.persistence.PreUpdate;
import jakarta.persistence.Table;

@Entity
@Table(name="Order_tab")
public class Order {

    @Id
    private Integer orderId;
    @Column(length=30)
    private String customerName;
    @Column(length=30)
    private String productName;
    private Integer quantity;
    private Double totalAmount;
    @Column(length=30)
    private String orderStatus;

    @CreationTimestamp
    private LocalDateTime createdDateTime;
    @UpdateTimestamp
    private LocalDateTime lastModifiedDateTime;

    public Order() {
    }

    public Order(Integer orderId, String customerName, String productName,
                 Integer quantity, Double totalAmount, String orderStatus) {
        this.orderId = orderId;
        this.customerName = customerName;
        this.productName = productName;
        this.quantity = quantity;
        this.totalAmount = totalAmount;
        this.orderStatus = orderStatus;
    }

    @PrePersist
    public void onCreate() {
        createdDateTime = LocalDateTime.now();
        lastModifiedDateTime = LocalDateTime.now();
    }

    @PreUpdate
    public void onUpdate() {
        lastModifiedDateTime = LocalDateTime.now();
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

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(Double totalAmount) {
        this.totalAmount = totalAmount;
    }

    public String getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }

    public LocalDateTime getCreatedDateTime() {
        return createdDateTime;
    }

    public LocalDateTime getLastModifiedDateTime() {
        return lastModifiedDateTime;
    }

    @Override
    public String toString() {
        return "Order [orderId=" + orderId +
                ", customerName=" + customerName +
                ", productName=" + productName +
                ", quantity=" + quantity +
                ", totalAmount=" + totalAmount +
                ", orderStatus=" + orderStatus +
                ", createdDateTime=" + createdDateTime +
                ", lastModifiedDateTime=" + lastModifiedDateTime + "]";
    }
}
