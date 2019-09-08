package com.example.simpleRestAPI.user;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.Past;
import javax.validation.constraints.Size;
import java.util.Date;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class User {

    private Integer id;
    @Size(min=2, message="Name should have, at least, two characters")
    private String name;
    @Past
    private Date birthDate;

}
