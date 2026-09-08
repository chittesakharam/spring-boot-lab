# Task 67 - Language Switcher using Spring Boot MVC

## 📌 Objective

Create a Spring Boot MVC application that displays the same page in English
and Hindi using Spring Internationalization (i18n).

The user can switch the application language using the `lang` request
parameter.

## 📝 Scenario

Create a basic multilingual home page that displays:

### English

- Welcome
- Good Morning
- Thank You

### Hindi

- स्वागत है
- सुप्रभात
- धन्यवाद

The same JSP page should display different messages based on the selected
locale.

## 🛠️ Technologies Used

- Java
- Spring Boot
- Spring MVC
- JSP
- Spring Internationalization (i18n)
- MessageSource
- LocaleResolver
- LocaleChangeInterceptor
- Maven
- Apache Tomcat

## 📂 Required Files

```text
src/main/java
│
├── controller
│   └── HomeController.java
│
├── config
│   └── WebConfig.java
│
└── SpringBootMvcApplication.java

src/main/resources
│
├── messages.properties
└── messages_hi.properties

src/main/webapp
│
└── WEB-INF
    └── views
        └── home.jsp