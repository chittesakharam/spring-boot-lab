# Task 102-D: Shopping Service Circuit Breaker

## Overview
A Spring Boot microservice demonstrating Circuit Breaker functionality
using Resilience4j.

The application exposes a REST endpoint and prints a message during
normal execution or when the fallback method is triggered.

## Technologies
- Java
- Spring Boot
- Spring Web
- Spring Boot Actuator
- Resilience4j Circuit Breaker
- Eureka Discovery Client
- Maven

## REST Endpoint

GET /shopping

Normal Output:
Shopping Service Called

Fallback Output:
Shopping Service Fallback Called

## Circuit Breaker
- Applied to the ShoppingService method.
- Uses Resilience4j configuration.
- Includes a fallback method.
- Supports configurable failure thresholds and open-state duration.

## Eureka Configuration
Service Name: SHOPPING-SERVICE

Eureka Dashboard:
http://localhost:8761

## Key Classes
- ShoppingServiceApplication
- ShoppingController
- ShoppingService

## Learning Objectives
- Apply Circuit Breaker to a service method.
- Configure fallback behavior.
- Understand Circuit Breaker states.
- Register a microservice with Eureka.