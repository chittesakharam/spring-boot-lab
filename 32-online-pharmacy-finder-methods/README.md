# Task 32 - Online Pharmacy Management System

## 📌 Scenario

Develop a Spring Boot console-based application to manage medicine records in an online pharmacy.

The application maintains medicine information and allows customers to search medicines using Spring Data JPA Finder Methods.

## 🎯 Objective

Practice Spring Data JPA derived query methods for searching medicines based on category, manufacturer, and stock quantity.

## 🛠 Technologies Used

- Java
- Spring Boot
- Spring Data JPA
- JpaRepository
- MySQL
- Maven
- CommandLineRunner

## 💊 Medicine Entity

### Fields

- medicineId
- medicineName
- category
- manufacturer
- price
- stockQuantity

## 🗄️ Repository

`MedicineRepository`

Uses:

```text
JpaRepository<Medicine, Long>
```

## 🔎 Finder Methods

### 1. Search By Category

```text
findByCategory(String category)
```

Search medicines based on category.

Example categories:

- Antibiotics
- Pain Relief
- Vitamins
- Diabetes Care

### 2. Search By Manufacturer

```text
findByManufacturer(String manufacturer)
```

Search medicines based on manufacturer.

Example manufacturers:

- Sun Pharma
- Cipla
- Dr. Reddy's
- Lupin

### 3. Search By Stock Quantity Greater Than

```text
findByStockQuantityGreaterThan(Integer quantity)
```

Display medicines whose stock quantity is greater than the specified quantity.

## ⚙️ Operations

### 1. Add Medicine

Add a new medicine with:

- Medicine Name
- Category
- Manufacturer
- Price
- Stock Quantity

### 2. View All Medicines

Display complete medicine details.

### 3. Search By Category

Search medicines using category.

Example:

```text
Category = Antibiotics
```

### 4. Search By Manufacturer

Search medicines using manufacturer.

Example:

```text
Manufacturer = Cipla
```

### 5. Search By Stock Quantity

Display medicines having stock greater than a specified quantity.

Example:

```text
Stock Quantity > 100
```

### 6. Delete Medicine

Remove a medicine using Medicine ID.

## 📋 CRUD & Finder Operations

| Operation | JPA Method |
|---|---|
| Add Medicine | `save()` |
| View All Medicines | `findAll()` |
| Search By Category | `findByCategory()` |
| Search By Manufacturer | `findByManufacturer()` |
| Stock Greater Than | `findByStockQuantityGreaterThan()` |
| Delete Medicine | `deleteById()` |

## 🏗️ Application Flow

```text
CommandLineRunner
       ↓
MedicineService
       ↓
MedicineRepository
       ↓
JpaRepository
       ↓
MySQL Database
```

## 📚 Learning Outcome

- Understand Spring Data JPA Finder Methods.
- Practice `findByCategory()`.
- Practice `findByManufacturer()`.
- Practice `GreaterThan` queries.
- Perform CRUD operations using `JpaRepository`.
- Search database records without writing SQL queries.
- Understand Entity → Repository → Service → Runner architecture.
- Work with Spring Data JPA and MySQL.