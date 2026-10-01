# Payment Service - OpenFeign

## Task 92-B

A simple Payment microservice that provides a REST endpoint for Order Service.

## Objective

Return a simple payment message when called by Order Service through OpenFeign.

## Technologies

- Java
- Spring Boot
- Spring Web
- Maven

## REST API

GET

`/payment`

## Response

`Payment Service is called successfully`

## Communication Flow

Order Service
      |
      | OpenFeign
      v
Payment Service
      |
      v
Payment Message

## Restrictions

- No database
- No CRUD operations
- No Entity
- No Repository
- No RestTemplate
- No WebClient

## Learning Objectives

- Create a simple REST microservice
- Expose an endpoint for another service
- Understand OpenFeign communication