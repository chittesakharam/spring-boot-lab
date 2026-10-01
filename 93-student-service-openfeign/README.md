# Student Service - OpenFeign

## Task 93-A

A Spring Boot Student Service that communicates with Notification Service using OpenFeign.

## Objective

Use OpenFeign to call Notification Service and display the returned notification message.

## Technologies

- Java
- Spring Boot
- Spring Web
- Spring Cloud OpenFeign
- Maven

## Responsibilities

- Create a Feign Client
- Discover/call Notification Service through the configured service URL
- Receive the notification response
- Display the response

## REST API

GET

`/student`

## Expected Response

`Notification Service is working successfully`

## Communication Flow

Student Service
      |
      | OpenFeign
      v
Notification Service
      |
      v
Notification Service is working successfully

## Restrictions

- No database
- No CRUD operations
- No Entity
- No Repository
- No RestTemplate
- No WebClient

## Learning Objectives

- Create an OpenFeign client
- Call another microservice
- Understand declarative REST communication