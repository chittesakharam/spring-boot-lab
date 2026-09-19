# Travel Package Management System - Spring Boot WebFlux

## Task 88

A Spring Boot WebFlux application that performs complete CRUD operations on TravelPackage data using MySQL as the database.

## Objective

Build a reactive CRUD REST API using Spring WebFlux, `Mono`, and `Flux` with MySQL database connectivity.

## Technologies

- Java 17+
- Spring Boot
- Spring WebFlux
- Spring Data R2DBC
- MySQL
- Mono
- Flux
- Maven
- Postman

## Database

Database name:

`travel_db`

MySQL is the only database used in this project.

## Entity: TravelPackage

| Field | Data Type | Description |
|---|---|---|
| packageId | Integer | Primary Key |
| packageName | String | Name of the travel package |
| destination | String | Travel destination |
| price | Double | Package price |
| duration | Integer | Duration in days |

## Required Classes

- `TravelPackage`
- `TravelPackageRepository`
- `TravelPackageService`
- `TravelPackageServiceImpl`
- `TravelPackageController`
- `WebFluxApplication`

## Architecture

Client / Postman
        |
        v
TravelPackageController
        |
        v
TravelPackageService
        |
        v
TravelPackageRepository
        |
        v
MySQL Database

## Reactive Programming

Use `Mono` for operations that return a single result.

Use `Flux` for operations that return multiple results.

Examples:

- `Mono<TravelPackage>` - single TravelPackage
- `Flux<TravelPackage>` - multiple TravelPackage records

## REST APIs

### 1. Create Travel Package

**POST**

`/travel-packages`

Example request:

```json
{
  "packageName": "Royal Rajasthan Tour",
  "destination": "Jaipur",
  "price": 25000,
  "duration": 5
}