package com.example.demo.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserController {

    // GET
    @GetMapping("/hello")
    public String sayHello() {
        return "Hello Swagger";
    }

    // POST
    @PostMapping
    public String createUser(@RequestBody String name) {
        return "User Created: " + name;
    }

    // PUT (Update)
    @PutMapping
    public String updateUser(@RequestBody String name) {
        return "User Updated: " + name;
    }

    // DELETE
    @DeleteMapping
    public String deleteUser(@RequestBody String name) {
        return "User Deleted: " + name;
    }
}