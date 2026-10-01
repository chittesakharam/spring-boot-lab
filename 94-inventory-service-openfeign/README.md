# Inventory Service - OpenFeign

## Task 94-B

A simple Inventory microservice that provides a REST endpoint for Product Service.

## Objective

Return a simple inventory message when called by Product Service through OpenFeign.

## Technologies

- Java
- Spring Boot
- Spring Web
- Maven

## REST API

GET

`/inventory`

## Response

`Inventory Service called successfully`

## Communication Flow

Product Service
      |
      | OpenFeign
      v
Inventory Service
      |
      v
Inventory Message

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