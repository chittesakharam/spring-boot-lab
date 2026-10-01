# Order Service - OpenFeign

## Task 92-A

A Spring Boot microservice that communicates with Payment Service using Spring Cloud OpenFeign.

## Objective

Demonstrate simple service-to-service communication using OpenFeign without database or CRUD operations.

## Technologies

- Java
- Spring Boot
- Spring Web
- Spring Cloud OpenFeign
- Maven

## Responsibilities

- Create a Feign Client
- Call Payment Service through OpenFeign
- Display the response received from Payment Service

## REST API

GET

`/order`

When this endpoint is called, Order Service uses the Feign Client to communicate with Payment Service.

## Expected Response

`Payment Service is called successfully`

## Communication Flow

Order Service
      |
      | OpenFeign
      v
Payment Service
      |
      v
Payment Service is called successfully

## Restrictions

- No database
- No CRUD operations
- No Entity
- No Repository
- No RestTemplate
- No WebClient

## Learning Objectives

- Understand OpenFeign
- Create a Feign Client
- Communicate between microservices
- Call another REST service through an interface