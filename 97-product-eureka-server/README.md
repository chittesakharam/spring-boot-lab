# Product Microservices - Eureka Server

## Task 97-C

Eureka Server acts as the service registry for Product Service and Product Client Service.

## Objective

Provide service discovery for the Product microservices.

## Technologies

- Java 8+
- Spring Boot
- Spring Cloud Netflix Eureka Server
- Maven

## Configuration

Use:

`@EnableEurekaServer`

Default port:

`8761`

## Registered Services

### Product Service

Service name:

`PRODUCT-SERVICE`

### Product Client Service

Service name:

`PRODUCT-CLIENT-SERVICE`

## Architecture

                 Eureka Server
                    :8761
                   /       \
                  /         \
                 v           v
       PRODUCT-SERVICE    PRODUCT-CLIENT-SERVICE
             |                    |
             v                    |
           MySQL                  |
                                  |
                                  |
                         OpenFeign
                                  |
                                  v
                         PRODUCT-SERVICE

## Service Discovery Flow

1. Product Service registers with Eureka.
2. Product Client Service registers with Eureka.
3. Product Client Service discovers PRODUCT-SERVICE.
4. OpenFeign uses the discovered service.
5. Product Service performs the actual CRUD operation.

## Responsibilities

- Service registration
- Service discovery
- Provide Eureka Dashboard
- Allow Product Client Service to discover Product Service

## Restrictions

- No database
- No CRUD operations
- No business logic