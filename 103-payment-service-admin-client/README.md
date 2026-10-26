# Task 103-C: Payment Service Monitoring

## Overview
A Spring Boot microservice that exposes a simple REST endpoint and
registers with Eureka and Spring Boot Admin Server for monitoring.

## Technologies
- Java
- Spring Boot
- Spring Web
- Spring Boot Actuator
- Spring Boot Admin Client
- Eureka Discovery Client
- Maven

## REST Endpoint

GET /payment

Console Output:
Payment Service Called

HTTP Response:
Payment Service Response

## Configuration
- Run on port 8081.
- Register with Eureka Server.
- Register with Spring Boot Admin Server.
- Expose Actuator health and info endpoints.

## Monitoring
Admin Dashboard:
http://localhost:8080

Eureka Dashboard:
http://localhost:8761

## Key Classes
- PaymentServiceApplication
- PaymentController

## Learning Objectives
- Create a REST endpoint.
- Register a service with Eureka.
- Register a service with Spring Boot Admin.
- Monitor application health using Actuator.