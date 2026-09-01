# Task 57 - Employee Profile using @PathVariable

## 📌 Objective

Create a Spring Boot MVC application that displays employee information using the employee ID received from the URL.

## 🛠 Technologies Used

- Java
- Spring Boot
- Spring MVC
- JSP
- Maven
- Apache Tomcat

## 🎯 Requirements

- Create an Employee Controller.
- Create an `@GetMapping("/employee/{id}")`.
- Use `@PathVariable` to receive the employee ID.
- Add hardcoded employee details to the Model.
- Display employee information in `employee.jsp`.

## 👨‍💼 Employee Details

- Employee ID
- Employee Name
- Department
- Salary

## 🌐 URL Example

```text
http://localhost:8080/employee/101