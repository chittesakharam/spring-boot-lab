# Task 60 - Employee Skill Tracker

## 📌 Objective

Build an Employee Skill Tracker application using Spring Boot MVC, JSP, JSTL, Spring Data JPA, and MySQL.

The HR department can:

- Add a new employee with their primary skill.
- Store employee details in MySQL.
- Retrieve all registered employees.
- Display employee records in a JSP table using JSTL.

Thymeleaf is NOT used.

## 📝 Scenario

A software company wants to maintain employee skill information.

HR enters the following details:

- Employee Name
- Skill Name
- Experience
- Project Name

After saving the employee, the application stores the data in MySQL and redirects to the employee list page.

## 🛠️ Technologies Used

- Java
- Spring Boot
- Spring MVC
- JSP
- JSTL
- Spring Data JPA
- Hibernate
- MySQL
- Maven
- Apache Tomcat

## 📂 Project Structure

src/main/java

├── controller
│   └── EmployeeSkillController.java
│
├── service
│   └── EmployeeSkillService.java
│
├── repository
│   └── EmployeeSkillRepository.java
│
├── entity
│   └── EmployeeSkill.java
│
└── SpringBootMvcApplication.java

src/main/webapp

└── WEB-INF
    └── views
        ├── register.jsp
        └── employees.jsp

src/main/resources

└── application.properties

## 🗃️ Database

Database Name:

skilltrackerdb

The EmployeeSkill table should be created automatically by JPA/Hibernate.

## 📦 Entity

### EmployeeSkill

Fields:

- employeeId
- employeeName
- skillName
- experience
- projectName

The `employeeId` is generated automatically by JPA.

## 🗂️ Repository Layer

### EmployeeSkillRepository

Uses:

`JpaRepository<EmployeeSkill, Long>`

Provides database operations for:

- Saving employee records
- Retrieving all employee records

## ⚙️ Service Layer

### EmployeeSkillService

Methods:

- `saveEmployee(EmployeeSkill employee)`
- `getAllEmployees()`

The service layer handles communication between the controller and repository.

## 🎮 Controller Layer

### EmployeeSkillController

#### GET `/employee/register`

- Opens the employee registration form.
- Displays `register.jsp`.

#### POST `/employee/save`

- Receives employee details using form binding.
- Saves the employee through the service layer.
- Stores data in MySQL.
- Redirects to `/employee/all`.

#### GET `/employee/all`

- Retrieves all employees from the database.
- Sends employee data to the JSP.
- Displays `employees.jsp`.

## 🖥️ JSP Pages

### register.jsp

Contains a registration form with:

- Employee Name
- Skill Name
- Experience
- Project Name

Buttons:

- Save
- Reset

Form action:

`/employee/save`

Method:

`POST`

### employees.jsp

Displays all employees in a table using JSTL.

Columns:

| Employee ID | Employee Name | Skill Name | Experience | Project Name |
|-------------|---------------|------------|------------|--------------|

JSTL is used to iterate through the employee records.

## 🔄 Application Flow

Start Application
        ↓
/employee/register
        ↓
register.jsp
        ↓
Enter Employee Details
        ↓
POST /employee/save
        ↓
EmployeeSkillController
        ↓
EmployeeSkillService
        ↓
EmployeeSkillRepository
        ↓
MySQL Database
        ↓
Redirect to /employee/all
        ↓
Retrieve All Employees
        ↓
employees.jsp
        ↓
Display Employee Records using JSTL

## 🌐 URLs

| Method | URL | Purpose |
|--------|-----|---------|
| GET | `/employee/register` | Open employee registration form |
| POST | `/employee/save` | Save employee details |
| GET | `/employee/all` | Display all employees |

## 📋 Sample Data

Employee Name: Rahul Patil

Skill Name: Java

Experience: 2 Years

Project Name: Banking Application

## ✅ Expected Result

After submitting the registration form:

1. Employee details are saved into MySQL.
2. The application redirects to `/employee/all`.
3. All registered employees are retrieved from the database.
4. Employee records are displayed in a JSP table using JSTL.

Example:

| Employee ID | Employee Name | Skill Name | Experience | Project Name |
|-------------|---------------|------------|------------|--------------|
| 1 | Rahul Patil | Java | 2 Years | Banking Application |
| 2 | Amit Sharma | Spring Boot | 3 Years | E-Commerce Platform |

## 🏗️ Architecture

Controller
    ↓
Service
    ↓
Repository
    ↓
JPA / Hibernate
    ↓
MySQL

For displaying data:

MySQL
    ↓
Repository
    ↓
Service
    ↓
Controller
    ↓
JSP + JSTL

## 🎯 Learning Objectives

- Spring Boot MVC with JSP
- JSP View Resolver configuration
- JSTL
- Form handling using POST
- Spring Data JPA
- JpaRepository
- Entity mapping
- MySQL database integration
- Saving records using JPA
- Retrieving records using JPA
- JSTL iteration
- Controller → Service → Repository architecture
- MVC application with database
- Redirect after form submission

## 🚀 How to Run

1. Create the MySQL database:

`skilltrackerdb`

2. Configure MySQL connection in `application.properties`.

3. Start the Spring Boot application.

4. Open:

`http://localhost:8080/employee/register`

5. Enter employee details.

6. Click **Save**.

7. Verify that the employee is stored in MySQL.

8. The application redirects to:

`http://localhost:8080/employee/all`

9. Verify all employee records in the JSP table.