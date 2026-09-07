# Task 65 - Employee Welcome Page using Internationalization

## 📌 Objective

Create a Spring Boot MVC application that displays employee details and
supports multiple languages using Spring Message Resource Bundles.

The application supports:

- English
- Hindi

The language can be selected using the `lang` request parameter.

No database is used.

## 📝 Scenario

A company wants to display employee information on a multilingual welcome
page.

The employee details are:

- Employee Name: Rahul Sharma
- Department: IT

Labels and welcome messages should change according to the selected language.

## 🛠️ Technologies Used

- Java
- Spring Boot
- Spring MVC
- JSP
- Spring Internationalization (i18n)
- Message Resource Bundles
- Maven
- Apache Tomcat

## 📂 Project Structure

```text
src/main/java
│
├── controller
│   └── EmployeeController.java
│
└── SpringBootMvcApplication.java
│
src/main/resources
│
├── messages.properties
└── messages_hi.properties
│
src/main/webapp
│
└── WEB-INF
    └── views
        └── employee.jsp
│
└── application.properties