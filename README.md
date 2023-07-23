# Search REST API - Spring Boot, Spring Data JPA (JPQL, Native SQL), and MySQL
A compact REST API project for efficient search operations on MySQL using Spring Boot and Spring Data JPA

## Steps to Setup

**1. Clone the Application**

```bash
git clone https://github.com/attrayadas/springboot-search-rest-api
```

**2. Create MySQL Database**
```bash
create database search_api
```

**3. Change MySQL username and password as per your installation**

+ open `src/main/resources/application.properties`
+ change `spring.datasource.username` and `spring.datasource.password` as per your MySQL installation

**4. Run the app using maven**

```bash
mvn spring-boot:run
```
Find the swagger documentation at <http://localhost:8080/swagger-ui/index.html>

![SearchAPI Swagger](https://github.com/attrayadas/springboot-search-rest-api/assets/96123861/5c1851b7-850d-459f-a876-d8e8143068ea)
