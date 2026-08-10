# Task 06 - Payment Gateway Profile System

## 📌 Scenario

Load different payment services based on the active Spring Boot profile.

## 🎯 Objective

Understand how Spring Profiles can be used to load different implementations of an interface based on the active environment/profile.

## 📖 Concepts Covered

- @Profile
- @Value
- @Component
- Dependency Injection
- Interface
- CommandLineRunner
- Spring Profiles

## 🛠 Technologies

- Java
- Spring Boot
- Maven

## Classes

- PaymentService
- PhonePePayment
- GooglePayPayment
- PaymentRunner

## Configuration

```properties
company.name=Digital Payment Services
transaction.limit=50000
payment.type=UPI

spring.profiles.active=phonepe
```

## PhonePe Profile

```properties
spring.profiles.active=phonepe
```

Output:

```text
Company Name      : Digital Payment Services
Transaction Limit : 50000.0
Payment Type      : UPI
Payment made using PhonePe
```

## Google Pay Profile

```properties
spring.profiles.active=googlepay
```

Output:

```text
Company Name      : Digital Payment Services
Transaction Limit : 50000.0
Payment Type      : UPI
Payment made using Google Pay
```

## Learning Outcome

- Understand Spring Profiles
- Use @Profile for conditional bean creation
- Inject property values using @Value
- Inject interface implementations using dependency injection
- Execute application logic using CommandLineRunner