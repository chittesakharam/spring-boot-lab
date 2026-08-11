# Task 12 - Student Course Registration Management System

## 📌 Project Overview

A layered Spring Boot application for managing student course registrations using Spring Data JPA, CrudRepository, and MySQL.

The application demonstrates CRUD operations, dependency injection, validation, and layered architecture.

## 🎯 Objective

Build a complete Student Management System using:

- Spring Boot
- Spring Data JPA
- CrudRepository
- MySQL
- Dependency Injection
- @Autowired
- CommandLineRunner
- CRUD Operations
- Validation

## 🏗️ Layered Architecture

```text
StudentManagementApplication
          ↓
    StudentRunner
          ↓
   StudentController
          ↓
    StudentService
          ↓
  StudentServiceImpl
          ↓
   StudentRepository
          ↓
      MySQL
```

## 📁 Project Structure

```text
com.nt
│
├── StudentManagementApplication.java
│
├── runner
│   └── StudentRunner.java
│
├── controller
│   └── StudentController.java
│
├── service
│   ├── StudentService.java
│   └── StudentServiceImpl.java
│
├── repository
│   └── StudentRepository.java
│
└── entity
    └── Student.java
```

## 🧩 Components

### Entity

`Student`

Uses:

- @Entity

### Repository

`StudentRepository`

Uses:

- @Repository
- CrudRepository<Student, Integer>

### Service

`StudentService`

Defines business operations.

### Service Implementation

`StudentServiceImpl`

Uses:

- @Service
- @Autowired

### Controller

`StudentController`

Uses:

- @Controller
- @Autowired

### Runner

`StudentRunner`

Uses:

- @Component
- CommandLineRunner

### Main Application

`StudentManagementApplication`

Starts the Spring Boot application.

## 👨‍🎓 Student Fields

| Field | Type |
|---|---|
| studentId | Integer |
| studentName | String |
| courseName | String |
| courseFee | Double |
| instituteName | String |

## ⚙️ Service Operations

- Register Student
- View All Students
- Search Student By ID
- Update Course
- Delete Student
- Count Students

## 🖥️ Application Menu

```text
1. Register Student
2. View All Students
3. Search By ID
4. Update Course
5. Delete Student
6. Count Students
7. Exit
```

## ✅ Validation Rules

- Student Name should not be empty.
- Course Fee must be greater than 0.
- Institute Name should not be empty.

## 🗄️ Database

MySQL is used as the persistent database.

The application uses Spring Data JPA for database operations.

## 🔄 CRUD Operations

### Create
Register a new student.

### Read
View all students or search for a student by ID.

### Update
Update the registered student's course.

### Delete
Delete a student record.

### Count
Display the total number of registered students.

## 🔌 Dependency Injection Flow

```text
Runner
  ↓
Controller
  ↓
Service
  ↓
ServiceImpl
  ↓
Repository
  ↓
MySQL Database
```

## 📚 Learning Outcome

- Understand layered architecture in Spring Boot.
- Implement CRUD operations using Spring Data JPA.
- Use CrudRepository.
- Configure MySQL database integration.
- Practice dependency injection.
- Use @Autowired.
- Use CommandLineRunner.
- Implement basic validation.
- Separate controller, service, repository, and entity responsibilities.