# Task 66 - Student Profile Page using Internationalization

## 📌 Objective

Create a Spring Boot MVC application that displays student information and
supports multiple languages using Spring Message Resource Bundles.

The application supports:

- English
- Hindi

No database is used.

## 📝 Scenario

A college wants to display student profile information on a multilingual
web page.

Student details:

- Student Name: Anjali
- Course: Java Full Stack

The labels and thank-you message should change according to the selected
language.

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
│   └── StudentController.java
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
        └── student.jsp
│
└── application.properties