# Client Service

## Task 96-D

A Spring Boot microservice that uses OpenFeign and Eureka Service Discovery to communicate with Message Service.

## Technologies

- Java
- Spring Boot
- Spring Web
- Spring Cloud Config Client
- Eureka Discovery Client
- Spring Cloud OpenFeign
- Maven

## Responsibilities

- Connect to Config Server
- Register with Eureka Server
- Create a Feign Client
- Discover Message Service through Eureka
- Call Message Service using OpenFeign
- Return the received message

## Service Name

`CLIENT-SERVICE`

## Feign Client

Use:

`@FeignClient`

The Feign Client should communicate with:

`MESSAGE-SERVICE`

Do not hardcode the Message Service host or port.

## REST API

### Get Message From Message Service

GET

`/client-message`

Expected response:

`Client Service received: Hello from Message Service`

## Communication Flow

Client
   |
   v
Client Service
   |
   | @FeignClient
   v
Eureka Server
   |
   | Discover MESSAGE-SERVICE
   v
Message Service
   |
   v
Hello from Message Service

Client Service receives:

`Hello from Message Service`

and returns:

`Client Service received: Hello from Message Service`

## Configuration Flow

Client Service
      |
      v
Config Server :8888

Message Service
      |
      v
Config Server :8888

## Important Requirements

- Use `@FeignClient`
- Use Eureka for service discovery
- Do not hardcode Message Service host/port
- Use the Eureka service name
- Use REST Controller for the client endpoint

## Restrictions

- No database
- No CRUD operations
- No Entity
- No Repository
- No MySQL
- No RestTemplate
- No WebClient

## Learning Objectives

- Integrate Config Server with microservices
- Integrate Eureka with OpenFeign
- Use service discovery with Feign
- Understand centralized configuration
- Implement microservice-to-microservice communication