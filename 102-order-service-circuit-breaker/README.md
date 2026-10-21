# Task 102-B: Order Service Circuit Breaker

## Overview
A Spring Boot microservice demonstrating Circuit Breaker functionality
using Resilience4j.

The service prints a message during normal execution and a fallback
message when the circuit breaker triggers the fallback method.

## Technologies
- Java
- Spring Boot
- Spring Web
- Spring Boot Actuator
- Resilience4j Circuit Breaker
- Eureka Discovery Client
- Maven

## REST Endpoint

GET /order

Normal Output:
Order Service Called

Fallback Output:
Order Service Fallback Called

## Circuit Breaker
- Applied to the OrderService method.
- Uses configurable failure thresholds.
- Includes a fallback method.
- Can be tested with simulated failures.

## Eureka Configuration
Service Name: ORDER-SERVICE

Eureka Dashboard:
http://localhost:8761

## Key Classes
- OrderServiceApplication
- OrderController
- OrderService

## Learning Objectives
- Understand Circuit Breaker states.
- Configure Resilience4j.
- Implement fallback handling.
- Register a service with Eureka.