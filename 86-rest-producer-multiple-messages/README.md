# REST Producer with Different Messages

## 🎯 Objective

Create a Spring Boot REST Producer application that exposes two simple REST endpoints and returns different messages.

A separate REST Consumer application will call both endpoints.

## 🛠️ Technologies

- Java
- Spring Boot
- Spring Web
- REST API
- Maven

## 📌 Requirements

Create a REST Producer application with two endpoints.

| URL | Method | Response |
|---|---|---|
| `/producer/hello` | GET | Hello from Producer |
| `/producer/welcome` | GET | Welcome to Spring Boot REST |

## 🔗 Producer Endpoint 1

```text
GET /producer/hello