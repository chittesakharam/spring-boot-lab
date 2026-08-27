# Task 44 - Music Festival Artist Management System using @ManyToMany

## 📌 Scenario

Develop a Spring Boot application to manage Artists and Music Festivals using a Many-to-Many relationship.

## 🎯 Objective

Practice JPA `@ManyToMany` relationship mapping between Artist and Festival entities.

## 🛠 Technologies Used

- Java
- Spring Boot
- Spring Data JPA
- JpaRepository
- Hibernate
- MySQL
- Maven
- CommandLineRunner

## 🎤 Artist Entity

### Fields

- artistId
- artistName
- genre
- country
- experienceYears

## 🎪 Festival Entity

### Fields

- festivalId
- festivalName
- city
- eventDate
- ticketPrice

## 🔗 Relationship

The application uses a **Many-to-Many** relationship.

```text
Artist ↔ Festival