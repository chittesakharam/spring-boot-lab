# Task 102-E: Eureka Server for Circuit Breaker Microservices

## Overview
A Spring Boot Eureka Server that provides service registration and
discovery for Payment, Order, Notification, and Shopping services.

Eureka is used only for service discovery. Circuit Breaker behavior
is handled independently by Resilience4j in each microservice.

## Technologies
- Java
- Spring Boot
- Spring Cloud Netflix Eureka Server
- Maven

## Configuration
- Enable Eureka Server.
- Run the server on port 8761.
- Configure all four microservices to register with Eureka.

## Eureka Dashboard
http://localhost:8761

## Registered Services
- PAYMENT-SERVICE
- ORDER-SERVICE
- NOTIFICATION-SERVICE
- SHOPPING-SERVICE

## Key Class
- EurekaServerApplication

## Learning Objectives
- Create a Eureka Server.
- Register multiple microservices.
- View registered service instances.
- Understand service discovery in a microservices architecture.