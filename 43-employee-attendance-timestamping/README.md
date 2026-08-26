# Task 43 - Employee Attendance System using Timestamping

## 📌 Scenario

Develop a Spring Boot application for an Employee Attendance System that automatically maintains the creation and last updated timestamps whenever an employee record is created or modified.

## 🎯 Objective

Practice automatic timestamp management using JPA timestamping annotations.

## 🛠 Technologies Used

- Java
- Spring Boot
- Spring Data JPA
- JpaRepository
- Hibernate
- MySQL
- Maven
- CommandLineRunner
- LocalDateTime

## 👨‍💼 Employee Entity

### Fields

- employeeId
- employeeName
- department
- salary
- createdDate
- updatedDate

## ⏰ Timestamping

The application automatically maintains:

- Creation Timestamp
- Last Updated Timestamp

The creation time is recorded when a new employee is saved.

The updated time changes whenever employee information is modified.

## 🗄️ Repository

`EmployeeRepository`

Uses:

```text
JpaRepository<Employee, Integer>