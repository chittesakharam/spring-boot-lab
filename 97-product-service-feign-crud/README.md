# Product Service - Feign CRUD

## Task 99-A

Product Service is the provider microservice responsible for managing Product data and performing all actual CRUD operations with MySQL.

## Objective

Create a Spring Boot microservice that provides Product CRUD REST APIs.

The Product Client Service must access Product data only through REST APIs using OpenFeign.

## Technologies

- Java 8+
- Spring Boot
- Spring Web
- Spring Data JPA
- MySQL
- Eureka Discovery Client
- Maven
- REST API

## Entity: Product

| Field | Type |
|---|---|
| id | Long |
| name | String |
| category | String |
| price | Double |
| quantity | Integer |

## Architecture

Product Client Service
        |
        | OpenFeign
        v
Eureka Server
        |
        | Service Discovery
        v
Product Service
        |
        v
ProductRepository
        |
        v
MySQL Database

## Responsibilities

- Register with Eureka Server
- Manage Product data
- Perform CRUD operations
- Store Product data in MySQL
- Provide REST APIs for Product Client Service

## REST APIs

| HTTP Method | Endpoint | Operation |
|---|---|---|
| POST | `/products` | Insert Product |
| GET | `/products` | Get All Products |
| GET | `/products/{id}` | Get Product By ID |
| PUT | `/products/{id}` | Update Product |
| DELETE | `/products/{id}` | Delete Product |

## Repository

Create:

`ProductRepository`

extending:

`JpaRepository<Product, Long>`

## Layered Structure

- Entity
- Repository
- Service
- Controller

## Eureka Registration

Register Product Service with Eureka Server.

Service name:

`PRODUCT-SERVICE`

## Example Product

```json
{
  "name": "Smart Watch",
  "category": "Electronics",
  "price": 2999,
  "quantity": 10
}