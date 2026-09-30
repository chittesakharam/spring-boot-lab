# Payment Service

## Task 90-B

A simple Payment microservice registered with Eureka Server.

## Technologies

- Java
- Spring Boot
- Spring Cloud Netflix Eureka Discovery Client
- Spring Web
- Maven

## Responsibilities

- Register with Eureka Server
- Expose the payment endpoint
- Return a payment-related message

## Eureka Configuration

Use:

`@EnableDiscoveryClient`

Service name:

`PAYMENT-SERVICE`

## REST API

### Get Payment Message

GET

`/payment`

Response:

`Payment Service is running successfully`

## Restrictions

- No database
- No CRUD operations
- No Feign Client
- No RestTemplate
- No WebClient

## Learning Objectives

- Register a service with Eureka
- Understand Discovery Client
- Create a simple REST microservice