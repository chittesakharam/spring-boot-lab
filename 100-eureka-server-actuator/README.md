# Eureka Server - Microservices Service Discovery

## Overview
A Spring Boot Eureka Server that provides a service registry for Customer Service and Order Service.

Both microservices register with this server so their registration status can be viewed through the Eureka Dashboard.

## Requirements
- Spring Boot
- Spring Cloud Netflix Eureka Server
- No database
- No CRUD operations

## Configuration
- Enable Eureka Server.
- Configure the server to run on port 8761.
- Configure Customer Service and Order Service to register with Eureka.

## Eureka Dashboard
http://localhost:8761

## Registered Microservices
- CUSTOMER-SERVICE
- ORDER-SERVICE

## Key Class
- EurekaServerApplication

## Learning Objectives
- Create a Eureka Server.
- Understand service registration and discovery.
- Register multiple microservices with Eureka.
- View registered service instances in the Eureka Dashboard.