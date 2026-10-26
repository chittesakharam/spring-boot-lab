# Task 104-B: Spring Boot Admin Server - Product Monitoring

## Overview
A Spring Boot Admin Server that monitors the health and status of the
Product Service.

## Technologies
- Java
- Spring Boot
- Spring Boot Admin Server
- Spring Boot Actuator
- Eureka Discovery Client
- Maven

## Configuration
- Run on port 8090.
- Configure Spring Boot Admin Server.
- Enable Eureka Client registration.
- Configure the Admin Server to discover monitored services through Eureka.

## Admin Dashboard
http://localhost:8090

## Monitored Service
- Product Service

## Key Class
- ProductAdminServerApplication

## Learning Objectives
- Configure Spring Boot Admin Server.
- Monitor microservice health.
- Integrate Spring Boot Admin with Eureka.