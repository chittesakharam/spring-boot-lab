# Task 23 - Employee Payroll Management System

## 📌 Scenario

Develop a Spring Boot console-based Employee Payroll Management System using `CrudRepository`.

The application manages employee payroll information including salary, bonus, designation, and experience.

## 🎯 Objective

Practice Spring Data JPA `CrudRepository` operations with an employee payroll management system.

## 🛠 Technologies Used

- Java
- Spring Boot
- Spring Data JPA
- CrudRepository
- MySQL
- Maven

## 👨‍💼 Employee Payroll Fields

- employeeId
- employeeName
- department
- designation
- basicSalary
- bonus
- netSalary
- experience
- performanceRating

## 🗄️ Repository

`EmployeeRepository`

Uses:

```text
CrudRepository<Employee, Integer>
```

## ⚙️ Operations

### 1. Register Employee

Store a new employee and payroll details in the database.

### 2. Display All Employees

Display all employee records along with payroll information.

### 3. Search Employee By ID

Search employee and payroll details using Employee ID.

### 4. Update Employee Details

Update:

- Salary
- Bonus
- Designation
- Performance Rating

### 5. Delete Employee

Delete employee records when an employee resigns.

### 6. Calculate Net Salary

Net salary is calculated using:

```text
Net Salary = Basic Salary + Bonus
```

## 💰 Payroll Calculation

Example:

```text
Basic Salary : 50000
Bonus        : 5000
Net Salary   : 55000
```

## 🏗️ Application Flow

```text
CommandLineRunner
       ↓
EmployeeService
       ↓
EmployeeRepository
       ↓
CrudRepository
       ↓
MySQL Database
```

## 📋 Main Operations

```text
1. Register Employee
2. Display All Employees
3. Search Employee By ID
4. Update Employee Payroll Details
5. Delete Employee
6. Calculate Net Salary
7. Exit
```

## 📚 Learning Outcome

- Understand `CrudRepository`.
- Practice employee record management.
- Implement payroll-related business logic.
- Calculate net salary using salary and bonus.
- Practice create, read, update, and delete operations.
- Understand Entity → Repository → Service → Runner architecture.
- Work with Spring Data JPA and MySQL.