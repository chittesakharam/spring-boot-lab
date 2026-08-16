# Task 21 - Online Book Rental Management System

## 📌 Scenario

Develop a Spring Boot application using `JpaRepository` to manage books available for rent in an online library.

## 🎯 Objective

Practice CRUD operations using Spring Data JPA `JpaRepository` with a rental book management system.

## 🛠 Technologies Used

* Java
* Spring Boot
* Spring Data JPA
* JpaRepository
* MySQL
* Maven

## 📚 Entity

`RentalBook`

### Fields

* bookId
* bookTitle
* authorName
* category
* rentalPrice

### Methods

* Getters and Setters
* Constructors
* toString()

## 🗄️ Repository

`RentalBookRepository`

```text
JpaRepository<RentalBook, Long>
```

## 🔧 Service

`RentalBookService`

### Service Methods

* `saveBook(RentalBook book)`
* `saveAllBooks(List<RentalBook> books)`
* `getBookById(Long id)`
* `getAllBooks()`
* `updateBook(RentalBook book)`
* `deleteBookById(Long id)`
* `deleteAllBooks()`
* `countBooks()`
* `existsBook(Long id)`

## ⚙️ Operations

### 1. Add New Rental Book

Use `save()` to add a single rental book.

### 2. Add Multiple Rental Books

Use `saveAll()` to add multiple books.

### 3. Display All Books

Use `findAll()` to retrieve all rental books.

### 4. Search Book By ID

Use `findById()` to search for a specific rental book.

### 5. Check Book Exists

Use `existsById()` to verify whether a book exists.

### 6. Count Total Books

Use `count()` to count all rental books.

### 7. Update Rental Price

Use `save()` to update the rental price of an existing book.

### 8. Delete Book

Use `deleteById()` to remove a specific book.

### 9. Delete All Books

Use `deleteAll()` to remove all rental book records.

## 🏗️ Application Flow

```text
CommandLineRunner
       ↓
RentalBookService
       ↓
RentalBookRepository
       ↓
JpaRepository
       ↓
MySQL Database
```

## 📋 Main Class

All operations should be performed through `CommandLineRunner`.

The application should print the results of each operation through the console.

## 📚 Learning Outcome

* Understand `JpaRepository`.
* Practice single and multiple record insertion.
* Practice `findAll()` and `findById()`.
* Practice `existsById()` and `count()`.
* Practice update using `save()`.
* Practice `deleteById()` and `deleteAll()`.
* Understand Entity → Repository → Service → Runner architecture.
* Practice Spring Data JPA CRUD operations with MySQL.
