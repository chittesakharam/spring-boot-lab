# Notification Service Discovery - Eureka Server

## Task 91-A

Eureka Server application that acts as the service registry for Notification Service and Notification Client.

## Technologies

- Java
- Spring Boot
- Spring Cloud Netflix Eureka Server
- Spring Web
- Maven

## Responsibilities

- Run as Eureka Service Registry
- Register Notification Service
- Register Notification Client
- Provide service discovery

## Configuration

Use:

`@EnableEurekaServer`

## Registered Services

- NOTIFICATION-SERVICE
- NOTIFICATION-CLIENT

## Restrictions

- No MySQL
- No CRUD operations
- No Feign Client
- No RestTemplate
- No WebClient

## Learning Objectives

- Understand Eureka Server
- Understand service registration
- Understand service discovery