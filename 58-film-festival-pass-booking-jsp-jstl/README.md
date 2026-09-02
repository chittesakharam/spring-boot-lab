# Task 58 - Film Festival Pass Booking System using Spring Boot MVC

## 📌 Objective

Develop a Spring Boot MVC application for booking Film Festival passes using JSP, JSTL, and `@ModelAttribute`.

Visitors can submit a festival pass booking form and view their booking details on a confirmation page.

## 🛠 Technologies Used

- Java
- Spring Boot
- Spring MVC
- JSP
- JSTL
- Maven
- Apache Tomcat
- HTML/CSS

## 🎯 Requirements

- Create a Spring Boot MVC project.
- Use JSP as the View.
- Use JSTL Core Tag Library.
- Use `@ModelAttribute` for form binding.
- Implement two-way data binding.
- No database is required.
- Display submitted booking details on a confirmation page.

## 📦 Package Structure

```text
src/main/java
└── controller
    └── FestivalController.java

└── model
    └── FestivalPass.java

src/main/webapp
└── WEB-INF
    └── views
        ├── festival-form.jsp
        └── festival-success.jsp