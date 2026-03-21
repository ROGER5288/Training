package com.capgemini.training.controller;

import com.capgemini.training.services.EmployerService;
import com.capgemini.training.services.JobSeekerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import jakarta.servlet.http.HttpSession;

@Controller
public class LoginController {
    
    @Autowired
    private EmployerService employerService;
    
    @Autowired
    private JobSeekerService jobSeekerService;
    
    @GetMapping("/login")
    public String showLoginPage(@RequestParam(value = "error", required = false) String error,
                                 @RequestParam(value = "logout", required = false) String logout,
                                 Model model) {
        if (error != null) {
            model.addAttribute("error", "Invalid credentials");
        }
        if (logout != null) {
            model.addAttribute("message", "Logged out successfully");
        }
        return "login";
    }
    
    @PostMapping("/login")
    public String login(@RequestParam String username,
                       @RequestParam String password,
                       HttpSession session,
                       Model model) {
        try {
            // Check if employer exists
            var employer = employerService.findByEmail(username);
            if (employer.isPresent() && employerService.validatePassword(password, employer.get().getPassword())) {
                session.setAttribute("user", employer.get());
                session.setAttribute("userType", "EMPLOYER");
                session.setAttribute("userId", employer.get().getId());
                return "redirect:/employer/dashboard";
            }
            
            // Check if job seeker exists
            var jobSeeker = jobSeekerService.findByEmail(username);
            if (jobSeeker.isPresent() && jobSeekerService.validatePassword(password, jobSeeker.get().getPassword())) {
                session.setAttribute("user", jobSeeker.get());
                session.setAttribute("userType", "JOBSEEKER");
                session.setAttribute("userId", jobSeeker.get().getId());
                return "redirect:/jobseeker/dashboard";
            }
            
            model.addAttribute("error", "Invalid email or password");
            return "login";
        } catch (Exception e) {
            model.addAttribute("error", "Login failed: " + e.getMessage());
            return "login";
        }
    }
    
    @GetMapping("/logout")
    public String logout(HttpSession session) {
        session.invalidate();
        return "redirect:/?logout=true";
    }
}
