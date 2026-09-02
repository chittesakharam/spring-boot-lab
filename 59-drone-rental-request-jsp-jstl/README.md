# Task 59 - Drone Rental Request System

## 📌 Objective

Build a Drone Rental Request System using Spring Boot MVC where customers can submit a drone rental request form. After submission, all entered details are displayed on a success page using JSP and JSTL.

No database is used in this project.

## 📝 Scenario

A drone rental company wants to allow customers to submit rental requests by providing:

- Request ID
- Customer Name
- Drone Model
- Rental Purpose
- Rental Duration
- Contact Number
- Pickup Location

The submitted information is displayed on a confirmation page using JSP and JSTL.

## 🛠️ Technologies Used

- Java
- Spring Boot
- Spring MVC
- JSP
- JSTL
- Maven
- HTML/CSS
- Apache Tomcat

## 📂 Project Structure

```text
src/main/java
├── controller
│   └── DroneRentalController.java
│
└── model
    └── DroneRentalRequest.java

src/main/webapp
└── WEB-INF
    └── views
        ├── drone-form.jsp
        └── drone-success.jsp