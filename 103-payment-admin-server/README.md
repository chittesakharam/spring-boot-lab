# Task 103-B: Spring Boot Admin Server - Payment Monitoring

## Overview
A Spring Boot Admin Server application that monitors the health and
status of the Payment Service.

## Technologies
- Java
- Spring Boot
- Spring Boot Admin Server
- Spring Boot Actuator
- Eureka Discovery Client
- Maven

## Configuration
- Run on port 8080.
- Configure the Spring Boot Admin Server.
- Enable Eureka Client registration.
- Configure the Admin Server to discover monitored services through Eureka.

## Admin Dashboard
http://localhost:8080

## Monitored Service
- Payment Service

## Key Class
- PaymentAdminServerApplication

## Learning Objectives
- Configure Spring Boot Admin Server.
- Monitor microservice health.
- Integrate Spring Boot Admin with Eureka.