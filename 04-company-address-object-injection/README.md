# Task 04 - Company Address Object Injection using @ConfigurationProperties

## 📌 Objective

Learn how to inject a nested object from `application.properties` into a Spring Boot bean using `@ConfigurationProperties`.

---

## 📖 Concepts Covered

- @Component
- @ConfigurationProperties
- Nested Object Injection
- application.properties
- CommandLineRunner
- Dependency Injection

---

## 🛠 Technologies Used

- Java
- Spring Boot
- Maven

---

## application.properties

```properties
company.id=1
company.name=TCS

company.address.city=Hyderabad
company.address.state=Telangana
company.address.pincode=500001
```

---

## Address Class

```java
public class Address {

    private String city;
    private String state;
    private Integer pincode;

    // Getters
    // Setters
    // toString()
}
```

---

## Company Class

```java
@Component
@ConfigurationProperties(prefix = "company")
public class Company {

    private Integer id;
    private String name;
    private Address address;

    // Getters
    // Setters
    // toString()
}
```

---

## Runner Class

```java
@Component
public class CompanyRunner implements CommandLineRunner {

    @Autowired
    private Company company;

    @Override
    public void run(String... args) {
        System.out.println(company);
    }
}
```

---

## Sample Output

```text
Company{
    id=1,
    name='TCS',
    address=Address{
        city='Hyderabad',
        state='Telangana',
        pincode=500001
    }
}
```

---

## Learning Outcome

- Bind nested objects using `@ConfigurationProperties`
- Understand object injection in Spring Boot
- Execute startup logic using `CommandLineRunner`
- Practice hierarchical configuration binding