# Employee Service Discovery - Eureka Server

## Task 89-A

Eureka Server application that acts as the service registry for Employee Service and Client Service.

## Technologies

- Java
- Spring Boot
- Spring Cloud Netflix Eureka Server
- Spring Web
- Maven

## Responsibilities

- Run as the Eureka Service Registry
- Register Employee Service
- Register Client Service
- Allow services to discover each other

## Configuration

Enable Eureka Server using:

`@EnableEurekaServer`

## Registered Services

- EMPLOYEE-SERVICE
- CLIENT-SERVICE

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
- Build a basic microservices service registry