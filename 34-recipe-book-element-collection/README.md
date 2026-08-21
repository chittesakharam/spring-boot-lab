# Task 34 - Online Recipe Management System using @ElementCollection

## 📌 Scenario

Develop a Spring Boot application for an Online Recipe Management System where each recipe can have multiple ingredients and preparation tips.

Since ingredients and cooking tips are simple value types, store them using `@ElementCollection`.

## 🎯 Objective

Practice `@ElementCollection` with Spring Data JPA for storing collections of simple values.

## 🛠 Technologies Used

- Java
- Spring Boot
- Spring Data JPA
- JpaRepository
- Hibernate
- MySQL
- Maven
- CommandLineRunner

## 🍳 RecipeBook Entity

### Fields

- recipeId
- recipeName
- cuisine
- ingredients
- cookingTips

### Collection Fields

```text
List<String> ingredients
Set<String> cookingTips