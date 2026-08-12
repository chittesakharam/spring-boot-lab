# Task 15 - Feedback Acknowledgement System

## 📌 Scenario

Develop a Spring Boot application that receives customer feedback and sends an acknowledgment email to the customer.

## 🎯 Objective

Create a simple Spring Boot application that accepts feedback details, displays the feedback information, and sends an acknowledgment email.

## 📖 Concepts Covered

- Spring Boot
- Model Class
- Object Creation
- CommandLineRunner
- User Input
- Service-based Email Notification
- Dependency Injection
- Email Content Generation

## 🛠 Technologies Used

- Java
- Spring Boot
- Maven

## 📦 Components

### Model

`Feedback`

### Feedback Fields

- id
- customerName
- email
- message

### Runner

The Runner is responsible for:

- Accepting feedback details from the user
- Displaying feedback information
- Sending acknowledgment email

## 🔄 Application Flow

```text
Customer Input
      ↓
Create Feedback
      ↓
Display Feedback Information
      ↓
Generate Acknowledgment Email
      ↓
Send Email
```

## 📧 Email Details

### Subject

```text
Feedback Received Successfully
```

### Email Body

```text
Dear <Customer Name>,

Thank you for your valuable feedback.

We have successfully received your feedback and appreciate you taking the time to share your thoughts with us.

Our team will review your feedback carefully.

Thank you for helping us improve our services.

Best Regards,
Customer Support Team
```

## 🚀 Requirements

- Create a `Feedback` model class.
- Store customer name, email, and feedback message.
- Accept feedback details from the user.
- Display the received feedback.
- Send an acknowledgment email.
- Display the email notification status.

## 📚 Learning Outcome

- Practice creating model classes.
- Accept user input using CommandLineRunner.
- Pass objects between application components.
- Generate dynamic email content using customer information.
- Understand a basic feedback-to-notification workflow.