# Employee Performance Management System - RestTemplate Client

## Task 87-B

A separate Spring Boot client application that communicates with the Employee REST API using `RestTemplate`.

## Objective

Create a client application that performs Employee CRUD operations by consuming the Employee REST API.

The client must NOT directly access the Employee MySQL database.

## Technologies

- Java 17+
- Spring Boot
- Spring Web
- RestTemplate
- Maven
- Postman

## Important Requirement

The EmployeeClient application does not contain direct database access.

All Employee operations must be performed through REST APIs using `RestTemplate`.

## Employee REST API

The Employee REST API is assumed to be running at:

`http://localhost:8080`

## Client Operations

### 1. Create Employee

HTTP Method:

`POST`

Endpoint:

`/employees`

The client sends Employee information to the Employee REST API using `RestTemplate`.

### 2. Get All Employees

HTTP Method:

`GET`

Endpoint:

`/employees`

The client retrieves all employees from the Employee REST API.

### 3. Get Employee By ID

HTTP Method:

`GET`

Endpoint:

`/employees/{id}`

The client retrieves a particular employee through the REST API.

### 4. Update Employee

HTTP Method:

`PUT`

Endpoint:

`/employees/{id}`

The client sends updated employee details through `RestTemplate`.

### 5. Delete Employee

HTTP Method:

`DELETE`

Endpoint:

`/employees/{id}`

The client deletes an employee through the Employee REST API.

## Required Service

Create:

`EmployeeClientService`

This service is responsible for communicating with the Employee REST API using `RestTemplate`.

## Architecture

EmployeeClient Application
        |
        | RestTemplate
        v
Employee REST API
        |
        v
EmployeeController
        |
        v
EmployeeRepository
        |
        v
MySQL Database

## Data Flow

The client sends an HTTP request using `RestTemplate`.

The Employee REST API receives the request and processes the operation.

The Employee API communicates with the repository and MySQL database.

The response is returned to the client through the REST API.

## Important Rule

The client application must never connect directly to MySQL.

Incorrect:

EmployeeClient -> MySQL

Correct:

EmployeeClient -> RestTemplate -> Employee REST API -> MySQL

## CRUD Operations

| Operation | HTTP Method | REST Endpoint |
|---|---|---|
| Create | POST | `/employees` |
| Read All | GET | `/employees` |
| Read By ID | GET | `/employees/{id}` |
| Update | PUT | `/employees/{id}` |
| Delete | DELETE | `/employees/{id}` |

## Learning Objectives

- Understand REST API client-server communication
- Use `RestTemplate`
- Consume REST APIs from another Spring Boot application
- Perform CRUD operations through HTTP
- Understand producer-consumer REST architecture
- Work with request and response objects
- Understand why clients should communicate through APIs instead of directly accessing databases