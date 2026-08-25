# Task 41 - Library and Books Management System using Unidirectional @OneToMany

## 📌 Scenario

Develop a Spring Boot application for a Library Management System where one Library can contain multiple Books using a Unidirectional One-to-Many relationship.

## 🎯 Objective

Practice Unidirectional `@OneToMany` relationship mapping between Library and Book entities.

## 🛠 Technologies Used

- Java
- Spring Boot
- Spring Data JPA
- JpaRepository
- Hibernate
- MySQL
- Maven
- CommandLineRunner

## 📚 Library Entity

### Fields

- libraryId
- libraryName
- location
- books

```text
List<Book> books