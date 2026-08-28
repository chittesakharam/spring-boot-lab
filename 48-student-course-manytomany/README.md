# Task 48 - Student Course Enrollment System using @ManyToMany

## 📌 Scenario

Develop a Spring Boot JPA application that demonstrates a Many-to-Many relationship between Student and Course entities.

A Student can enroll in multiple Courses, and each Course can have multiple Students.

## 🎯 Objective

Practice JPA `@ManyToMany` relationship mapping and understand how a join table manages many-to-many relationships.

## 🛠 Technologies Used

- Java
- Spring Boot
- Spring Data JPA
- JpaRepository
- Hibernate
- MySQL
- Maven
- CommandLineRunner

## 👨‍🎓 Student Entity

### Fields

- id
- name
- email
- courses

```text
List<Course> courses