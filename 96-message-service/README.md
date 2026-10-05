# Message Service

## Task 96-C

A simple Spring Boot microservice that obtains its configuration from Config Server and registers itself with Eureka Server.

## Technologies

- Java
- Spring Boot
- Spring Web
- Spring Cloud Config Client
- Eureka Discovery Client
- Maven

## Responsibilities

- Connect to Config Server
- Obtain configuration from Config Server
- Register with Eureka Server
- Expose the `/message` REST endpoint
- Return the configured message

## Service Name

`MESSAGE-SERVICE`

## Configuration

The service receives configuration from Config Server.

Example:

```properties
server.port=8081
message=Hello from Message Service