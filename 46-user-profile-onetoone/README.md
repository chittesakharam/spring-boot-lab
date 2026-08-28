# Task 46 - User Profile Management System using @OneToOne

## 📌 Scenario

Develop a Spring Boot JPA application that demonstrates a One-to-One relationship between User and Profile entities.

Each User has a single Profile containing personal details.

## 🎯 Objective

Practice JPA `@OneToOne` relationship mapping and understand how foreign key relationships are maintained between two entities.

## 🛠 Technologies Used

- Java
- Spring Boot
- Spring Data JPA
- JpaRepository
- Hibernate
- MySQL
- Maven
- CommandLineRunner

## 👤 User Entity

### Fields

- id
- username
- password
- profile

The User entity maintains a reference to the Profile entity using:

```text
@OneToOne