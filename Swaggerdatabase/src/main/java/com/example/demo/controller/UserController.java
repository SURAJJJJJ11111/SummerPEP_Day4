package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.demo.entity.Stud;
import com.example.demo.repo.MyRepo;

@RestController
public class UserController {

    @Autowired
    private MyRepo repo;

    // Create
    @PostMapping("/create")
    public Stud createUser(@RequestBody Stud user) {
        return repo.save(user);
    }

    // Read All
    @GetMapping("/getAll")
    public List<Stud> getUsers() {
        return repo.findAll();
    }

    // Read By Id
    @GetMapping("/get/{id}")
    public Stud getUser(@PathVariable Integer id) {
        return repo.findById(id).orElse(null);
    }

    // Update
    @PutMapping("/update/{id}")
    public Stud updateUser(@PathVariable Integer id, @RequestBody Stud user) {

        Stud s = repo.findById(id).orElse(null);

        if (s != null) {
            s.setName(user.getName());
            return repo.save(s);
        }

        return null;
    }

    // Delete
    @DeleteMapping("/delete/{id}")
    public String deleteUser(@PathVariable Integer id) {
        repo.deleteById(id);
        return "User Deleted Successfully";
    }
}