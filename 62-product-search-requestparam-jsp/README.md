# Task 62 - Product Search System

## 📌 Objective

Develop a Spring Boot MVC application to search product information using
`@RequestParam`.

The application allows users to search products by product name or category
and displays the matching product details on a JSP page.

No database is used. Product data is maintained using Java Collections.

## 📝 Project Definition

The Product Search System provides a search form where users can enter:

- Product Name
- Category

The Spring MVC controller receives the search parameters using `@RequestParam`,
searches the product collection, and sends the matching products to a JSP page.

## 📦 Product Model

### Product Fields

- `productId`
- `productName`
- `category`
- `price`

## 🛠️ Technologies Used

- Java
- Spring Boot
- Spring MVC
- JSP
- Maven
- HTML/CSS
- Java Collections
- Apache Tomcat

## 📂 Project Structure

src/main/java

├── controller
│   └── ProductController.java
│
├── model
│   └── Product.java
│
└── SpringBootMvcApplication.java

src/main/webapp

└── WEB-INF
    └── views
        ├── product-search.jsp
        └── product-result.jsp

src/main/resources

└── application.properties

## 🗃️ Product Data

Product information is maintained using Java Collections such as
`List<Product>`.

No database or JPA is used.

Example products:

| Product ID | Product Name | Category | Price |
|---|---|---|---:|
| 101 | Laptop | Electronics | 55000 |
| 102 | Mobile | Electronics | 25000 |
| 103 | Keyboard | Accessories | 1500 |
| 104 | Headphones | Accessories | 2500 |

## 🎮 Controller

### GET `/product/search`

- Opens the product search form.
- Displays `product-search.jsp`.

### GET `/product/search/result`

- Receives product search criteria using `@RequestParam`.
- Searches the product collection.
- Sends matching product information to the JSP.
- Displays `product-result.jsp`.

## 🔎 Search Criteria

Users can search using:

### Product Name

Example:

```text
Laptop