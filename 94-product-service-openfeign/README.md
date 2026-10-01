# Product Service - OpenFeign

## Task 94-A

A Spring Boot Product Service that communicates with Inventory Service using OpenFeign.

## Objective

Demonstrate simple service-to-service communication using Spring Cloud OpenFeign.

## Technologies

- Java
- Spring Boot
- Spring Web
- Spring Cloud OpenFeign
- Maven

## Responsibilities

- Create a Feign Client
- Call Inventory Service
- Receive the inventory response
- Display the response

## REST API

GET

`/product`

## Expected Response

`Inventory Service called successfully`

## Communication Flow

Product Service
      |
      | OpenFeign
      v
Inventory Service
      |
      v
Inventory Service called successfully

## Restrictions

- No MySQL
- No other database
- No CRUD operations
- No Entity
- No Repository
- No RestTemplate
- No WebClient

## Learning Objectives

- Use Spring Cloud OpenFeign
- Create a Feign Client
- Communicate between microservices
- Understand declarative REST calls