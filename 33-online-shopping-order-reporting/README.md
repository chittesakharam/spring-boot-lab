# Task 33 - Online Shopping Order Reporting System

## 📌 Scenario

Develop a Spring Boot console-based application to manage customer order records.

Use Spring Data JPA and the `@Query` annotation to generate custom reports and retrieve orders based on different conditions.

## 🎯 Objective

Practice custom JPQL queries using `@Query` for category-based, payment-mode-based, and amount-based order reports.

## 🛠 Technologies Used

- Java
- Spring Boot
- Spring Data JPA
- JpaRepository
- JPQL
- @Query
- MySQL
- Maven
- CommandLineRunner

## 🛒 Order Entity

### Fields

- orderId
- customerName
- productName
- category
- totalAmount
- paymentMode
- orderStatus

## 🗄️ Repository

`OrderRepository`

Uses:

```text
JpaRepository<Order, Long>
```

## 🔎 Custom @Query Operations

### 1. Display Orders By Category

Use `@Query` to find orders based on category.

Example categories:

- Electronics
- Fashion
- Grocery
- Home Appliances
- Books

### 2. Display Orders By Payment Mode

Use `@Query` to find orders based on payment mode.

Example payment modes:

- UPI
- Credit Card
- Debit Card
- Net Banking
- Cash on Delivery

### 3. Find Orders Above Given Amount

Use `@Query` to find orders where the total amount is greater than the specified amount.

Example:

```text
Total Amount > 5000
```

## ⚙️ Operations

### 1. Add Order

Add a new order with:

- Customer Name
- Product Name
- Category
- Total Amount
- Payment Mode
- Order Status

### 2. View All Orders

Display complete order details.

### 3. Display Orders By Category

Generate a report of orders belonging to a selected category.

### 4. Display Orders By Payment Mode

Generate a report of orders made using a selected payment mode.

### 5. Find Orders Above Given Amount

Display orders whose total amount is greater than the specified amount.

### 6. Delete Order

Delete an order using Order ID.

## 📋 Operations Summary

| Operation | Method / Concept |
|---|---|
| Add Order | `save()` |
| View All Orders | `findAll()` |
| Orders By Category | `@Query` |
| Orders By Payment Mode | `@Query` |
| Orders Above Amount | `@Query` |
| Delete Order | `deleteById()` |

## 🏗️ Application Flow

```text
CommandLineRunner
       ↓
OrderService
       ↓
OrderRepository
       ↓
JpaRepository
       ↓
@Query / JPQL
       ↓
MySQL Database
```

## 📚 Learning Outcome

- Understand the `@Query` annotation.
- Write custom JPQL queries.
- Use named parameters with `@Param`.
- Generate category-based reports.
- Generate payment-mode-based reports.
- Perform amount-based filtering.
- Practice CRUD operations using `JpaRepository`.
- Understand Entity → Repository → Service → Runner architecture.
- Work with Spring Data JPA and MySQL.