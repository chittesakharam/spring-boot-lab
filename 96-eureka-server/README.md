# Eureka Server

## Task 96-B

Eureka Discovery Server that acts as the service registry for Message Service and Client Service.

## Technologies

- Java
- Spring Boot
- Spring Cloud Netflix Eureka Server
- Maven

## Configuration

Use:

`@EnableEurekaServer`

Port:

`8761`

## Responsibilities

- Register Message Service
- Register Client Service
- Provide service discovery
- Provide Eureka Dashboard

## Registered Services

- MESSAGE-SERVICE
- CLIENT-SERVICE

## Architecture

Message Service
       |
       | Registration
       v
Eureka Server
       ^
       | Registration
       |
Client Service

## Restrictions

- No database
- No CRUD operations
- No business logic

## Learning Objectives

- Understand Eureka Server
- Understand service registration
- Understand service discovery
- Monitor services through Eureka Dashboard