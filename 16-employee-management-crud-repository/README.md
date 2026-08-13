# Task 16 - Employee Management System using Spring Boot and CrudRepository

## 📌 Scenario

Develop a Spring Boot application to manage employee records using Spring Data JPA and `CrudRepository`.

The application demonstrates all major CRUD and record-management operations provided by `CrudRepository`.

## 🎯 Objective

Practice the complete set of commonly used `CrudRepository` methods for managing Employee records.

## 🛠 Technologies Used

* Java
* Spring Boot
* Spring Data JPA
* CrudRepository
* MySQL
* Maven

## 📦 Classes

* Employee
* EmployeeRepository
* EmployeeService
* EmployeeServiceImpl
* EmployeeController
* SpringBootCrudRepositoryApplication

## 👨‍💼 Employee Fields

* employeeId
* employeeName
* department
* salary

## ⚙️ CrudRepository Operations

| No. | Operation                 | CrudRepository Method |
| --: | ------------------------- | --------------------- |
|   1 | Add Single Employee       | `save()`              |
|   2 | Add Multiple Employees    | `saveAll()`           |
|   3 | View Employee By ID       | `findById()`          |
|   4 | View All Employees        | `findAll()`           |
|   5 | Check Employee Exists     | `existsById()`        |
|   6 | Count Total Employees     | `count()`             |
|   7 | Update Employee Details   | `save()`              |
|   8 | Delete Employee By ID     | `deleteById()`        |
|   9 | Delete Employee Record    | `delete()`            |
|  10 | Delete Multiple Employees | `deleteAll(Iterable)` |
|  11 | Delete All Employees      | `deleteAll()`         |

## 🏗️ Application Architecture

```text
EmployeeController
        ↓
EmployeeService
        ↓
EmployeeServiceImpl
        ↓
EmployeeRepository
        ↓
CrudRepository
        ↓
MySQL Database
```

## 📚 Learning Outcome

* Understand `CrudRepository`.
* Practice all major CRUD operations.
* Implement single and multiple record insertion.
* Retrieve employees by ID and retrieve all employees.
* Check employee existence.
* Count employee records.
* Update employee information.
* Delete single, multiple, and all employee records.
* Understand layered Spring Boot architecture.
