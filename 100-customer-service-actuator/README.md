# Customer Service - Spring Boot Actuator

## Overview
A Spring Boot microservice that exposes a simple REST endpoint and uses Spring Boot Actuator to monitor application health and display application information.

The Customer Service registers with the Eureka Server for service discovery.

## Requirements
- Spring Boot
- Spring Web
- Spring Boot Actuator
- Eureka Discovery Client
- No database
- No CRUD operations

## Customer Variables
- customerId
- customerName

## REST Endpoints

### Customer Service
GET /customer

Expected Response:
Customer Service is running

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
- Service Name: CUSTOMER-SERVICE
- Registers with the Eureka Server.
- Eureka Dashboard: http://localhost:8761

## Default Port
8081

## Configuration
Configure Spring Boot Actuator to expose the health and info endpoints.
Configure the Eureka Server URL and enable Eureka client registration.

## Key Classes
- CustomerServiceApplication
- CustomerController

## Learning Objectives
- Create a basic Spring Boot microservice.
- Implement a simple REST endpoint.
- Configure Spring Boot Actuator.
- Check application health using /actuator/health.
- Display application information using /actuator/info.
- Register a microservice with Eureka.