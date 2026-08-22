# Task 37 - Digital Library Cover Image Management System using BLOB

## 📌 Scenario

Develop a Spring Boot application for a Digital Library where each book has a cover image. Since images are binary data, store them using BLOB.

## 🎯 Objective

Practice storing and retrieving image data using JPA `@Lob` and BLOB storage.

## 🛠 Technologies Used

- Java
- Spring Boot
- Spring Data JPA
- JpaRepository
- Hibernate
- MySQL
- Maven
- CommandLineRunner
- BLOB
- Java File Handling

## 📚 LibraryBook Entity

### Fields

- bookId
- bookTitle
- authorName
- coverImage

### BLOB Field

```text
@Lob
@Column(columnDefinition = "BLOB")
private byte[] coverImage;