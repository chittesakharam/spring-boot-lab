# Task 11 - Welcome Email Sender

## 📌 Scenario

A company wants to send a welcome email whenever a new employee joins the organization.

## 🎯 Objective

Create a simple Spring Boot application that accepts employee information and sends a welcome email using an Email Service.

## 📖 Concepts Covered

- Java Class and Object
- Employee Model
- Service Class
- Method Parameter Passing
- Dependency Injection
- Email Service
- Spring Boot Application

## 🛠 Technologies Used

- Java
- Spring Boot
- Maven

## 📦 Classes

- Employee
- EmailService
- Main Application Class

## 👤 Employee Fields

- name
- email

## 📧 EmailService

### Method

`sendWelcomeMail(Employee employee)`

## 📩 Email Details

### Subject

```text
Welcome to the Organization
```

### Body

```text
Hello <Employee Name>,

Welcome to our organization. We are happy to have you on our team.

Regards,
HR Team
```

## 🚀 Requirements

- Create an Employee class with name and email.
- Create an EmailService class.
- Implement `sendWelcomeMail(Employee employee)`.
- Generate the welcome email using employee information.
- Display the email details in the console.
- Run the application using the main Spring Boot application class.

## 📤 Expected Behavior

When a new employee is provided, the application should generate and display a welcome email containing:

- Employee name
- Employee email
- Email subject
- Email body

## 📚 Learning Outcome

- Understand service-layer responsibility.
- Pass an object as a method parameter.
- Practice basic Spring Boot application structure.
- Understand how a service can process model data.