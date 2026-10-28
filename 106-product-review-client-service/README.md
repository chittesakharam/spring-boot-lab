# Task 106-D: Product Review Client Service

## Overview
A Spring Boot microservice that communicates with Product Service
through OpenFeign.

It forwards product review CRUD requests and uses Resilience4j
Circuit Breaker to provide fallback responses when Product Service
is unavailable.

## Technologies
- Java
- Spring Boot
- Spring Web
- Spring Cloud OpenFeign
- Resilience4j Circuit Breaker
- Spring Boot Actuator
- Eureka Discovery Client
- Spring Boot Admin Client
- Maven

## REST API Endpoints

| Operation | HTTP Method | Endpoint |
|-----------|-------------|----------|
| Create | POST | /client/reviews |
| Read All | GET | /client/reviews |
| Read by ID | GET | /client/reviews/{id} |
| Update | PUT | /client/reviews/{id} |
| Delete | DELETE | /client/reviews/{id} |

## OpenFeign Configuration
- Enable Feign using @EnableFeignClients.
- Define a Feign interface using @FeignClient.
- Discover PRODUCT-SERVICE through Eureka.
- Forward CRUD requests to Product Service.
- Do not use RestTemplate.
- Do not access MySQL directly from this client.

## Circuit Breaker
Use Resilience4j @CircuitBreaker to protect Feign calls.

Configure:
- Failure rate threshold
- Sliding window size
- Wait duration in the open state
- Fallback method

## Expected Fallback Message
Review Service is currently unavailable.
Please try again later.

## Eureka Configuration
Service Name: PRODUCT-SERVICE-CLIENT

Eureka Dashboard:
http://localhost:8761

## Actuator
Expose the endpoints required for Spring Boot Admin monitoring.

## Default Port
8082

## Key Components
- ProductReviewClientApplication
- ReviewFeignClient
- ClientReviewController
- ReviewFallbackService or compatible fallback methods

## Learning Objectives
- Communicate between microservices using OpenFeign.
- Discover services through Eureka.
- Configure Resilience4j Circuit Breaker.
- Implement fallback behavior.
- Forward CRUD requests without direct database access.
- Register with Spring Boot Admin for monitoring.