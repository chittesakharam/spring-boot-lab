# Task 64 - Cricket Academy Cricketer Management System

## 📌 Objective

Develop a Spring Boot MVC CRUD web application for managing cricketer
records using JSP, JSTL, Spring Data JPA, Hibernate, and MySQL.

The National Cricket Academy staff can:

- Add new cricketers
- View all registered cricketers
- Update cricketer information
- Delete retired cricketers

Thymeleaf is NOT used.

## 📝 Scenario

The National Cricket Academy wants to maintain records of cricketers
participating in training camps.

Academy staff should be able to perform complete CRUD operations on
cricketer records.

## 🛠️ Technologies Used

- Java
- Spring Boot
- Spring MVC
- Spring Data JPA
- Hibernate
- MySQL
- JSP
- JSTL
- Maven
- Bootstrap/HTML/CSS
- Apache Tomcat

## 🗃️ Database

Database:

`cricket_academy_db`

Table:

`cricketer`

### Cricketer Fields

| Field | Description |
|---|---|
| playerId | Primary Key, Auto Increment |
| playerName | Player name |
| teamName | Team name |
| role | Player role |
| battingStyle | Batting style |
| jerseyNumber | Jersey number |

## 📦 Entity

### Cricketer

The `Cricketer` entity contains:

- `playerId`
- `playerName`
- `teamName`
- `role`
- `battingStyle`
- `jerseyNumber`

JPA annotations are used for database mapping.

## 📂 Project Structure

```text
src/main/java
│
├── controller
│   └── CricketerController.java
│
├── entity
│   └── Cricketer.java
│
├── repository
│   └── CricketerRepository.java
│
├── service
│   └── CricketerService.java
│
└── SpringBootMvcApplication.java
│
src/main/webapp
│
└── WEB-INF
    └── views
        ├── index.jsp
        ├── addCricketer.jsp
        ├── viewCricketers.jsp
        └── editCricketer.jsp
│
src/main/resources
└── application.properties