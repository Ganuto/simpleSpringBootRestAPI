package com.example.simpleRestAPI.helloWorld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import simpleLib.ObjectToJsonConverter;
import simpleLib.annotations.JsonSerializable;

@RestController
public class HelloWorldController {

    @GetMapping("/hello-world")
    public String helloWorld() {
        return "Hello World";
    }

    @GetMapping("/hello-world-bean")
    public HelloWorldBean helloWorldBean() {
        return new HelloWorldBean("Hello World");
    }

    @GetMapping("/hello-world-bean-lib")
    public String helloWorldWithLibReturn() throws Exception {
        HelloWorldBean helloWorldBean = new HelloWorldBean("sapato");
        ObjectToJsonConverter objectToJsonConverter = new ObjectToJsonConverter();
        String response = objectToJsonConverter.convertToJson(helloWorldBean);

        return response;
    }
}
