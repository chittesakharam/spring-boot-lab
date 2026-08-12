# Task 13 - Exam Result Notification System

## 📌 Scenario

Develop a Spring Boot application to generate student exam results and send result notifications through email.

## 🎯 Objective

Create a simple result notification system that accepts student result information, generates the result, displays the grade, and sends an email notification.

## 📖 Concepts Covered

- Spring Boot
- Result Model
- Service-based Email Notification
- Dependency Injection
- CommandLineRunner
- Object Handling
- Result Generation
- Email Notification

## 🛠 Technologies Used

- Java
- Spring Boot
- Maven

## 📦 Components

### Result

Contains:

- studentId
- studentName
- email
- marks
- grade

### Runner

Responsible for:

- Accepting student result input
- Generating the result
- Displaying result information
- Sending result notification
- Displaying email notification status

## 🔄 Application Flow

```text
Student Input
     ↓
Generate Result
     ↓
Calculate / Set Grade
     ↓
Display Result
     ↓
Send Email Notification
```

## 📤 Sample Output

```text
Result Generated Successfully

Student Name : Rohit
Marks        : 85
Grade        : B

Email Sent Successfully
```

## 📚 Learning Outcome

- Understand how to represent result information using a Java object.
- Practice accepting input using CommandLineRunner.
- Generate and display student results.
- Implement email notification functionality.
- Understand a simple Spring Boot application flow.