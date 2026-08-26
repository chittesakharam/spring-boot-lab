# Task 42 - Product Inventory Management System using @Version

## 📌 Scenario

Develop a Spring Boot application for a Product Inventory Management System that prevents multiple users from updating the same product record simultaneously.

The application implements Optimistic Locking using JPA `@Version`.

## 🎯 Objective

Practice Optimistic Locking and understand how the `@Version` annotation automatically manages record versions during updates.

## 🛠 Technologies Used

- Java
- Spring Boot
- Spring Data JPA
- JpaRepository
- Hibernate
- MySQL
- Maven
- CommandLineRunner
- Optimistic Locking

## 📦 Product Entity

### Fields

- productId
- productName
- price
- quantity
- version

## 🔐 Optimistic Locking

The `version` field is mapped using:

```text
@Version
private Integer version;