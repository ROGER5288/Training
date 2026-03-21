package com.capgemini.training.controller;

import com.capgemini.training.entity.JobSeekerEntity;
import com.capgemini.training.services.JobSeekerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/jobseeker")
public class JobSeekerApiController {
    
    @Autowired
    private JobSeekerService jobSeekerService;
    
    @PostMapping("/register")
    public ResponseEntity<?> register(
            @RequestParam String name,
            @RequestParam String email,
            @RequestParam String password,
            @RequestParam String skills,
            @RequestParam String resumeLink) {
        try {
            JobSeekerEntity jobSeeker = jobSeekerService.registerJobSeeker(name, email, password, skills, resumeLink);
            return ResponseEntity.ok("Job Seeker registered successfully with ID: " + jobSeeker.getId());
        } catch (RuntimeException e) {
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }
    
    @GetMapping("/profile/{id}")
    public ResponseEntity<?> getProfile(@PathVariable Long id) {
        try {
            JobSeekerEntity jobSeeker = jobSeekerService.getJobSeekerById(id);
            return ResponseEntity.ok(jobSeeker);
        } catch (RuntimeException e) {
            return ResponseEntity.notFound().build();
        }
    }
}
