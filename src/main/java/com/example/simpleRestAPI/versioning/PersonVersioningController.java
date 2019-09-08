package com.example.simpleRestAPI.versioning;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonVersioningController {

    //URI
    @GetMapping("/v1/person")
    public PersonV1 personV1() {
        return new PersonV1("Guilherme");
    }

    @GetMapping("/v2/person")
    public PersonV2 personV2() {
        return new PersonV2(new Name("Guilherme", "Canuto"));
    }

    //Params
    @GetMapping(value="/person", params="version=1")
    public PersonV1 paramV1() {
        return new PersonV1("Guilherme");
    }

    @GetMapping(value="/person", params="version=2")
    public PersonV2 paramV2() {
        return new PersonV2(new Name("Guilherme", "Canuto"));
    }

    //Header
    @GetMapping(value="/person/header", headers="X-API-VERSION=1")
    public PersonV1 headerV1() {
        return new PersonV1("Guilherme");
    }

    @GetMapping(value="/person/header", headers = "X-API-VERSION=2")
    public PersonV2 headerV2() {
        return new PersonV2(new Name("Guilherme", "Canuto"));
    }

    //Accept
    @GetMapping(value="/person/produces", produces="application/vnd.company.app-v1+json")
    public PersonV1 producesV1() {
        return new PersonV1("Guilherme");
    }

    @GetMapping(value="/person/produces", produces="application/vnd.company.app-v2+json")
    public PersonV2 producesV2() {
        return new PersonV2(new Name("Guilherme", "Canuto"));
    }
}
