# Task 27 - Online Pharmacy Inventory System

## 📌 Scenario

Develop a Spring Boot application using Spring Data JPA to manage medicine inventory and perform searches using `Or` and `Between` Finder Methods.

## 🎯 Objective

Practice Spring Data JPA derived query methods using `Or` and `Between` conditions without writing SQL queries.

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
- expiryDate
- rating

## 🗄️ Repository

`MedicineRepository`

Uses:

```text
JpaRepository<Medicine, Long>
```

## 🔎 Finder Methods

### 1. Category OR Manufacturer

```text
findByCategoryOrManufacturer(String category, String manufacturer)
```

### 2. Price Between

```text
findByPriceBetween(Double minPrice, Double maxPrice)
```

### 3. Stock Quantity Between

```text
findByStockQuantityBetween(Integer minStock, Integer maxStock)
```

### 4. Medicine Name OR Category

```text
findByMedicineNameOrCategory(String medicineName, String category)
```

### 5. Expiry Date Between

```text
findByExpiryDateBetween(LocalDate startDate, LocalDate endDate)
```

### 6. Rating Between

```text
findByRatingBetween(Double minRating, Double maxRating)
```

### 7. Manufacturer OR Category

```text
findByManufacturerOrCategory(String manufacturer, String category)
```

### 8. Medicine ID Between

```text
findByMedicineIdBetween(Long startId, Long endId)
```

## 📦 Sample Data

Insert at least 10 medicine records into the database.

Medicine IDs should cover:

```text
201 - 210
```

Sample data should contain different:

- Medicine names
- Categories
- Manufacturers
- Prices
- Stock quantities
- Expiry dates
- Ratings

## ⚙️ CommandLineRunner Operations

### Operation 1

Find medicines where:

```text
Category = Antibiotic
OR
Manufacturer = ABC Pharma
```

### Operation 2

Find medicines where price is between:

```text
100 - 500
```

### Operation 3

Find medicines where stock quantity is between:

```text
50 - 200
```

### Operation 4

Find medicines where:

```text
Medicine Name = Paracetamol
OR
Category = Pain Relief
```

### Operation 5

Find medicines where expiry date is between:

```text
2026-06-01 - 2026-12-31
```

### Operation 6

Find medicines where rating is between:

```text
4.0 - 5.0
```

### Operation 7

Find medicines where:

```text
Manufacturer = HealthCare Ltd
OR
Category = Vitamin
```

### Operation 8

Find medicines where medicine ID is between:

```text
201 - 210
```

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
- Practice `Or` conditions.
- Practice `Between` conditions.
- Work with `LocalDate` in JPA queries.
- Perform price and stock range searches.
- Perform expiry date range searches.
- Perform rating range searches.
- Practice Entity → Repository → Service → Runner architecture.
- Work with Spring Data JPA and MySQL.