# Notification Service

## Task 91-B

A simple Notification microservice registered with Eureka Server.

## Technologies

- Java
- Spring Boot
- Spring Cloud Netflix Eureka Discovery Client
- Spring Web
- Maven

## Responsibilities

- Register with Eureka Server
- Expose the notification endpoint
- Return a notification message

## Eureka Configuration

Use:

`@EnableDiscoveryClient`

Service name:

`NOTIFICATION-SERVICE`

## REST API

### Get Notification Message

GET

`/notification`

Response:

`Welcome to Notification Service`

## Restrictions

- No MySQL
- No CRUD operations
- No Feign Client
- No RestTemplate
- No WebClient

## Learning Objectives

- Register a service with Eureka
- Understand Discovery Client
- Create a simple REST microservice