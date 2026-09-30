# Payment Service Discovery - Eureka Server

## Task 90-A

Eureka Server application that acts as the service registry for Payment Service and Payment Client Service.

## Technologies

- Java
- Spring Boot
- Spring Cloud Netflix Eureka Server
- Spring Web
- Maven

## Responsibilities

- Run as Eureka Service Registry
- Register Payment Service
- Register Payment Client Service
- Provide service discovery

## Configuration

Use:

`@EnableEurekaServer`

## Registered Services

- PAYMENT-SERVICE
- PAYMENT-CLIENT-SERVICE

## Restrictions

- No database
- No CRUD operations
- No Feign Client
- No RestTemplate
- No WebClient

## Learning Objectives

- Understand Eureka Server
- Understand service registration
- Understand service discovery