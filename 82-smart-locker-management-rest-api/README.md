# Smart Locker Management System – CRUD REST API

## 🎯 Objective

Create a Spring Boot REST API application to manage smart lockers using complete CRUD operations.

Also implement `@PatchMapping` for partial updates.

---

## 🛠️ Technologies

- Java
- Spring Boot
- Spring Web
- Spring Data JPA
- MySQL
- Maven
- Postman

---

## 📦 Entity: SmartLocker

The SmartLocker entity contains the following fields:

| Field | Data Type |
|---|---|
| lockerId | Long |
| lockerCode | String |
| location | String |
| lockerSize | String |
| isAvailable | Boolean |
| hourlyRate | Double |

---

## 🔗 REST API Endpoints

| URL | Method | Description |
|---|---|---|
| `/lockers` | POST | Create Locker |
| `/lockers` | GET | Get All Lockers |
| `/lockers/{id}` | GET | Get Locker By ID |
| `/lockers/{id}` | PUT | Update Complete Locker |
| `/lockers/{id}` | PATCH | Partial Update Locker |
| `/lockers/{id}` | DELETE | Delete Locker |

---

## 📌 Required Classes

### Entity

```text
SmartLocker.java