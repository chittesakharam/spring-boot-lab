# Notification Client

## Task 91-C

A client microservice that discovers Notification Service using Eureka `DiscoveryClient`.

## Technologies

- Java
- Spring Boot
- Spring Cloud Netflix Eureka Discovery Client
- Spring Web
- Maven

## Responsibilities

- Register with Eureka Server
- Discover `NOTIFICATION-SERVICE`
- Use `DiscoveryClient`
- Find the Notification Service instance
- Communicate with the discovered service
- Return the received message

## Eureka Configuration

Use:

`@EnableDiscoveryClient`

Service name:

`NOTIFICATION-CLIENT`

## REST API

### Get Notification Message

GET

`/notification-client`

Expected response:

`Welcome to Notification Service`

## Service Discovery Flow

Notification Client
      |
      | DiscoveryClient
      v
Eureka Server
      |
      | Find NOTIFICATION-SERVICE
      v
Notification Service
      |
      v
Welcome to Notification Service

## Important Requirement

Use `DiscoveryClient` for service discovery.

Do not use:

- Feign Client
- RestTemplate
- WebClient

## Restrictions

- No MySQL
- No CRUD operations

## Learning Objectives

- Use Eureka Discovery Client
- Discover services dynamically
- Understand service-to-service communication
- Build microservices without Feign, RestTemplate, or WebClient