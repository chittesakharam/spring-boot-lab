# Task 17 - Employee Management System using PagingAndSortingRepository

## 📌 Scenario

Develop an Employee Management System using Spring Boot and Spring Data JPA.

Since the company has thousands of employees, displaying all employee records at once is not practical. The application uses pagination to display employees page by page and sorting to arrange employees by salary and name.

## 🎯 Objective

Practice pagination and sorting using `PagingAndSortingRepository`, `PageRequest`, and `Sort`.

## 🛠 Technologies Used

* Java
* Spring Boot
* Spring Data JPA
* PagingAndSortingRepository
* MySQL
* Maven

## 📦 Employee Fields

* employeeId
* employeeName
* department
* salary

## 🏗️ Project Layers

* Employee Entity
* EmployeeRepository
* EmployeeService
* EmployeeServiceImpl
* Main Application / CommandLineRunner

## 📌 Repository

```text
PagingAndSortingRepository<Employee, Integer>
```

## ⚙️ Service Operations

### 1. View Employees with Pagination

Method:

```text
getEmployeesByPage(int pageNumber, int pageSize)
```

Uses:

```text
PageRequest
```

### 2. View Employees Sorted by Salary

Method:

```text
getEmployeesSortedBySalary()
```

Uses:

```text
Sort
```

### 3. View Employees Sorted by Name

Method:

```text
getEmployeesSortedByName()
```

Uses:

```text
Sort
```

## 📄 Main Operations

The application inserts at least 10 employee records and performs:

1. Display Employee Records - Page 1, Size 3
2. Display Employee Records - Page 2, Size 3
3. Display Employees Sorted by Salary
4. Display Employees Sorted by Employee Name

## 🧪 Pagination Test Cases

### Test Case 1

```text
Page Number = 0
Page Size = 3
```

Expected:

```text
101 Rahul IT 45000
102 Priya HR 40000
103 Amit Finance 50000
```

### Test Case 2

```text
Page Number = 1
Page Size = 3
```

Expected:

```text
104 Neha Testing 42000
105 Arjun IT 55000
106 Kavya HR 47000
```

## 💰 Test Case 3 - Sort By Salary

Expected:

```text
Priya 40000
Neha 42000
Rahul 45000
Kavya 47000
Amit 50000
Arjun 55000
```

## 🔤 Test Case 4 - Sort By Employee Name

Expected:

```text
Amit
Arjun
Kavya
Neha
Priya
Rahul
```

## 🔄 Application Flow

```text
CommandLineRunner
       ↓
EmployeeService
       ↓
EmployeeRepository
       ↓
PagingAndSortingRepository
       ↓
MySQL Database
```

## 📚 Learning Outcome

* Understand `PagingAndSortingRepository`.
* Implement pagination using `PageRequest`.
* Implement sorting using `Sort`.
* Display database records page by page.
* Sort employees by salary.
* Sort employees by employee name.
* Understand pagination and sorting in Spring Data JPA.
* Practice Entity → Repository → Service → Runner architecture.
