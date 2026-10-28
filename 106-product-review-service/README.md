# Task 106-C: Product Review Service

## Overview
A Spring Boot REST microservice for managing product reviews using
CRUD operations and MySQL.

The service registers with Eureka and exposes Actuator endpoints
for monitoring through Spring Boot Admin.

## Technologies
- Java
- Spring Boot
- Spring Web
- Spring Data JPA
- MySQL
- Spring Boot Actuator
- Eureka Discovery Client
- Maven

## Review Entity Fields
- id
- reviewerName
- productName
- rating
- comment

## REST API Endpoints

| Operation | HTTP Method | Endpoint |
|-----------|-------------|----------|
| Create | POST | /reviews |
| Read All | GET | /reviews |
| Read by ID | GET | /reviews/{id} |
| Update | PUT | /reviews/{id} |
| Delete | DELETE | /reviews/{id} |

## Exception Handling
Create a custom ReviewNotFoundException.

Use @RestControllerAdvice and @ExceptionHandler to return HTTP 404
when a requested review does not exist.

Example Error Message:
Review not found with id: 101

## Eureka Configuration
Service Name: PRODUCT-SERVICE

Eureka Dashboard:
http://localhost:8761

## Actuator
- /actuator/health
- /actuator/metrics
- /actuator/env
- /actuator/loggers

Expose only the endpoints required for monitoring and secure
sensitive management endpoints appropriately.

## Default Port
8081

## Project Architecture
- Entity: Review
- Repository: ReviewRepository
- Service: ReviewService
- Controller: ReviewController
- Exception: ReviewNotFoundException
- Exception Handler: GlobalExceptionHandler

## Learning Objectives
- Implement CRUD REST APIs.
- Integrate Spring Data JPA with MySQL.
- Handle missing resources using custom exceptions.
- Return appropriate HTTP status codes.
- Register a service with Eureka.
- Enable Actuator monitoring.