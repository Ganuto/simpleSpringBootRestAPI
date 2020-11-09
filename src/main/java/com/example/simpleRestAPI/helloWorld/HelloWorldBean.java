package com.example.simpleRestAPI.helloWorld;

import lombok.AllArgsConstructor;
import lombok.Getter;
import simpleLib.annotations.JsonElement;
import simpleLib.annotations.JsonSerializable;

@AllArgsConstructor
@Getter
@JsonSerializable
public class HelloWorldBean {

    @JsonElement
    private String message;
}