# Task 20 - Library Book Management System Using JpaRepository

## 📌 Scenario

A library wants to manage book records using Spring Data JPA. The librarian should be able to add, update, search, delete, check availability, and view books through console-based operations.

## 🎯 Objective

Develop a Spring Boot application using `JpaRepository` and practice common database operations without using REST APIs.

## 🛠 Technologies Used

* Java
* Spring Boot
* Spring Data JPA
* JpaRepository
* MySQL
* Maven

## 📚 Book Entity

### Fields

* bookId
* bookName
* authorName
* price

## 📦 Classes

* Book
* BookRepository
* BookService
* BookServiceImpl
* AppConfig
* MainClass

## 🗄️ Repository

`BookRepository` extends:

```text
JpaRepository<Book, Integer>
```

## ⚙️ JpaRepository Methods Used

* `save()`
* `findAll()`
* `findById()`
* `deleteById()`
* `existsById()`
* `count()`

## 📋 Requirements

* Create the Book entity.
* Create BookRepository using `JpaRepository<Book, Integer>`.
* Insert at least 5 book records.
* Perform CRUD operations using JpaRepository methods.
* Display all results through console output.
* Do not create Spring Boot REST APIs.

## 🚀 Expected Operations

### 1. Add New Book

Use `save()` to insert a new book.

### 2. View All Books

Use `findAll()` to retrieve all books.

### 3. Search Book By ID

Use `findById()` to search for a specific book.

### 4. Update Book Price

Use `save()` to update an existing book's price.

### 5. Delete Book

Use `deleteById()` to delete a book.

### 6. Check Book Availability

Use `existsById()` to check whether a book exists.

### 7. Count Total Books

Use `count()` to display the total number of books.

## 🔄 Application Flow

```text
MainClass
    ↓
BookService
    ↓
BookServiceImpl
    ↓
BookRepository
    ↓
JpaRepository
    ↓
MySQL Database
```

## 📤 Output

All operations and their results should be displayed through the console.

Example operations:

```text
1. Add New Book
2. View All Books
3. Search Book By ID
4. Update Book Price
5. Delete Book
6. Check Book Availability
7. Count Total Books
```

## 🚫 Restrictions

* No Spring Boot REST APIs.
* Console output only.
* Use Spring Data JPA.
* Use `JpaRepository`.
* Insert at least 5 books.

## 📚 Learning Outcome

* Understand `JpaRepository`.
* Practice CRUD operations.
* Use built-in repository methods.
* Understand the difference between basic CRUD and JpaRepository capabilities.
* Practice Entity → Repository → Service → MainClass architecture.
* Work with persistent data using MySQL.
