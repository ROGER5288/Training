package com.capgemini.training.controller;

import com.capgemini.training.entity.EmployerEntity;
import com.capgemini.training.entity.JobEntity;
import com.capgemini.training.entity.JobStatus;
import com.capgemini.training.services.EmployerService;
import com.capgemini.training.services.JobService;
import com.capgemini.training.services.ApplicationService;
import com.capgemini.training.entity.ApplicationStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import jakarta.servlet.http.HttpSession;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

@Controller
@RequestMapping("/employer")
public class EmployerViewController {
    
    @Autowired
    private EmployerService employerService;
    
    @Autowired
    private JobService jobService;
    
    @Autowired
    private ApplicationService applicationService;
    
    @GetMapping("/login-page")
    public String loginPage() {
        return "employer-login";
    }
    
    @GetMapping("/register-page")
    public String registerPage() {
        return "employer-register";
    }
    
    @PostMapping("/register")
    public String register(
            @RequestParam String name,
            @RequestParam String email,
            @RequestParam String password,
            @RequestParam String companyName,
            Model model) {
        try {
            employerService.registerEmployer(name, email, password, companyName);
            model.addAttribute("message", "Registration successful! Please log in.");
            return "redirect:/employer/login-page";
        } catch (RuntimeException e) {
            model.addAttribute("error", e.getMessage());
            return "employer-register";
        }
    }
    
    @GetMapping("/dashboard")
    public String dashboard(HttpSession session, Model model) {
        String userType = (String) session.getAttribute("userType");
        if (userType == null || !userType.equals("EMPLOYER")) {
            return "redirect:/login";
        }
        
        EmployerEntity employer = (EmployerEntity) session.getAttribute("user");
        model.addAttribute("employer", employer);
        return "employer-dashboard";
    }
    
    @GetMapping("/jobs")
    public String getEmployerJobs(HttpSession session, Model model) {
        String userType = (String) session.getAttribute("userType");
        if (userType == null || !userType.equals("EMPLOYER")) {
            return "redirect:/login";
        }
        
        EmployerEntity employer = (EmployerEntity) session.getAttribute("user");
        List<JobEntity> jobs = jobService.getJobsByEmployer(employer.getId());
        
        // Create a map of job ID to applications
        Map<Long, List<?>> jobApplications = new HashMap<>();
        for (JobEntity job : jobs) {
            jobApplications.put(job.getId(), applicationService.getApplicationsByJob(job.getId()));
        }
        
        model.addAttribute("jobs", jobs);
        model.addAttribute("jobApplications", jobApplications);
        model.addAttribute("employer", employer);
        return "employer-jobs";
    }
    
    @GetMapping("/post-job-page")
    public String postJobPage(HttpSession session, Model model) {
        String userType = (String) session.getAttribute("userType");
        if (userType == null || !userType.equals("EMPLOYER")) {
            return "redirect:/login";
        }
        
        EmployerEntity employer = (EmployerEntity) session.getAttribute("user");
        model.addAttribute("employer", employer);
        return "post-job";
    }
    
    @PostMapping("/post-job")
    public String postJob(
            @RequestParam String title,
            @RequestParam String description,
            @RequestParam Double salary,
            @RequestParam String location,
            HttpSession session,
            Model model) {
        String userType = (String) session.getAttribute("userType");
        if (userType == null || !userType.equals("EMPLOYER")) {
            return "redirect:/login";
        }
        
        try {
            EmployerEntity employer = (EmployerEntity) session.getAttribute("user");
            jobService.postJob(title, description, salary, location, employer);
            return "redirect:/employer/jobs";
        } catch (RuntimeException e) {
            model.addAttribute("error", e.getMessage());
        }
        return "post-job";
    }
    
    @PostMapping("/close-job/{jobId}")
    public String closeJob(@PathVariable Long jobId, HttpSession session) {
        String userType = (String) session.getAttribute("userType");
        if (userType == null || !userType.equals("EMPLOYER")) {
            return "redirect:/login";
        }
        
        try {
            EmployerEntity employer = (EmployerEntity) session.getAttribute("user");
            JobEntity job = jobService.getJobById(jobId);
            if (job.getEmployer().getId().equals(employer.getId())) {
                jobService.updateJobStatus(jobId, JobStatus.CLOSED);
            }
        } catch (RuntimeException e) {
            // Ignore
        }
        return "redirect:/employer/jobs";
    }
    
    @PostMapping("/reopen-job/{jobId}")
    public String reopenJob(@PathVariable Long jobId, HttpSession session) {
        String userType = (String) session.getAttribute("userType");
        if (userType == null || !userType.equals("EMPLOYER")) {
            return "redirect:/login";
        }
        
        try {
            EmployerEntity employer = (EmployerEntity) session.getAttribute("user");
            JobEntity job = jobService.getJobById(jobId);
            if (job.getEmployer().getId().equals(employer.getId())) {
                jobService.updateJobStatus(jobId, JobStatus.OPEN);
            }
        } catch (RuntimeException e) {
            // Ignore
        }
        return "redirect:/employer/jobs";
    }
    
    @PostMapping("/delete-job/{jobId}")
    public String deleteJob(@PathVariable Long jobId, HttpSession session) {
        String userType = (String) session.getAttribute("userType");
        if (userType == null || !userType.equals("EMPLOYER")) {
            return "redirect:/login";
        }
        
        try {
            EmployerEntity employer = (EmployerEntity) session.getAttribute("user");
            JobEntity job = jobService.getJobById(jobId);
            if (job.getEmployer().getId().equals(employer.getId())) {
                jobService.deleteJob(jobId);
            }
        } catch (RuntimeException e) {
            // Ignore
        }
        return "redirect:/employer/jobs";
    }
    
    @PostMapping("/accept-application/{applicationId}")
    public String acceptApplication(@PathVariable Long applicationId, HttpSession session) {
        String userType = (String) session.getAttribute("userType");
        if (userType == null || !userType.equals("EMPLOYER")) {
            return "redirect:/login";
        }
        
        try {
            applicationService.updateApplicationStatus(applicationId, ApplicationStatus.ACCEPTED);
        } catch (RuntimeException e) {
            // Ignore
        }
        return "redirect:/employer/jobs";
    }
    
    @PostMapping("/reject-application/{applicationId}")
    public String rejectApplication(@PathVariable Long applicationId, HttpSession session) {
        String userType = (String) session.getAttribute("userType");
        if (userType == null || !userType.equals("EMPLOYER")) {
            return "redirect:/login";
        }
        
        try {
            applicationService.updateApplicationStatus(applicationId, ApplicationStatus.REJECTED);
        } catch (RuntimeException e) {
            // Ignore
        }
        return "redirect:/employer/jobs";
    }
}
