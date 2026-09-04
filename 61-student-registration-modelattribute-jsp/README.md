# Task 61 - Student Registration System

## 📌 Objective

Develop a Spring Boot MVC application to handle student registration details using `@ModelAttribute`.

The application accepts student information from an HTML/JSP form, binds the submitted form data to a Java `Student` object, and displays the registered student details on a response JSP page.

No database is used.

## 📝 Project Definition

The Student Registration System allows users to enter student details through a registration form.

The submitted information is transferred from the JSP form to the Spring MVC controller using `@ModelAttribute`.

The controller then sends the student object to the response JSP page for displaying the submitted details.

## 📦 Student Model

### Student Fields

- `studentId`
- `studentName`
- `course`
- `email`
- `mobileNumber`

## 🛠️ Technologies Used

- Java
- Spring Boot
- Spring MVC
- JSP
- Maven
- HTML
- Apache Tomcat

## 📂 Project Structure

```text
src/main/java
├── controller
│   └── StudentController.java
│
├── model
│   └── Student.java
│
└── SpringBootMvcApplication.java

src/main/webapp
└── WEB-INF
    └── views
        ├── student-form.jsp
        └── student-success.jsp

src/main/resources
└── application.properties