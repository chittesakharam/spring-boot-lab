# Task 102-C: Notification Service Circuit Breaker

## Overview
A Spring Boot microservice demonstrating Circuit Breaker and fallback
functionality using Resilience4j.

The application prints messages for normal execution and fallback execution.

## Technologies
- Java
- Spring Boot
- Spring Web
- Spring Boot Actuator
- Resilience4j Circuit Breaker
- Eureka Discovery Client
- Maven

## REST Endpoint

GET /notification

Normal Output:
Notification Service Called

Fallback Output:
Notification Service Fallback Called

## Circuit Breaker
- Applied to the NotificationService method.
- Configured with suitable failure thresholds.
- Includes a fallback method.
- Supports testing normal execution and fallback behavior.

## Eureka Configuration
Service Name: NOTIFICATION-SERVICE

Eureka Dashboard:
http://localhost:8761

## Key Classes
- NotificationServiceApplication
- NotificationController
- NotificationService

## Learning Objectives
- Configure a Resilience4j Circuit Breaker.
- Implement fallback behavior.
- Understand failure thresholds.
- Register a microservice with Eureka.