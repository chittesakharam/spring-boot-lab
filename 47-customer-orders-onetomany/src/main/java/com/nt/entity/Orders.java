package com.nt.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Entity
@Table(name="ORDERS")
public class Orders {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String productName;

    private Double price;

    @ManyToOne
    @JoinColumn(name="CUSTOMER_ID")
    private Customer customer;

   

    public Orders(String productName, Double price) {
        this.productName = productName;
        this.price = price;
    }

   
    @Override
    public String toString() {
        return "Orders [id=" + id +
                ", productName=" + productName +
                ", price=" + price + "]";
    }

}