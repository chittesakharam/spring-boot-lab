# Task 24 - E-Commerce Product Catalog System

## 📌 Scenario

Develop a Spring Boot console-based E-Commerce Product Catalog System using `PagingAndSortingRepository`.

The application manages product information and supports pagination, sorting, and product search.

## 🎯 Objective

Practice pagination and sorting using Spring Data JPA with an e-commerce product catalog.

## 🛠 Technologies Used

- Java
- Spring Boot
- Spring Data JPA
- PagingAndSortingRepository
- MySQL
- Maven

## 🛍️ Product Fields

- productId
- productName
- category
- brand
- price
- stockQuantity

## 🗄️ Repository

`ProductRepository`

Uses:

```text
PagingAndSortingRepository<Product, Integer>
```

## ⚙️ Operations

### 1. Add New Products

Add product records to the catalog and store them in the database.

### 2. Display Products Page-Wise

Display products using pagination.

Page size:

```text
5 records per page
```

### 3. Sort Products By Price

Display products sorted by price:

- Price Ascending
- Price Descending

Sorting should also support pagination.

### 4. Search Product By ID

Search and display product details using Product ID.

## 📄 Pagination

The application should display 5 products per page.

Example:

```text
Page 1 → Products 1-5
Page 2 → Products 6-10
Page 3 → Products 11-15
```

## 💰 Price Sorting

### Ascending

Display products from lowest price to highest price.

### Descending

Display products from highest price to lowest price.

## 🏗️ Application Flow

```text
CommandLineRunner
       ↓
ProductService
       ↓
ProductRepository
       ↓
PagingAndSortingRepository
       ↓
MySQL Database
```

## 📋 Main Operations

```text
1. Add Products
2. Display Products Page-Wise
3. Sort By Price - Ascending
4. Sort By Price - Descending
5. Search Product By ID
6. Exit
```

## 📚 Learning Outcome

- Understand `PagingAndSortingRepository`.
- Implement pagination using `PageRequest`.
- Implement sorting using `Sort`.
- Combine sorting with pagination.
- Search products by ID.
- Practice Entity → Repository → Service → Runner architecture.
- Work with Spring Data JPA and MySQL.