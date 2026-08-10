# Task 08 - Vehicle Engine Profile System

## 📌 Scenario

Load different engine implementations depending on the active Spring Boot profile.

## 🎯 Objective

Understand how Spring Profiles can be used to load different engine implementations and inject the appropriate engine object into a vehicle.

## 📖 Concepts Covered

- @Profile
- @Value
- @Component
- Dependency Injection
- Interface-based Dependency Injection
- CommandLineRunner
- Profile-based Bean Selection

## 🛠 Technologies Used

- Java
- Spring Boot
- Maven

## 📦 Classes

- Engine
- DieselEngine
- PetrolEngine
- Vehicle

## 🔧 Variables

- enginePower
- mileage
- companyName

## ⚙️ Methods

- startEngine()
- showEngineDetails()

## 🚗 Engine Profiles

### Diesel Profile

Loads the `DieselEngine` implementation when the Diesel profile is active.

### Petrol Profile

Loads the `PetrolEngine` implementation when the Petrol profile is active.

## 🚀 Features

- Load different engine implementations using `@Profile`.
- Inject the selected engine into the Vehicle class.
- Inject configuration values using `@Value`.
- Display engine information.
- Start the engine based on the active profile.

## 📚 Learning Outcome

- Understand profile-based bean creation.
- Use `@Profile` for conditional bean registration.
- Practice interface-based dependency injection.
- Inject configuration values using `@Value`.
- Understand how Spring selects an implementation based on the active profile.