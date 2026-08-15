# Task 19 - Movie Ticket Booking System Using Sorting

## 📌 Scenario

A movie booking company wants to display movies sorted by ticket price and movie name so customers can easily find suitable movies.

## 🎯 Objective

Develop a Spring Boot application that demonstrates sorting using Spring Data JPA and `PagingAndSortingRepository`.

## 🛠 Technologies Used

* Java
* Spring Boot
* Spring Data JPA
* PagingAndSortingRepository
* MySQL
* Maven

## 🎬 Movie Entity

### Fields

* movieId
* movieName
* language
* ticketPrice

## 📦 Classes

* Movie
* MovieRepository
* MovieService
* MovieServiceImpl
* AppConfig
* MainClass

## 🗄️ Repository

`MovieRepository` extends:

```text
PagingAndSortingRepository<Movie, Integer>
```

## ⚙️ Requirements

* Create the Movie entity.
* Create MovieRepository using `PagingAndSortingRepository`.
* Insert a minimum of 10 movie records.
* Implement sorting using Spring Data JPA.
* Display movies based on different sorting criteria.

## 🔤 Sorting Operations

### 1. Movie Name Ascending

Sort movies alphabetically from A to Z.

### 2. Movie Name Descending

Sort movies alphabetically from Z to A.

### 3. Ticket Price Ascending

Display movies from the lowest ticket price to the highest.

### 4. Ticket Price Descending

Display movies from the highest ticket price to the lowest.

## 🚀 Expected Operations

* Sort movies by name.
* Sort movies by ticket price.
* Display movie name in ascending order.
* Display movie name in descending order.
* Display ticket price in ascending order.
* Display ticket price in descending order.

## 🔄 Application Flow

```text
MainClass
    ↓
MovieService
    ↓
MovieServiceImpl
    ↓
MovieRepository
    ↓
PagingAndSortingRepository
    ↓
MySQL Database
```

## 📚 Learning Outcome

* Understand sorting in Spring Data JPA.
* Use `PagingAndSortingRepository`.
* Practice `Sort`.
* Sort records in ascending order.
* Sort records in descending order.
* Sort by String fields.
* Sort by numeric fields.
* Practice Entity → Repository → Service → MainClass architecture.
