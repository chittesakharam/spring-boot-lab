# Library Management System – Spring Boot Security

## 🎯 Objective

Develop a **Library Management System** using **Spring Boot Security** with role-based access control.

The application has two roles:

- **ADMIN** – Can add, update, delete, and view books.
- **USER** – Can view books only.

---

## 🛠️ Technologies

- Java
- Spring Boot
- Spring Security
- Spring MVC
- Maven
- Spring Boot Starter Web
- Spring Boot Starter Security

---

## 👥 User Roles

| Username | Password | Role |
|----------|----------|------|
| admin | admin123 | ADMIN |
| user | user123 | USER |

---

## 📚 Book Management

### ADMIN Permissions

- View books
- Add books
- Update books
- Delete books

### USER Permissions

- View books
- Cannot add books
- Cannot update books
- Cannot delete books

---

## 📌 Required Classes

- `BookController`
- `SecurityConfig`
- `UserConfig` or `InMemoryUserDetailsManager`
- `SpringBootApplication`

---

## 🔗 Endpoints

| URL | Method | Required Role |
|-----|--------|---------------|
| `/books` | GET | USER, ADMIN |
| `/books/add` | POST | ADMIN |
| `/books/update` | PUT | ADMIN |
| `/books/delete` | DELETE | ADMIN |

---

## 🔐 Security Configuration Requirements

Configure role-based authorization using:

- `.hasRole("ADMIN")`
- `.hasAnyRole("USER", "ADMIN")`

The `/books` endpoint must be accessible to both USER and ADMIN.

Book modification operations must be restricted to ADMIN.

---

## 🔄 Application Flow

### Login as USER

1. Login using `user / user123`.
2. Access `/books`.
3. Books list is displayed.
4. Attempt to add, update, or delete a book.
5. Application returns **403 Access Denied**.

### Login as ADMIN

1. Login using `admin / admin123`.
2. Access `/books`.
3. Books list is displayed.
4. Add a book successfully.
5. Update and delete books successfully.

---

## ✅ Expected Output

### USER

**GET `/books`**

```text
Books List