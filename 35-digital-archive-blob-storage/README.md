# Task 35 - Digital Archive System using BLOB Storage

## 📌 Scenario

Develop a Spring Boot application for a Digital Archive System that stores scanned certificates as binary data in the database.

The application uses JPA `@Lob` to store binary files as BLOB data.

## 🎯 Objective

Practice storing, retrieving, updating, and deleting binary files using Spring Data JPA and `@Lob`.

## 🛠 Technologies Used

- Java
- Spring Boot
- Spring Data JPA
- JpaRepository
- Hibernate
- MySQL
- Maven
- CommandLineRunner
- Java File I/O

## 📄 ArchiveDocument Entity

### Fields

- documentId
- documentTitle
- ownerName
- fileType
- documentData

### BLOB Field

```text
byte[] documentData