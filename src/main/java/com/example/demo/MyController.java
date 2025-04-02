package com.example.demo;

import org.springframework.web.bind.annotation.*;

@RestController  // Marks the class as a RESTful controller
@RequestMapping("/api")  // All endpoints in this controller will start with /api
public class MyController {

    @GetMapping("/hello")
    public String sayHello() {
        return "Hello, World!";
    }

    @GetMapping("/goodbye")
    public String sayGoodbye() {
        return "Goodbye, World!";
    }

    @GetMapping("/person")
    public Person getPerson() {
        return new Person("John Doe", 30);
    }

    @PostMapping("/person")
    public Person createPerson(@RequestBody Person person) {
        // You can perform logic like saving to the database here
        return person;  // For now, simply return the received object
    }
}
