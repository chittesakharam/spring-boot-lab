# Task 47 - Customer Order Management System using @OneToMany

## 📌 Scenario

Develop a Spring Boot JPA application that demonstrates a One-to-Many relationship between Customer and Order entities.

A single Customer can place multiple Orders.

## 🎯 Objective

Practice JPA `@OneToMany` and `@ManyToOne` relationship mapping and understand how relational data is managed using JPA.

## 🛠 Technologies Used

- Java
- Spring Boot
- Spring Data JPA
- JpaRepository
- Hibernate
- MySQL
- Maven
- CommandLineRunner

## 👤 Customer Entity

### Fields

- id
- name
- email
- orders

```text
List<Order> orders