# Task 31 - E-Commerce Order Tracking System

## 📌 Scenario

Develop a Spring Boot console-based application to manage customer orders.

The application automatically records the creation and modification timestamp of every order and maintains complete order details.

## 🎯 Objective

Practice Spring Data JPA CRUD operations with automatic timestamping using `@CreationTimestamp` and `@UpdateTimestamp`.

## 🛠 Technologies Used

- Java
- Spring Boot
- Spring Data JPA
- JpaRepository
- MySQL
- Maven
- CommandLineRunner
- Hibernate

## 🛒 Order Entity

### Fields

- orderId
- customerName
- productName
- quantity
- totalAmount
- orderStatus
- createdAt
- updatedAt

### Timestamp Fields

```text
@CreationTimestamp
createdAt

@UpdateTimestamp
updatedAt
```

## 🗄️ Repository

`OrderRepository`

Uses:

```text
JpaRepository<Order, Long>
```

## ⚙️ Operations

### 1. Add New Order

Add a new customer order to the database.

The creation timestamp should be automatically generated.

### 2. View All Orders

Display all orders along with:

- Order ID
- Customer Name
- Product Name
- Quantity
- Total Amount
- Order Status
- Created Date & Time
- Last Modified Date & Time

### 3. Update Order Status

Update the status of an existing order.

The modification timestamp should automatically change when the order is updated.

### 4. Delete Order

Delete an order from the database.

### 5. Display Order Timestamps

Display both:

```text
Created Date & Time
Last Modified Date & Time
```

for each order.

## 🕒 Timestamping

### Creation Timestamp

```text
@CreationTimestamp
createdAt
```

Automatically stores the date and time when the order is created.

### Modification Timestamp

```text
@UpdateTimestamp
updatedAt
```

Automatically updates the date and time whenever the order is modified.

## 📋 CRUD Operations

| Operation | JPA Method |
|---|---|
| Add Order | `save()` |
| View All Orders | `findAll()` |
| Update Order | `save()` |
| Delete Order | `deleteById()` |
| Search Order | `findById()` |

## 💬 Success / Failure Messages

The application should display appropriate messages for every operation.

Example:

```text
Order added successfully.
Orders retrieved successfully.
Order status updated successfully.
Order deleted successfully.
Order not found.
Order update failed.
```

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
MySQL Database
```

## 📚 Learning Outcome

- Understand automatic timestamping in Spring Data JPA.
- Use `@CreationTimestamp`.
- Use `@UpdateTimestamp`.
- Practice CRUD operations using `JpaRepository`.
- Track order creation and modification times.
- Understand Entity → Repository → Service → Runner architecture.
- Practice success and failure handling in console applications.