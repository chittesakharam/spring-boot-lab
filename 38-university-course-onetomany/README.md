# Task 38 - University Course Management System using @OneToMany

## 📌 Scenario

Develop a Spring Boot application for a University Management System where one University offers multiple Courses using a Unidirectional One-to-Many relationship.

## 🎯 Objective

Practice JPA `@OneToMany` relationship mapping between University and Course entities.

## 🛠 Technologies Used

- Java
- Spring Boot
- Spring Data JPA
- JpaRepository
- Hibernate
- MySQL
- Maven
- CommandLineRunner

## 🏫 University Entity

### Fields

- universityId
- universityName
- city
- courses

```text
List<Course> courses