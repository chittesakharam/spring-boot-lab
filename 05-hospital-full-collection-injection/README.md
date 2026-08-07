# Task 05 - Hospital Full Collection Injection using @ConfigurationProperties

## 📌 Objective

Learn how to inject multiple collection types (`List`, `Array`, and `Map`) from `application.properties` into a Spring Boot bean using `@ConfigurationProperties`.

---

## 📖 Concepts Covered

- @Component
- @ConfigurationProperties
- List Injection
- Array Injection
- Map Injection
- Bulk Property Binding
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
hospital.id=900
hospital.name=Care Hospital

hospital.doctors[0]=Ravi
hospital.doctors[1]=Kiran

hospital.specialists[0]=Cardiology
hospital.specialists[1]=Neurology

hospital.staff.cleaner=20
hospital.staff.nurse=45
```

---

## Hospital Bean

```java
@Component
@ConfigurationProperties(prefix = "hospital")
public class Hospital {

    private Integer id;
    private String name;
    private List<String> doctors;
    private String[] specialists;
    private Map<String, Integer> staff;

    // Getters
    // Setters
    // toString()
}
```

---

## Runner Class

```java
@Component
public class HospitalRunner implements CommandLineRunner {

    @Autowired
    private Hospital hospital;

    @Override
    public void run(String... args) {
        System.out.println(hospital);
    }
}
```

---

## Sample Output

```text
Hospital{
    id=900,
    name='Care Hospital',
    doctors=[Ravi, Kiran],
    specialists=[Cardiology, Neurology],
    staff={cleaner=20, nurse=45}
}
```

---

## Learning Outcome

- Bind List values using `@ConfigurationProperties`
- Bind Array values using `@ConfigurationProperties`
- Bind Map values using `@ConfigurationProperties`
- Understand bulk property injection
- Execute startup logic using `CommandLineRunner`
- Practice collection binding in Spring Boot