# Employee Performance Management System - REST API

## Task 87-A

A Spring Boot REST API application for managing Employee data using CRUD operations.

## Objective

Develop a REST API that performs CRUD operations on Employee data and stores the data in a MySQL database.

## Technologies

- Java 17+
- Spring Boot
- Spring Web
- Spring Data JPA
- MySQL
- Maven
- Postman

## Entity: Employee

| Field | Type |
|---|---|
| employeeId | Long |
| employeeName | String |
| department | String |
| salary | Double |
| designation | String |

`employeeId` is the primary key and is generated automatically.

## Repository

Create `EmployeeRepository` extending:

`JpaRepository<Employee, Long>`

## REST Endpoints

| HTTP Method | Endpoint | Operation |
|---|---|---|
| POST | `/employees` | Add Employee |
| GET | `/employees` | Get All Employees |
| GET | `/employees/{id}` | Get Employee By ID |
| PUT | `/employees/{id}` | Update Employee |
| DELETE | `/employees/{id}` | Delete Employee |

## Architecture

Client Application
        |
        | REST API
        v
EmployeeController
        |
        v
EmployeeRepository
        |
        v
MySQL Database

## Bonus Requirements

- Use proper HTTP status codes
- Use `ResponseEntity`
- Implement exception handling using `@RestControllerAdvice`
- Create custom Employee Not Found exception
- Use validation with `@Valid`
- Test all REST APIs using Postman

## API Testing

### Add Employee

POST `/employees`

Example request:

```json
{
  "employeeName": "Rahul",
  "department": "IT",
  "salary": 55000,
  "designation": "Java Developer"
}