# Task 40 - Customer and PAN Card Management System using Bidirectional @OneToOne

## 📌 Scenario

Develop a Spring Boot application for a financial organization to manage Customer and PAN Card information using a Bidirectional One-to-One relationship.

## 🎯 Objective

Practice Bidirectional `@OneToOne` relationship mapping between Customer and PanCard entities.

## 🛠 Technologies Used

- Java
- Spring Boot
- Spring Data JPA
- JpaRepository
- Hibernate
- MySQL
- Maven
- CommandLineRunner

## 👤 Customer Entity

### Fields

- customerId
- customerName
- email
- city
- panCard

## 🪪 PanCard Entity

### Fields

- panId
- panNumber
- issueDate
- customer

## 🔗 Relationship

The application uses a **Bidirectional One-to-One** relationship.

```text
Customer
   ↕
PanCard