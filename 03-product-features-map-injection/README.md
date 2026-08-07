# Task 03 - Product Features Map Injection using @ConfigurationProperties

## 📌 Objective

Learn how to inject a `Map<String, String>` from `application.properties` into a Spring Boot bean using `@ConfigurationProperties`.

---

## 📖 Concepts Covered

- @Component
- @ConfigurationProperties
- Map Injection
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
product.id=501
product.name=Laptop

product.features.ram=16GB
product.features.processor=i7
product.features.storage=512SSD
```

---

## Product Bean

```java
@Component
@ConfigurationProperties(prefix = "product")
public class Product {

    private Integer id;
    private String name;
    private Map<String, String> features;

    // Getters
    // Setters
    // toString()
}
```

---

## Runner Class

```java
@Component
public class ProductRunner implements CommandLineRunner {

    @Autowired
    private Product product;

    @Override
    public void run(String... args) {
        System.out.println(product);
    }
}
```

---

## Sample Output

```text
Product{id=501, name='Laptop', features={ram=16GB, processor=i7, storage=512SSD}}
```

---

## Learning Outcome

- Bind Map values from `application.properties`
- Understand Map Injection using `@ConfigurationProperties`
- Execute startup logic using `CommandLineRunner`
- Practice configuration binding in Spring Boot