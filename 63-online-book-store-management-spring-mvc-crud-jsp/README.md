# Task 63 - Online Book Store Management System

## 📌 Objective

Develop a complete Spring Boot MVC CRUD web application for managing books
using Spring Boot MVC, Spring Data JPA, Hibernate, MySQL, JSP, JSTL, and Bootstrap.

The application supports adding, viewing, updating, deleting, searching, and
paginating book records.

No REST API is used. This is a traditional Spring MVC web application.

## 📝 Project Definition

The Online Book Store Management System allows administrators to manage book
inventory through a JSP-based web interface.

Administrators can:

- Add new books
- View all books
- Update existing books
- Delete books
- Search books
- Navigate books using pagination
- Validate book information
- Handle book-not-found exceptions

## 🛠️ Technologies Used

- Java
- Spring Boot
- Spring MVC
- Spring Data JPA
- Hibernate
- MySQL
- JSP
- JSTL
- Bootstrap
- Maven
- Bean Validation
- Apache Tomcat

## 🗃️ Database

Database Name:

`book_store_db`

Table Name:

`book`

### Book Table Columns

| Column | Description |
|---|---|
| id | Primary Key, Auto Increment |
| title | Book title |
| author | Author name |
| category | Book category |
| price | Book price |
| publisher | Publisher name |
| published_date | Published date |
| stock_quantity | Available stock |

The table is managed automatically using JPA/Hibernate.

## 📦 Entity

### Book

Fields:

- `id`
- `title`
- `author`
- `category`
- `price`
- `publisher`
- `publishedDate`
- `stockQuantity`

## 📂 Project Structure

```text
src/main/java
│
├── controller
│   └── BookController.java
│
├── entity
│   └── Book.java
│
├── repository
│   └── BookRepository.java
│
├── service
│   ├── BookService.java
│   └── BookServiceImpl.java
│
├── exception
│   └── BookNotFoundException.java
│
└── SpringBootMvcApplication.java
│
src/main/webapp
│
└── WEB-INF
    └── views
        ├── book-form.jsp
        └── book-list.jsp
│
src/main/resources
└── application.properties