package com.nt.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Table("travel_package")
public class TravelPackage {

    @Id
    private Integer packageId;

    private String packageName;

    private String destination;

    private Double price;

    private Integer duration;
}