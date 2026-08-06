# Task 02 - Employee Skills Array Injection using @ConfigurationProperties

## 📌 Objective

Learn how to inject an array from `application.properties` into a Spring Boot bean using `@ConfigurationProperties`.

---

## 📖 Concepts Covered

- @Component
- @ConfigurationProperties
- Array Injection
- application.properties
- CommandLineRunner
- Dependency Injection

---

## 🛠 Technologies

- Java
- Spring Boot
- Maven

---

## application.properties

```properties
emp.id=1001
emp.name=Scott
emp.skills[0]=Java
emp.skills[1]=SQL
emp.skills[2]=AWS
```

---

## Employee Bean

```java
@Component
@ConfigurationProperties(prefix = "emp")
public class Employee {

    private Integer id;
    private String name;
    private String[] skills;

    // Getters, Setters and toString()
}
```

---

## Runner Class

```java
@Component
public class EmployeeRunner implements CommandLineRunner {

    @Autowired
    private Employee employee;

    @Override
    public void run(String... args) {
        System.out.println(employee);
    }
}
```

---

## Output

```text
Employee{id=1001, name='Scott', skills=[Java, SQL, AWS]}
```

---

## Learning Outcome

- Bind array values from `application.properties`
- Understand `@ConfigurationProperties`
- Execute startup logic using `CommandLineRunner`
- Practice Spring Boot configuration binding