# Order Service - Spring Boot Actuator

## Overview
A Spring Boot microservice that exposes a simple REST endpoint and uses Spring Boot Actuator to monitor application health and display application information.

The Order Service registers with the Eureka Server for service discovery.

## Requirements
- Spring Boot
- Spring Web
- Spring Boot Actuator
- Eureka Discovery Client
- No database
- No CRUD operations
- No service-to-service communication

## Order Variables
- orderId
- productName

## REST Endpoints

### Order Service
GET /order

Expected Response:
Order Service is running

### Actuator Health
GET /actuator/health

Expected Response:
{
  "status": "UP"
}

### Actuator Information
GET /actuator/info

Displays basic application information configured in application properties.

## Eureka Registration
- Service Name: ORDER-SERVICE
- Registers with the Eureka Server.
- Eureka Dashboard: http://localhost:8761

## Default Port
8082

## Configuration
Configure Spring Boot Actuator to expose the health and info endpoints.
Configure the Eureka Server URL and enable Eureka client registration.

## Key Classes
- OrderServiceApplication
- OrderController

## Learning Objectives
- Create a basic Spring Boot microservice.
- Implement a simple REST endpoint.
- Configure Spring Boot Actuator.
- Monitor application health.
- Display application information.
- Register a microservice with Eureka.