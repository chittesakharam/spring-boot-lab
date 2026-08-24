# Task 39 - Hospital Patient Management System using Bidirectional @OneToMany

## 📌 Scenario

Develop a Spring Boot application for a Hospital Management System where one Doctor can treat multiple Patients using a Bidirectional One-to-Many relationship.

## 🎯 Objective

Practice bidirectional relationship mapping between Doctor and Patient entities using `@OneToMany` and `@ManyToOne`.

## 🛠 Technologies Used

- Java
- Spring Boot
- Spring Data JPA
- JpaRepository
- Hibernate
- MySQL
- Maven
- CommandLineRunner

## 👨‍⚕️ Doctor Entity

### Fields

- doctorId
- doctorName
- specialization
- patients

```text
List<Patient> patients