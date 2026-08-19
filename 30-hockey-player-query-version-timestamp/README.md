# Task 30 - Hockey Player Tournament Management System using @Query, @Version and Timestamping

## 📌 Scenario

Develop a Spring Boot application to manage hockey player tournament records using Spring Data JPA.

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

## 🏑 HockeyPlayer Entity

### Fields

- playerId
- playerName
- teamName
- country
- role
- goals
- experience
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

`HockeyPlayerRepository`

Uses:

```text
JpaRepository<HockeyPlayer, Long>
```

## 🔎 @Query Methods

### 1. Find Players By Team

```text
findByTeamName(String team)
```

Finds all players belonging to a specific team.

### 2. Find Players With Goals Greater Than

```text
findPlayersWithGoalsGreaterThan(Integer goals)
```

Finds players whose goals are greater than the specified value.

### 3. Find By Role And Country

```text
findByRoleAndCountry(String role, String country)
```

Finds players matching both role and country.

### 4. Find Players By Name Keyword

```text
findByNameContains(String keyword)
```

Finds players whose names contain the specified keyword.

### 5. Find Players By Experience Range

```text
findByExperienceBetween(Integer minExp, Integer maxExp)
```

Finds players whose experience falls within the specified range.

### 6. Count Players By Team

```text
countPlayersByTeam(String team)
```

Counts the number of players belonging to a specific team.

### 7. Find Players Ordered By Goals

```text
findPlayersOrderByGoalsDesc()
```

Returns players sorted by goals in descending order.

### 8. Update Player Goals

```text
updateGoals(Long id, Integer goals)
```

Updates the goals of a player using a modifying JPQL query.

Uses:

```text
@Modifying
@Transactional
```

### 9. Delete Players By Country

```text
deleteByCountry(String country)
```

Deletes all hockey players belonging to a specified country.

Uses:

```text
@Modifying
@Transactional
```

### 10. Get Player Name And Goals

```text
getPlayerNameAndGoals()
```

Returns only player names and goals using `Object[]` projection.

## 🔐 Optimistic Locking

The `@Version` field is used for optimistic locking.

```text
version
```

JPA automatically manages the version value when an entity is updated and helps prevent conflicting updates.

## 🕒 Timestamping

### Creation Timestamp

```text
@CreationTimestamp
createdAt
```

Automatically stores when the player record was created.

### Update Timestamp

```text
@UpdateTimestamp
updatedAt
```

Automatically updates when the player record is modified.

## ✏️ Modifying Queries

The application demonstrates update and delete operations using:

```text
@Modifying
@Transactional
```

### Update Goals

```text
UPDATE HockeyPlayer
SET goals = given goals
WHERE playerId = given ID
```

### Delete By Country

```text
DELETE FROM HockeyPlayer
WHERE country = given country
```

## 📋 Query Concepts Practiced

| Concept | Usage |
|---|---|
| `@Query` | Custom JPQL queries |
| `@Param` | Named query parameters |
| `WHERE` | Filtering records |
| `AND` | Multiple conditions |
| `LIKE` | Keyword search |
| `BETWEEN` | Experience range |
| `COUNT()` | Count players |
| `ORDER BY` | Goals sorting |
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
HockeyPlayerService
       ↓
HockeyPlayerRepository
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
- Practice JPQL filtering, sorting, counting and projections.
- Understand `LIKE` keyword searching.
- Practice Entity → Repository → Service → Runner architecture.