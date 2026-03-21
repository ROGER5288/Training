package com.capgemini.training.controller;

import com.capgemini.training.entity.JobEntity;
import com.capgemini.training.services.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/job")
public class JobApiController {
    
    @Autowired
    private JobService jobService;
    
    @GetMapping("/all")
    public ResponseEntity<?> getAllJobs() {
        List<JobEntity> jobs = jobService.getAllJobs();
        return ResponseEntity.ok(jobs);
    }
    
    @GetMapping("/open")
    public ResponseEntity<?> getOpenJobs() {
        List<JobEntity> jobs = jobService.getOpenJobs();
        return ResponseEntity.ok(jobs);
    }
    
    @GetMapping("/{id}")
    public ResponseEntity<?> getJobById(@PathVariable Long id) {
        try {
            JobEntity job = jobService.getJobById(id);
            return ResponseEntity.ok(job);
        } catch (RuntimeException e) {
            return ResponseEntity.notFound().build();
        }
    }
    
    @GetMapping("/search/location")
    public ResponseEntity<?> searchByLocation(@RequestParam String location) {
        List<JobEntity> jobs = jobService.searchByLocation(location);
        return ResponseEntity.ok(jobs);
    }
    
    @GetMapping("/search/title")
    public ResponseEntity<?> searchByTitle(@RequestParam String title) {
        List<JobEntity> jobs = jobService.searchByTitle(title);
        return ResponseEntity.ok(jobs);
    }
}
