# Task 104-C: Product Service Monitoring

## Overview
A Spring Boot microservice that exposes a simple REST endpoint and
registers with Eureka and Spring Boot Admin Server.

## Technologies
- Java
- Spring Boot
- Spring Web
- Spring Boot Actuator
- Spring Boot Admin Client
- Eureka Discovery Client
- Maven

## REST Endpoint

GET /product

Console Output:
Product Service Called

HTTP Response:
Product Service Response

## Configuration
- Run on port 8091.
- Register with Eureka Server.
- Register with Spring Boot Admin Server.
- Expose Actuator health and info endpoints.

## Monitoring
Admin Dashboard:
http://localhost:8090

Eureka Dashboard:
http://localhost:8761

## Key Classes
- ProductServiceApplication
- ProductController

## Learning Objectives
- Create a REST endpoint.
- Register a service with Eureka.
- Register a service with Spring Boot Admin.
- Monitor application health using Actuator.