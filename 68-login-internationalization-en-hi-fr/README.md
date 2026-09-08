# Task 68 - Login Page with Internationalization

## 📌 Objective

Create a Spring Boot MVC Login application supporting three languages:

- English
- Hindi
- French

All login validation messages must be loaded from Spring Message Resource
Bundle properties files.

No database is required.

## 📝 Scenario

Create a multilingual login page where users can enter their username and
password.

The application should validate the login form and display localized
validation messages depending on the selected language.

## 🛠️ Technologies Used

- Java
- Spring Boot
- Spring MVC
- JSP
- Spring Internationalization (i18n)
- MessageSource
- LocaleResolver
- LocaleChangeInterceptor
- JavaScript
- Maven
- Apache Tomcat

## 📋 Login Fields

- Username
- Password

Buttons:

- Login
- Reset

## ⚠️ Validation Messages

The following messages must come from properties files:

- Username Required
- Password Required
- Invalid Credentials

No validation message should be hardcoded in the JSP or JavaScript.

## 📂 Required Project Structure

```text
src/main/java
│
├── controller
│   └── LoginController.java
│
├── validator
│   └── LoginValidator.java
│
├── config
│   └── WebConfig.java
│
└── SpringBootMvcApplication.java
│
src/main/resources
│
├── messages.properties
├── messages_hi.properties
└── messages_fr.properties
│
src/main/webapp
│
└── WEB-INF
    └── views
        └── login.jsp
│
└── login.js