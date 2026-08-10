# Task 07 - Notification Service Profile

## 📌 Scenario

Load different notification services based on the active Spring Boot profile.

## 🎯 Objective

Understand how Spring Profiles can be used to load different notification service implementations based on the active profile.

## 📖 Concepts Covered

- @Profile
- @Value
- Spring Profiles
- Interface-based Dependency Injection
- CommandLineRunner
- Separate Profile-specific Property Files

## 🛠 Technologies Used

- Java
- Spring Boot
- Maven

## 📦 Classes

- NotificationService
- EmailNotification
- SmsNotification
- NotificationRunner

## 🔧 Configuration

The application uses separate property files for different notification profiles.

### Email Profile

Profile:

```text
email
```

Properties:

- senderName
- supportEmail
- notificationType

### SMS Profile

Profile:

```text
sms
```

Properties:

- senderName
- supportEmail
- notificationType

## 🚀 Features

- Load Email Notification using the `email` profile.
- Load SMS Notification using the `sms` profile.
- Inject configuration values using `@Value`.
- Use `@Profile` for conditional bean creation.
- Display notification information.
- Send notification based on the active profile.

## 📚 Learning Outcome

- Understand Spring Boot Profiles.
- Use separate property files for different environments/services.
- Understand conditional bean creation using `@Profile`.
- Inject property values using `@Value`.
- Practice interface-based dependency injection.