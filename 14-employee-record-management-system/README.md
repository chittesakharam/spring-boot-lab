# Task 14 - Employee Record Management System

## 📌 Scenario

Develop a Spring Boot console application to manage employee records using Spring Data JPA.

The application allows an administrator to store single and multiple employee records and display all employees available in the database.

## 🎯 Objective

Practice Spring Data JPA CRUD operations using `save()`, `saveAll()`, and `findAll()`.

## 📖 Concepts Covered

- Spring Boot
- Spring Data JPA
- JPA Entity
- Repository
- Service Layer
- CommandLineRunner
- Dependency Injection
- save()
- saveAll()
- findAll()
- Validation
- MySQL Database

## 🏗️ Layers

```text
Employee
    ↓
EmployeeRepository
    ↓
EmployeeService
    ↓
EmployeeRunner
    ↓
MySQL Database
```

## 📦 Components

### Entity

`Employee`

Fields:

- employeeId
- employeeName
- department
- salary

### Repository

`EmployeeRepository`

Used for database operations through Spring Data JPA.

### Service

`EmployeeService`

Responsible for employee business operations.

### Runner

`CommandLineRunner`

Responsible for executing and displaying the operations from the console.

## ⚙️ Operations

### 1. Save Single Employee

Use:

```text
save()
```

to store one employee record.

### 2. Save Multiple Employees

Use:

```text
saveAll()
```

to store multiple employee records.

### 3. Display All Employees

Use:

```text
findAll()
```

to retrieve and display all employees available in the database.

## ✅ Validation Rules

- Employee name cannot be blank.
- Salary must be greater than 0.
- Department cannot be empty.

## 🗄️ Database

The application uses MySQL with Spring Data JPA for persistence.

## 🔄 Application Flow

```text
CommandLineRunner
       ↓
EmployeeService
       ↓
EmployeeRepository
       ↓
Spring Data JPA
       ↓
MySQL Database
```

## 📚 Learning Outcome

- Understand Spring Data JPA repository operations.
- Practice `save()` for single records.
- Practice `saveAll()` for multiple records.
- Practice `findAll()` for retrieving records.
- Understand Entity → Repository → Service → Runner flow.
- Implement basic employee validation.
- Store and retrieve employee records from MySQL.