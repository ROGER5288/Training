package com.capgemini.training.controller;

import com.capgemini.training.entity.ApplicationEntity;
import com.capgemini.training.entity.JobEntity;
import com.capgemini.training.entity.JobSeekerEntity;
import com.capgemini.training.entity.JobStatus;
import com.capgemini.training.services.ApplicationService;
import com.capgemini.training.services.JobSeekerService;
import com.capgemini.training.services.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import jakarta.servlet.http.HttpSession;
import java.util.List;

@Controller
@RequestMapping("/jobseeker")
public class JobSeekerViewController {
    
    @Autowired
    private JobSeekerService jobSeekerService;
    
    @Autowired
    private JobService jobService;
    
    @Autowired
    private ApplicationService applicationService;
    
    @GetMapping("/login-page")
    public String loginPage() {
        return "jobseeker-login";
    }
    
    @GetMapping("/register-page")
    public String registerPage() {
        return "jobseeker-register";
    }
    
    @PostMapping("/register")
    public String register(
            @RequestParam String name,
            @RequestParam String email,
            @RequestParam String password,
            @RequestParam String skills,
            @RequestParam String resumeLink,
            Model model) {
        try {
            jobSeekerService.registerJobSeeker(name, email, password, skills, resumeLink);
            model.addAttribute("message", "Registration successful! Please log in.");
            return "redirect:/jobseeker/login-page";
        } catch (RuntimeException e) {
            model.addAttribute("error", e.getMessage());
            return "jobseeker-register";
        }
    }
    
    @GetMapping("/dashboard")
    public String dashboard(HttpSession session, Model model) {
        String userType = (String) session.getAttribute("userType");
        if (userType == null || !userType.equals("JOBSEEKER")) {
            return "redirect:/login";
        }
        
        JobSeekerEntity jobSeeker = (JobSeekerEntity) session.getAttribute("user");
        List<ApplicationEntity> applications = applicationService.getApplicationsByJobSeeker(jobSeeker.getId());
        model.addAttribute("jobSeeker", jobSeeker);
        model.addAttribute("applications", applications);
        return "jobseeker-dashboard";
    }
    
    @GetMapping("/jobs")
    public String viewJobs(Model model) {
        List<JobEntity> jobs = jobService.getOpenJobs();
        model.addAttribute("jobs", jobs);
        return "job-list";
    }
    
    @GetMapping("/apply-page/{jobId}")
    public String applyPage(@PathVariable Long jobId, HttpSession session, Model model) {
        try {
            JobEntity job = jobService.getJobById(jobId);
            model.addAttribute("job", job);
            
            // Check if job seeker has already applied
            JobSeekerEntity jobSeeker = (JobSeekerEntity) session.getAttribute("user");
            if (jobSeeker != null) {
                boolean hasApplied = applicationService.hasAppliedToJob(jobId, jobSeeker.getId());
                model.addAttribute("hasApplied", hasApplied);
            }
            
            return "apply-job";
        } catch (RuntimeException e) {
            return "redirect:/jobseeker/jobs";
        }
    }
    
    @PostMapping("/apply/{jobId}")
    public String applyForJob(
            @PathVariable Long jobId,
            HttpSession session,
            Model model) {
        String userType = (String) session.getAttribute("userType");
        if (userType == null || !userType.equals("JOBSEEKER")) {
            return "redirect:/login";
        }
        
        try {
            JobSeekerEntity jobSeeker = (JobSeekerEntity) session.getAttribute("user");
            JobEntity job = jobService.getJobById(jobId);
            
            if (job.getStatus() != JobStatus.OPEN) {
                model.addAttribute("error", "This job is no longer open");
                model.addAttribute("job", job);
                return "apply-job";
            }
            
            applicationService.applyForJob(jobId, jobSeeker);
            return "redirect:/jobseeker/dashboard";
        } catch (RuntimeException e) {
            model.addAttribute("error", e.getMessage());
        }
        return "redirect:/jobseeker/jobs";
    }
}
