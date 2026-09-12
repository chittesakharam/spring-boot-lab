# Movie Review Management System – CRUD REST API

## 🎯 Objective

Develop a Spring Boot REST application to manage movie reviews.

Implement complete **CRUD operations** and test all REST APIs using Postman.

---

## 🛠️ Technologies

- Java
- Spring Boot
- Spring Web
- Spring Data JPA
- REST API
- Maven
- Database
- Postman

---

## 🎬 Entity: MovieReview

The MovieReview entity contains the following fields:

| Field | Data Type |
|-------|-----------|
| reviewId | Long |
| movieName | String |
| reviewerName | String |
| rating | Double |
| reviewComment | String |

---

## 🔗 REST API Endpoints

| URL | Method | Description |
|-----|--------|-------------|
| `/reviews` | POST | Add Movie Review |
| `/reviews` | GET | Get All Reviews |
| `/reviews/{id}` | GET | Get Review By ID |
| `/reviews/{id}` | PUT | Update Review |
| `/reviews/{id}` | DELETE | Delete Review |

---

## 📌 Required Classes / Interfaces

### Entity

```text
MovieReview