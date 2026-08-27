# Task 45 - Space Mission Astronaut Assignment System using @ManyToMany

## 📌 Scenario

Develop a Spring Boot application to manage Astronauts and Space Missions using a Many-to-Many relationship.

## 🎯 Objective

Practice JPA `@ManyToMany` relationship mapping between Astronaut and SpaceMission entities.

## 🛠 Technologies Used

- Java
- Spring Boot
- Spring Data JPA
- JpaRepository
- Hibernate
- MySQL
- Maven
- CommandLineRunner

## 👨‍🚀 Astronaut Entity

### Fields

- astronautId
- astronautName
- specialization
- nationality
- totalFlights

## 🚀 SpaceMission Entity

### Fields

- missionId
- missionName
- launchYear
- destination
- missionDuration

## 🔗 Relationship

The application uses a **Many-to-Many** relationship.

```text
Astronaut ↔ Space Mission