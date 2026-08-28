package com.nt.entity;

import java.util.ArrayList;
import java.util.List;

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
@Table(name="CUSTOMER")
public class Customer {
	@Id
	@SequenceGenerator(name="gen1",sequenceName = "Cust_Id",initialValue = 1001,allocationSize = 1)
	@GeneratedValue(generator = "gen1",strategy = GenerationType.SEQUENCE)
    private Integer id;

    private String name;

    private String email;

    @OneToMany(mappedBy = "customer", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Orders> orders = new ArrayList<>();


    public Customer(String name, String email) {
        this.name = name;
        this.email = email;
    }

  

    @Override
    public String toString() {
        return "Customer [id=" + id +
                ", name=" + name +
                ", email=" + email + "]";
    }

}