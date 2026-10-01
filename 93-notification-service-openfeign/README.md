# Notification Service - OpenFeign

## Task 93-B

A simple Notification microservice that provides a REST endpoint for Student Service.

## Objective

Return a simple notification message when called by Student Service.

## Technologies

- Java
- Spring Boot
- Spring Web
- Maven

## REST API

GET

`/notification`

## Response

`Notification Service is working successfully`

## Communication Flow

Student Service
      |
      | OpenFeign
      v
Notification Service
      |
      v
Notification Message

## Restrictions

- No database
- No CRUD operations
- No Entity
- No Repository
- No RestTemplate
- No WebClient

## Learning Objectives

- Create a simple REST service
- Provide an endpoint for another microservice
- Understand OpenFeign service communication