# Task 106-B: Product Review Admin Server

## Overview
A Spring Boot Admin Server that monitors the health and operational
status of Product Service and Product Service Client.

## Technologies
- Java
- Spring Boot
- Spring Boot Admin Server
- Spring Boot Actuator
- Eureka Discovery Client
- Maven

## Configuration
- Run on port 9090.
- Configure Spring Boot Admin Server.
- Enable Eureka service discovery.
- Discover the monitored microservices through Eureka.

## Admin Dashboard
http://localhost:9090

## Monitored Applications
- PRODUCT-SERVICE
- PRODUCT-SERVICE-CLIENT

## Monitoring Features
- Application status
- Health
- Metrics
- Environment
- Loggers

## Key Class
- ProductReviewAdminServerApplication

## Learning Objectives
- Configure Spring Boot Admin Server.
- Monitor microservice health.
- View application metrics and environment information.
- Integrate Admin Server with Eureka.