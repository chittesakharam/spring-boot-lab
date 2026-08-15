# Task 18 - Hospital Patient Management System Using Paging

## 📌 Scenario

A multi-specialty hospital stores thousands of patient records. The receptionist needs to view patient details page by page instead of loading all records at once.

## 🎯 Objective

Develop a Spring Boot application that demonstrates pagination using `PagingAndSortingRepository`.

## 🛠 Technologies Used

* Java
* Spring Boot
* Spring Data JPA
* PagingAndSortingRepository
* MySQL
* Maven

## 👤 Patient Entity

### Fields

* patientId
* patientName
* disease
* age

## 📦 Classes

* Patient
* PatientRepository
* PatientService
* PatientServiceImpl
* AppConfig
* MainClass

## 🗄️ Repository

`PatientRepository` extends:

```text
PagingAndSortingRepository<Patient, Integer>
```

## ⚙️ Requirements

* Create the Patient entity.
* Create PatientRepository using `PagingAndSortingRepository`.
* Insert at least 15 patient records.
* Accept page number and page size.
* Display patient records page-wise.
* Display current page.
* Display total pages.
* Display total records.

## 📄 Pagination Information

For each requested page, display:

```text
Current Page
Total Pages
Total Records
Patient Records
```

## 🧪 Expected Operations

### View Page 1

Display the first set of patient records.

### View Page 2

Display the second set of patient records.

### View Page 3

Display the third set of patient records.

## 🔄 Application Flow

```text
MainClass
    ↓
PatientService
    ↓
PatientServiceImpl
    ↓
PatientRepository
    ↓
PagingAndSortingRepository
    ↓
MySQL Database
```

## 📚 Learning Outcome

* Understand pagination in Spring Data JPA.
* Use `PagingAndSortingRepository`.
* Practice page number and page size.
* Retrieve records page by page.
* Understand `Page` information such as current page, total pages, and total records.
* Avoid loading thousands of database records at once.
* Practice Entity → Repository → Service → Runner architecture.
