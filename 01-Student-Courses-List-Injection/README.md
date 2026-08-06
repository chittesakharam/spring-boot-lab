# Task 01 - Student Courses List Injection using @ConfigurationProperties

## Objective

Learn how to bind properties from `application.properties` to a Spring Boot bean using `@ConfigurationProperties`.

## Concepts Covered

- @Component
- @ConfigurationProperties
- List Injection
- application.properties
- CommandLineRunner
- Dependency Injection

## application.properties

```properties
student.id=101
student.name=Ramesh
student.courses[0]=Java
student.courses[1]=Spring
student.courses[2]=Microservices
```

## Bean Class

```java
@Component
@ConfigurationProperties(prefix = "student")
public class Student {

    private Integer id;
    private String name;
    private List<String> courses;

    // Getters and Setters
}
```

## Runner

```java
@Component
public class TestRunner implements CommandLineRunner {

    @Autowired
    private Student student;

    @Override
    public void run(String... args) {
        System.out.println(student);
    }
}
```

## Output

```
Student{id=101, name='Ramesh', courses=[Java, Spring, Microservices]}
```

## Learning Outcome

- Bind configuration properties to Java objects.
- Inject a List from `application.properties`.
- Execute code using `CommandLineRunner`.
- Understand the role of `@ConfigurationProperties` in Spring Boot.