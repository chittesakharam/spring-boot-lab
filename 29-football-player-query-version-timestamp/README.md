# Task 29 - Football Player Management System using @Query, @Version and Timestamping

## 📌 Scenario

Develop a Spring Boot application to manage football player records using Spring Data JPA.

This task demonstrates custom JPQL queries using `@Query`, optimistic locking using `@Version`, and automatic timestamp management using `@CreationTimestamp` and `@UpdateTimestamp`.

## 🎯 Objective

Practice:

- Custom JPQL queries
- `@Query`
- `@Param`
- `@Modifying`
- `@Transactional`
- Optimistic locking with `@Version`
- Automatic creation timestamp
- Automatic update timestamp
- Projection using `Object[]`

## 🛠 Technologies Used

- Java
- Spring Boot
- Spring Data JPA
- JpaRepository
- JPQL
- MySQL
- Maven
- CommandLineRunner
- Hibernate

## ⚽ FootballPlayer Entity

### Fields

- playerId
- playerName
- country
- club
- position
- salary
- jerseyNumber
- version
- createdAt
- updatedAt

### JPA Features

```text
@Version
@CreationTimestamp
@UpdateTimestamp
```

## 🗄️ Repository

`FootballPlayerRepository`

Uses:

```text
JpaRepository<FootballPlayer, Long>
```

## 🔎 @Query Methods

### 1. Find Players By Club

```text
findByClub(String club)
```

Finds all players belonging to a particular club.

### 2. Find Players With Salary Greater Than

```text
findPlayersWithSalaryGreaterThan(Double salary)
```

Finds players whose salary is greater than the specified amount.

### 3. Find By Position And Country

```text
findByPositionAndCountry(String position, String country)
```

Finds players matching both position and country.

### 4. Find Players By Name Prefix

```text
findByNameStartsWith(String prefix)
```

Finds players whose names start with the specified prefix.

### 5. Find Players By Jersey Number Range

```text
findByJerseyNumberBetween(Integer start, Integer end)
```

Finds players whose jersey number falls within the specified range.

### 6. Count Players By Country

```text
countPlayersByCountry(String country)
```

Counts the number of players belonging to a particular country.

### 7. Find Highest Paid Players

```text
findHighestPaidPlayers()
```

Returns players sorted by salary in descending order.

### 8. Update Player Salary

```text
updateSalary(Long id, Double salary)
```

Updates the salary of a player using a modifying JPQL query.

Uses:

```text
@Modifying
@Transactional
```

### 9. Delete Players By Club

```text
deleteByClub(String club)
```

Deletes all players belonging to a specified club.

Uses:

```text
@Modifying
@Transactional
```

### 10. Get Player Name And Club

```text
getPlayerNameAndClub()
```

Returns only player names and club names using a projection with `Object[]`.

## 🔐 Optimistic Locking

The `@Version` field is used for optimistic locking.

```text
version
```

JPA automatically updates the version when an entity is modified and helps prevent conflicting updates.

## 🕒 Timestamping

### Creation Timestamp

```text
@CreationTimestamp
createdAt
```

Automatically stores the record creation date and time.

### Update Timestamp

```text
@UpdateTimestamp
updatedAt
```

Automatically updates the date and time when the record is modified.

## ✏️ Modifying Queries

The application demonstrates update and delete operations using:

```text
@Modifying
@Transactional
```

### Update

```text
UPDATE FootballPlayer
SET salary = given salary
WHERE playerId = given ID
```

### Delete

```text
DELETE FROM FootballPlayer
WHERE club = given club
```

## 📋 Query Concepts Practiced

| Concept | Usage |
|---|---|
| `@Query` | Custom JPQL queries |
| `@Param` | Named query parameters |
| `WHERE` | Filtering records |
| `AND` | Multiple conditions |
| `LIKE` | Prefix search |
| `BETWEEN` | Jersey number range |
| `COUNT()` | Count players |
| `ORDER BY` | Salary sorting |
| `@Modifying` | Update/Delete queries |
| `@Transactional` | Transaction management |
| `Object[]` | Partial data projection |
| `@Version` | Optimistic locking |
| `@CreationTimestamp` | Creation timestamp |
| `@UpdateTimestamp` | Update timestamp |

## 🏗️ Application Flow

```text
CommandLineRunner
       ↓
FootballPlayerService
       ↓
FootballPlayerRepository
       ↓
JpaRepository
       ↓
@Query / JPQL
       ↓
MySQL Database
```

## 📚 Learning Outcome

- Understand custom JPQL queries using `@Query`.
- Use named parameters with `@Param`.
- Perform update and delete operations using `@Modifying`.
- Understand transaction management using `@Transactional`.
- Implement optimistic locking using `@Version`.
- Automatically maintain creation and update timestamps.
- Practice JPQL sorting, filtering, counting and projections.
- Understand Entity → Repository → Service → Runner architecture.