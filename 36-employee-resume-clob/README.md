# Task 36 - Employee Resume Management System using CLOB

## 📌 Scenario

Develop a Spring Boot application for an HR Management System to store employee resumes as large text data using CLOB.

## 🎯 Objective

Practice storing large text content using JPA `@Lob` and performing CRUD operations with Spring Data JPA.

## 🛠 Technologies Used

- Java
- Spring Boot
- Spring Data JPA
- JpaRepository
- Hibernate
- MySQL
- Maven
- CommandLineRunner
- CLOB

## 👨‍💼 EmployeeResume Entity

### Fields

- employeeId
- employeeName
- designation
- resumeContent

### CLOB Field

```text
@Lob
@Column(columnDefinition = "CLOB")
private String resumeContent;