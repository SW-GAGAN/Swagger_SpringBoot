package com.example.swaggerexp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
public class SwaggerExpApplication {

    public static void main(String[] args) {

        System.out.println("Swagger example !");
        SpringApplication.run(SwaggerExpApplication.class, args);
    }

}
