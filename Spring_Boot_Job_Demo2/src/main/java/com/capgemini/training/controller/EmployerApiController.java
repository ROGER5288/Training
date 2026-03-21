package com.capgemini.training.controller;

import com.capgemini.training.entity.EmployerEntity;
import com.capgemini.training.services.EmployerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/employer")
public class EmployerApiController {
    
    @Autowired
    private EmployerService employerService;
    
    @PostMapping("/register")
    public ResponseEntity<?> register(
            @RequestParam String name,
            @RequestParam String email,
            @RequestParam String password,
            @RequestParam String companyName) {
        try {
            EmployerEntity employer = employerService.registerEmployer(name, email, password, companyName);
            return ResponseEntity.ok("Employer registered successfully with ID: " + employer.getId());
        } catch (RuntimeException e) {
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }
    
    @GetMapping("/profile/{id}")
    public ResponseEntity<?> getProfile(@PathVariable Long id) {
        try {
            EmployerEntity employer = employerService.getEmployerById(id);
            return ResponseEntity.ok(employer);
        } catch (RuntimeException e) {
            return ResponseEntity.notFound().build();
        }
    }
}
