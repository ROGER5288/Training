package com.capgemini.training.controller;

import com.capgemini.training.entity.ApplicationEntity;
import com.capgemini.training.entity.ApplicationStatus;
import com.capgemini.training.services.ApplicationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/application")
public class ApplicationApiController {
    
    @Autowired
    private ApplicationService applicationService;
    
    @PostMapping("/apply")
    public ResponseEntity<?> applyForJob(
            @RequestParam Long jobId,
            @RequestParam Long jobSeekerId) {
        try {
            // This would be used after authentication to get the current user
            return ResponseEntity.badRequest().body("Use view-based application instead");
        } catch (RuntimeException e) {
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }
    
    @GetMapping("/jobseeker/{jobSeekerId}")
    public ResponseEntity<?> getApplicationsByJobSeeker(@PathVariable Long jobSeekerId) {
        List<ApplicationEntity> applications = applicationService.getApplicationsByJobSeeker(jobSeekerId);
        return ResponseEntity.ok(applications);
    }
    
    @GetMapping("/job/{jobId}")
    public ResponseEntity<?> getApplicationsByJob(@PathVariable Long jobId) {
        List<ApplicationEntity> applications = applicationService.getApplicationsByJob(jobId);
        return ResponseEntity.ok(applications);
    }
    
    @PutMapping("/{id}/status")
    public ResponseEntity<?> updateStatus(
            @PathVariable Long id,
            @RequestParam ApplicationStatus status) {
        try {
            ApplicationEntity application = applicationService.updateApplicationStatus(id, status);
            return ResponseEntity.ok(application);
        } catch (RuntimeException e) {
            return ResponseEntity.notFound().build();
        }
    }
}
