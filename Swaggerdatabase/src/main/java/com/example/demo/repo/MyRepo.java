package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.entity.Stud;

public interface MyRepo extends JpaRepository<Stud, Integer> {

}