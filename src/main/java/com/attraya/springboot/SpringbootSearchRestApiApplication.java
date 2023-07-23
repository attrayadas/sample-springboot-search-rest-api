package com.attraya.springboot;

import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@OpenAPIDefinition(
		info = @Info(
				title = "Spring Boot Search REST API",
				description = "Spring Boot Search REST APIs Documentation",
				version = "v1.0",
				contact = @Contact(
						name = "Attraya",
						email = "attrayaghoshdas@gmail.com",
						url = "https://www.linkedin.com/in/attrayadas/"
				),
				license = @License(
						name = "Apache 2.0",
						url = "https://github.com/attrayadas"
				)
		), externalDocs = @ExternalDocumentation(
		description = "Spring Boot Search REST API Documentation",
		url = "https://github.com/attrayadas/springboot-search-rest-api"
)
) // go to: http://localhost:8080/swagger-ui/index.html
public class SpringbootSearchRestApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootSearchRestApiApplication.class, args);
	}

}
