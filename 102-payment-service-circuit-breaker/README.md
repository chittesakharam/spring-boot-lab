# Task 102-A: Payment Service Circuit Breaker

## Overview
A Spring Boot application demonstrating Circuit Breaker functionality
using Resilience4j.

The application exposes a REST endpoint and prints a message when
the service executes normally or when its fallback method is triggered.

## Technologies
- Java
- Spring Boot
- Spring Web
- Spring Boot Actuator
- Resilience4j Circuit Breaker
- Eureka Discovery Client
- Maven

## REST Endpoint

GET /payment

Normal Output:
Payment Service Called

Fallback Output:
Payment Service Fallback Called

## Circuit Breaker
- Protects the PaymentService method.
- Uses Resilience4j.
- Executes a fallback method when the circuit breaker triggers it.
- Uses configurable failure thresholds and open-state duration.

## Eureka Configuration
Service Name: PAYMENT-SERVICE

Eureka Dashboard:
http://localhost:8761

## Key Classes
- PaymentServiceApplication
- PaymentController
- PaymentService

## Learning Objectives
- Configure Resilience4j.
- Apply Circuit Breaker to a service method.
- Implement a fallback method.
- Expose a REST endpoint.
- Register a microservice with Eureka.