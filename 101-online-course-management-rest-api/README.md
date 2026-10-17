# Task 101: Online Course Management REST API

## Overview
Develop a RESTful API using Spring Boot to manage online courses through CRUD operations.

The API allows administrators to create, retrieve, update, and delete course records.

## Technologies Used
- Java
- Spring Boot
- Spring Web
- Spring Data JPA
- MySQL
- Maven
- Postman

## Course Fields
- id
- courseName
- instructor
- category
- duration
- price
- description

## REST API Endpoints

| Operation | HTTP Method | Endpoint | Description |
|-----------|-------------|----------|-------------|
| Create | POST | /api/courses | Add a new course |
| Read All | GET | /api/courses | Retrieve all courses |
| Read by ID | GET | /api/courses/{id} | Retrieve a course by ID |
| Update | PUT | /api/courses/{id} | Update course details |
| Delete | DELETE | /api/courses/{id} | Delete a course |

## Sample Course Request

POST /api/courses

Content-Type: application/json

{
  "courseName": "Java Full Stack Development",
  "instructor": "Rahul Sharma",
  "category": "Programming",
  "duration": "6 months",
  "price": 25000.00,
  "description": "Learn Java, Spring Boot, REST APIs, and database integration."
}

## Expected Results
- Create a new course.
- Retrieve all available courses.
- Retrieve a specific course using its ID.
- Update an existing course.
- Delete a course by its ID.

## Project Architecture
- Entity: Course
- Repository: CourseRepository
- Service: CourseService
- Controller: CourseController

## Learning Objectives
- Build RESTful APIs using Spring Boot.
- Implement CRUD operations.
- Use Spring Data JPA for database access.
- Connect Spring Boot to MySQL.
- Test REST endpoints using Postman.
- Organize code using a layered architecture.