# Task 28 - Cricketer Management System Using @Query

## 📌 Scenario

Develop a Spring Boot application using Spring Data JPA and the `@Query` annotation to perform custom database operations on a Cricketer entity.

## 🎯 Objective

Practice writing custom JPQL queries using the `@Query` annotation with `JpaRepository`.

## 🛠 Technologies Used

- Java
- Spring Boot
- Spring Data JPA
- JpaRepository
- JPQL
- @Query
- MySQL
- Maven
- CommandLineRunner

## 🏏 Cricketer Entity

### Fields

- id
- playerName
- country
- role
- team
- battingAverage
- matchesPlayed
- centuries
- age
- retired

## 🗄️ Repository

`CricketerRepository`

Uses:

```text
JpaRepository<Cricketer, Long>
```

## 🔎 Custom @Query Methods

### 1. Find Players By Country

```text
findByCountry(String country)
```

Finds all cricketers belonging to a specific country.

### 2. Players With Average Greater Than

```text
findPlayersWithAverageGreaterThan(Double avg)
```

Finds players whose batting average is greater than the given value.

### 3. Find All Batsmen

```text
findAllBatsmen()
```

Finds all players whose role is `Batsman`.

### 4. Players Starting With Name

```text
findPlayersStartingWith(String prefix)
```

Finds players whose name starts with the specified prefix.

### 5. Find Retired Players

```text
findRetiredPlayers()
```

Finds all retired cricketers.

### 6. Players With More Centuries

```text
findPlayersWithMoreCenturies(Integer count)
```

Finds players who have scored more than the specified number of centuries.

### 7. Players By Age Range

```text
findPlayersByAgeRange(Integer minAge, Integer maxAge)
```

Finds players whose age falls within the specified range.

### 8. Find Players By Team

```text
findByTeam(String team)
```

Finds all players belonging to a specific team.

### 9. Count Players By Country

```text
countPlayersByCountry(String country)
```

Returns the total number of players belonging to a specific country.

### 10. Find Top Average Player

```text
findTopAveragePlayer()
```

Finds the player having the highest batting average using a subquery and `MAX()`.

## 📦 Sample Data

Insert the provided sample cricketer records into the database.

The sample data includes players from:

- India
- England
- Australia
- Pakistan

and different roles such as:

- Batsman
- Bowler
- All-Rounder

## 🧪 Query Concepts Practiced

| Concept | Usage |
|---|---|
| `WHERE` | Filter records |
| Named Parameters | `:country`, `:avg`, etc. |
| `LIKE` | Search player names |
| `CONCAT()` | Prefix matching |
| `BETWEEN` | Age range |
| `COUNT()` | Count players |
| `MAX()` | Highest batting average |
| Subquery | Find top average player |
| Boolean condition | Find retired players |

## 🏗️ Application Flow

```text
CommandLineRunner
       ↓
CricketerService
       ↓
CricketerRepository
       ↓
JpaRepository
       ↓
@Query / JPQL
       ↓
MySQL Database
```

## 📚 Learning Outcome

- Understand the `@Query` annotation.
- Write custom JPQL queries.
- Use named parameters.
- Practice filtering with `WHERE`.
- Practice `LIKE` and `CONCAT()`.
- Use aggregate functions such as `COUNT()` and `MAX()`.
- Understand JPQL subqueries.
- Practice Entity → Repository → Service → Runner architecture.
- Understand when custom queries are useful instead of derived finder methods.