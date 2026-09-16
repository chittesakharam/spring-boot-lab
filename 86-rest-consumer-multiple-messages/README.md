# REST Consumer with Multiple Producer Messages

## 🎯 Objective

Create a Spring Boot REST Consumer application that calls two REST Producer endpoints using `RestTemplate`.

The Consumer should receive both messages and print them in the console.

## 🛠️ Technologies

- Java
- Spring Boot
- Spring Web
- REST API
- RestTemplate
- Maven

## 📌 Requirements

The Consumer should call the following Producer APIs:

```text
http://localhost:8081/producer/hello