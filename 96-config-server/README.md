# Config Server

## Task 96-A

Spring Cloud Config Server responsible for providing centralized configuration to the microservices.

## Technologies

- Java
- Spring Boot
- Spring Cloud Config Server
- Maven

## Configuration

Use:

`@EnableConfigServer`

Port:

`8888`

## Responsibilities

- Provide centralized configuration
- Store Message Service configuration
- Store Client Service configuration
- Allow microservices to retrieve configuration from Config Server

## Example Message Service Configuration

```properties
server.port=8081
message=Hello from Message Service