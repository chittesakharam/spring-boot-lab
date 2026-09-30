# Employee Client Service

## Task 89-C

A client microservice that discovers Employee Service through Eureka using `DiscoveryClient`.

## Technologies

- Java
- Spring Boot
- Spring Cloud Netflix Eureka Discovery Client
- Spring Web
- Maven

## Responsibilities

- Register with Eureka Server
- Discover `EMPLOYEE-SERVICE`
- Use `DiscoveryClient`
- Find the Employee Service instance
- Call the `/employee` endpoint
- Return the received message

## Eureka Configuration

Use:

`@EnableDiscoveryClient`

Service name:

`CLIENT-SERVICE`

## REST API

### Get Employee Message

GET

`/client`

Expected response:

`Hello from Employee Service`

## Service Discovery Flow

Client Service
      |
      | DiscoveryClient
      v
Eureka Server
      |
      | Find EMPLOYEE-SERVICE
      v
Employee Service
      |
      v
Hello from Employee Service

## Important Requirement

Service discovery must be performed using `DiscoveryClient`.

Do not use:

- Feign Client
- RestTemplate
- WebClient

## Restrictions

- No MySQL
- No CRUD operations

## Learning Objectives

- Use `DiscoveryClient`
- Discover services dynamically
- Understand Eureka-based communication
- Build service-to-service communication without Feign or RestTemplate