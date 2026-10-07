# Product Client Service - OpenFeign CRUD

## Task 99-B

Product Client Service is a separate Spring Boot microservice that performs Product CRUD operations by communicating with Product Service through OpenFeign.

## Objective

Allow clients to perform complete Product CRUD operations without directly accessing the Product database.

## Technologies

- Java 8+
- Spring Boot
- Spring Web
- Spring Cloud OpenFeign
- Eureka Discovery Client
- Maven
- REST API

## Architecture

Client / Postman
       |
       v
Product Client Service
       |
       | @FeignClient
       v
Eureka Server
       |
       | Discover PRODUCT-SERVICE
       v
Product Service
       |
       v
MySQL

## Responsibilities

- Register with Eureka Server
- Enable OpenFeign
- Create Product Feign Client
- Call Product Service through Feign
- Expose client-side CRUD endpoints
- Return responses from Product Service

## Feign Client

Create a Feign interface using:

`@FeignClient`

The Feign Client communicates with:

`PRODUCT-SERVICE`

Do not hardcode the Product Service host or port when using Eureka service discovery.

## Client REST APIs

| HTTP Method | Endpoint | Operation |
|---|---|---|
| POST | `/client/products` | Create Product |
| GET | `/client/products` | Get All Products |
| GET | `/client/products/{id}` | Get Product By ID |
| PUT | `/client/products/{id}` | Update Product |
| DELETE | `/client/products/{id}` | Delete Product |

## Create Product

POST

`/client/products`

Example request:

```json
{
  "name": "Smart Watch",
  "category": "Electronics",
  "price": 2999,
  "quantity": 10
}