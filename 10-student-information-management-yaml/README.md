# Program 1 - Student Information Management System

## 📌 Scenario

Create a Spring Boot application to manage student information using `@ConfigurationProperties` and `application.yml`.

The application demonstrates bulk injection of student properties along with `List` and `Map` values.

## 🎯 Objective

Learn how to bind hierarchical YAML configuration to a Java object using `@ConfigurationProperties`.

## 📖 Concepts Covered

- @ConfigurationProperties
- @Component
- application.yml
- Bulk Property Injection
- List Injection
- Map Injection
- CommandLineRunner
- Dependency Injection

## 🛠 Technologies Used

- Java
- Spring Boot
- Maven
- YAML

## 📦 Classes

- Student
- StudentRunner

## 🔧 Student Properties

- id
- name
- course
- fee
- institute
- subjects
- marks

## 📄 application.yml

```yaml
student:
  id: 101
  name: Ramesh
  course: Java
  fee: 45000
  institute: NareshIT
  subjects:
    - Core Java
    - Advanced Java
    - Spring Boot
  marks:
    Java: 90
    Spring: 85
    SQL: 80
```

## 🚀 Requirements

- Use `@ConfigurationProperties`
- Use `@Component`
- Use `application.yml`
- Use bulk injection
- Inject List values
- Inject Map values
- Use `CommandLineRunner`
- Display student details in the console

## 📤 Expected Output

```text
Student Details
------------------------
Id          : 101
Name        : Ramesh
Course      : Java
Fee         : 45000
Institute   : NareshIT
Subjects    : [Core Java, Advanced Java, Spring Boot]
Marks       : {Java=90, Spring=85, SQL=80}
```

## 📚 Learning Outcome

- Understand YAML-based configuration in Spring Boot.
- Bind hierarchical properties using `@ConfigurationProperties`.
- Perform bulk injection of multiple properties.
- Inject `List` and `Map` values.
- Display configuration data using `CommandLineRunner`.