# Task 09 - Student Database Profile Loader

## 📌 Scenario

Load different database service implementations depending on the active Spring Boot profile.

## 🎯 Objective

Understand how Spring Profiles can be used to load different database service implementations based on the active profile.

## 📖 Concepts Covered

- @Profile
- @Value
- Interface-based Dependency Injection
- Profile-specific Property Files
- CommandLineRunner
- Conditional Bean Creation

## 🛠 Technologies Used

- Java
- Spring Boot
- Maven

## 📦 Classes

- StudentDatabaseService
- MySQLDatabaseService
- OracleDatabaseService
- DatabaseRunner

## 🔧 Variables

- databaseUrl
- username
- databaseName

## ⚙️ Methods

- connectDatabase()
- displayDatabaseInfo()

## 🗄️ Database Profiles

### MySQL Profile

Loads the `MySQLDatabaseService` implementation when the MySQL profile is active.

### Oracle Profile

Loads the `OracleDatabaseService` implementation when the Oracle profile is active.

## 📄 Profile-Based Configuration

Separate property files are used for different database profiles.

### MySQL

Contains configuration for:

- Database URL
- Username
- Database name

### Oracle

Contains configuration for:

- Database URL
- Username
- Database name

## 🚀 Features

- Load MySQL database service using `@Profile`.
- Load Oracle database service using `@Profile`.
- Inject database configuration using `@Value`.
- Inject the active database service into `DatabaseRunner`.
- Display database information.
- Simulate database connection based on the active profile.

## 📚 Learning Outcome

- Understand Spring Boot Profiles.
- Use separate property files for different environments.
- Understand conditional bean creation using `@Profile`.
- Inject configuration values using `@Value`.
- Practice interface-based dependency injection.
- Understand how Spring selects an implementation based on the active profile.