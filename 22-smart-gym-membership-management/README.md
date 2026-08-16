# Task 22 - Smart Gym Membership Management System

## 📌 Scenario

Develop a Spring Boot application using `JpaRepository` to manage gym member information.

## 🎯 Objective

Practice Spring Data JPA CRUD operations using `JpaRepository` with a gym membership management system.

## 🛠 Technologies Used

- Java
- Spring Boot
- Spring Data JPA
- JpaRepository
- MySQL
- Maven

## 🏋️ Entity

`GymMember`

### Fields

- memberId
- memberName
- membershipType
- membershipDuration
- fees

### Methods

- Getters and Setters
- Constructors
- toString()

## 🗄️ Repository

`GymMemberRepository`

```text
JpaRepository<GymMember, Long>
```

## 🔧 Service

`GymMemberService`

### Service Methods

- `addMember(GymMember member)`
- `addAllMembers(List<GymMember> members)`
- `getMemberById(Long id)`
- `getAllMembers()`
- `updateMember(GymMember member)`
- `removeMember(Long id)`
- `removeAllMembers()`
- `totalMembers()`
- `memberExists(Long id)`

## ⚙️ Operations

### 1. Register Single Member

Use `save()` to register a gym member.

### 2. Register Multiple Members

Use `saveAll()` to register multiple gym members.

### 3. Display All Members

Use `findAll()` to retrieve all registered members.

### 4. Search Member By ID

Use `findById()` to search for member details.

### 5. Check Member Availability

Use `existsById()` to check whether a member exists.

### 6. Count Registered Members

Use `count()` to display the total number of members.

### 7. Update Membership Fees

Use `save()` to update an existing member's membership fees.

### 8. Delete Member

Use `deleteById()` to remove a specific member.

### 9. Delete All Members

Use `deleteAll()` to remove all gym member records.

## 🏗️ Application Flow

```text
CommandLineRunner
       ↓
GymMemberService
       ↓
GymMemberRepository
       ↓
JpaRepository
       ↓
MySQL Database
```

## 📋 Main Class

Perform all operations through `CommandLineRunner` and display the results in the console.

## 📚 Learning Outcome

- Understand `JpaRepository`.
- Practice `save()` and `saveAll()`.
- Practice `findAll()` and `findById()`.
- Practice `existsById()` and `count()`.
- Practice updating records using `save()`.
- Practice `deleteById()` and `deleteAll()`.
- Understand Entity → Repository → Service → Runner architecture.
- Practice Spring Data JPA CRUD operations with MySQL.