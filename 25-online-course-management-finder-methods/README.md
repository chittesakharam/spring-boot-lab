# Task 25 - Online Course Management System Using JPA Finder Methods

## 📌 Scenario

Develop a Spring Boot application using Spring Data JPA and `JpaRepository` Finder Methods to manage online course details.

The application allows students to search courses using different criteria without writing SQL queries.

## 🎯 Objective

Practice Spring Data JPA derived query methods for searching course records based on category, instructor, price, duration, rating, language, and course title.

## 🛠 Technologies Used

- Java
- Spring Boot
- Spring Data JPA
- JpaRepository
- MySQL
- Maven
- CommandLineRunner

## 📚 Course Entity

### Fields

- courseId
- courseTitle
- category
- instructorName
- price
- durationInHours
- rating
- language

## 🗄️ Repository

`CourseRepository`

Uses:

```text
JpaRepository<Course, Long>
```

## 🔎 Finder Methods

The application implements the following 8 JPA Finder Methods:

### 1. Find By Category

```text
findByCategory(String category)
```

### 2. Find By Instructor

```text
findByInstructorName(String instructorName)
```

### 3. Find Courses With Price Less Than

```text
findByPriceLessThan(Double price)
```

### 4. Find Courses With Price Greater Than

```text
findByPriceGreaterThan(Double price)
```

### 5. Find Courses With Duration Greater Than

```text
findByDurationInHoursGreaterThan(Integer hours)
```

### 6. Find Courses With Rating Greater Than or Equal To

```text
findByRatingGreaterThanEqual(Double rating)
```

### 7. Find By Language

```text
findByLanguage(String language)
```

### 8. Find Courses By Title Keyword

```text
findByCourseTitleContaining(String keyword)
```

## 📦 Sample Data

Insert at least 10 course records into the database.

Sample course data should cover:

- Java
- Spring
- Spring Boot
- SQL
- Web Development
- Different instructors
- Different prices
- Different durations
- Different ratings
- Different languages

## ⚙️ Service Layer

Create a service class to call all repository finder methods.

The service should provide methods for:

- Category search
- Instructor search
- Price filtering
- Duration filtering
- Rating filtering
- Language search
- Course title keyword search

## 🖥️ CommandLineRunner Operations

### Operation 1

Display all courses in the **Java** category.

```text
findByCategory("Java")
```

### Operation 2

Display all courses taught by **Rahul Sharma**.

```text
findByInstructorName("Rahul Sharma")
```

### Operation 3

Display all courses with price **less than 2000**.

```text
findByPriceLessThan(2000)
```

### Operation 4

Display all courses with price **greater than 5000**.

```text
findByPriceGreaterThan(5000)
```

### Operation 5

Display all courses having duration **greater than 40 hours**.

```text
findByDurationInHoursGreaterThan(40)
```

### Operation 6

Display all courses having rating **greater than or equal to 4.5**.

```text
findByRatingGreaterThanEqual(4.5)
```

### Operation 7

Display all courses available in **English** language.

```text
findByLanguage("English")
```

### Operation 8

Display all courses whose title contains **"Spring"**.

```text
findByCourseTitleContaining("Spring")
```

## 🏗️ Application Flow

```text
CommandLineRunner
       ↓
CourseService
       ↓
CourseRepository
       ↓
JpaRepository
       ↓
MySQL Database
```

## 📚 Learning Outcome

- Understand Spring Data JPA Finder Methods.
- Create derived query methods without writing SQL.
- Practice `findBy` naming conventions.
- Use comparison keywords such as `LessThan`, `GreaterThan`, and `GreaterThanEqual`.
- Use `Containing` for keyword-based searching.
- Practice Entity → Repository → Service → Runner architecture.
- Work with Spring Data JPA and MySQL.