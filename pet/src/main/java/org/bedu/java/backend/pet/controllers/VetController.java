package org.bedu.java.backend.pet.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VetController {

    @GetMapping("/test")
    public String test(){
        return "Hello World";
    }
}
