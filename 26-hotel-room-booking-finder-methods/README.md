# Task 26 - Hotel Room Booking Management System

## 📌 Scenario

Develop a Spring Boot application using Spring Data JPA to manage hotel room bookings and perform database searches using `Or` and `Between` Finder Methods.

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

## 🏨 Booking Entity

### Fields

- bookingId
- guestName
- roomType
- city
- bookingAmount
- numberOfDays
- bookingDate
- bookingStatus

## 🗄️ Repository

`BookingRepository`

Uses:

```text
JpaRepository<Booking, Long>
```

## 🔎 Finder Methods

### 1. City OR Room Type

```text
findByCityOrRoomType(String city, String roomType)
```

### 2. Booking Amount Between

```text
findByBookingAmountBetween(Double minAmount, Double maxAmount)
```

### 3. Number of Days Between

```text
findByNumberOfDaysBetween(Integer minDays, Integer maxDays)
```

### 4. Booking Status OR City

```text
findByBookingStatusOrCity(String status, String city)
```

### 5. Booking Date Between

```text
findByBookingDateBetween(LocalDate startDate, LocalDate endDate)
```

### 6. Guest Name OR Booking Status

```text
findByGuestNameOrBookingStatus(String guestName, String status)
```

### 7. Room Type OR Booking Status

```text
findByRoomTypeOrBookingStatus(String roomType, String status)
```

### 8. Booking ID Between

```text
findByBookingIdBetween(Long startId, Long endId)
```

## 📦 Sample Data

Insert at least 10 booking records into the database.

Booking IDs should cover:

```text
101 - 110
```

Sample data should include different:

- Guest names
- Room types
- Cities
- Booking amounts
- Number of days
- Booking dates
- Booking statuses

## ⚙️ CommandLineRunner Operations

### Operation 1

Find bookings where:

```text
City = Chennai
OR
Room Type = Suite
```

### Operation 2

Find bookings where booking amount is between:

```text
5000 - 15000
```

### Operation 3

Find bookings where number of days is between:

```text
2 - 5
```

### Operation 4

Find bookings where:

```text
Booking Status = Confirmed
OR
City = Hyderabad
```

### Operation 5

Find bookings where booking date is between:

```text
2026-01-01 - 2026-03-31
```

### Operation 6

Find bookings where:

```text
Guest Name = Anita
OR
Booking Status = Cancelled
```

### Operation 7

Find bookings where:

```text
Room Type = Deluxe
OR
Booking Status = Pending
```

### Operation 8

Find bookings where booking ID is between:

```text
101 - 110
```

## 🏗️ Application Flow

```text
CommandLineRunner
       ↓
BookingService
       ↓
BookingRepository
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
- Perform range-based searches.
- Perform multiple-condition searches without SQL.
- Practice Entity → Repository → Service → Runner architecture.
- Work with Spring Data JPA and MySQL.