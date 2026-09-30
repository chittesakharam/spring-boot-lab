# Employee Service

## Task 89-B

A simple Employee microservice registered with Eureka Server.

## Technologies

- Java
- Spring Boot
- Spring Cloud Netflix Eureka Discovery Client
- Spring Web
- Maven

## Responsibilities

- Register with Eureka Server
- Expose an Employee REST endpoint
- Return a simple message

## Eureka Configuration

Register the application with Eureka using:

`@EnableDiscoveryClient`

Service name:

`EMPLOYEE-SERVICE`

## REST API

### Get Employee Message

GET

`/employee`

Response:

`Hello from Employee Service`

## Restrictions

- No MySQL
- No CRUD operations
- No Feign Client
- No RestTemplate
- No WebClient

## Learning Objectives

- Register a microservice with Eureka
- Understand Eureka Discovery Client
- Create a simple REST endpoint
- Understand service registration