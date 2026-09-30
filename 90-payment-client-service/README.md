# Payment Client Service

## Task 90-C

A client microservice that discovers Payment Service using Eureka `DiscoveryClient`.

## Technologies

- Java
- Spring Boot
- Spring Cloud Netflix Eureka Discovery Client
- Spring Web
- Maven

## Responsibilities

- Register with Eureka Server
- Discover `PAYMENT-SERVICE`
- Use `DiscoveryClient`
- Find the Payment Service instance
- Communicate with Payment Service
- Return the received response

## Eureka Configuration

Use:

`@EnableDiscoveryClient`

Service name:

`PAYMENT-CLIENT-SERVICE`

## REST API

### Get Payment Message

GET

`/payment-client`

Expected response:

`Payment Service is running successfully`

## Service Discovery Flow

Payment Client Service
      |
      | DiscoveryClient
      v
Eureka Server
      |
      | Find PAYMENT-SERVICE
      v
Payment Service
      |
      v
Payment Service is running successfully

## Important Requirement

Use `DiscoveryClient` for service discovery.

Do not use:

- Feign Client
- RestTemplate
- WebClient

## Restrictions

- No database
- No CRUD operations

## Learning Objectives

- Discover a service using Eureka
- Use `DiscoveryClient`
- Understand microservice-to-microservice communication