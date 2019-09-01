package com.example.simpleRestAPI;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SimpleRestApiApplication {

    public static void main(String[] args) {
        ApplicationContext applicationContext =
                SpringApplication.run(SimpleRestApiApplication.class, args);
    }

}
