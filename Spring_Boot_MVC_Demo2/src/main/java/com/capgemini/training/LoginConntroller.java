package com.capgemini.training;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import jakarta.servlet.http.HttpServletRequest;

@Controller
public class LoginConntroller {

	@GetMapping("/")
	public String login() {
		return "login";
	}

	@PostMapping("/login")
	public String login(String username, String password) {
		if (username.equals("admin") && password.equals("admin")) {
			return "welcome";
		} else {
			return "login";
		}
	}

	@PostMapping("/register")
	public String register() {
		return "register";
	}
	
	@GetMapping("/signup")
	public String signup() {
		return "signup";
	}
	
	@PostMapping("/signup")
	public String signupPost(String firstname, String lastname, String email, String username, String password) {
		// Here you would typically validate and save the user to database
		// For now, we'll just redirect to login with a success message
		return "redirect:/";
	}
	
	@GetMapping("/forgot-password")
	public String forgotPassword() {
		return "forgot-password";
	}
	
	@PostMapping("/forgot-password")
	public String forgotPasswordPost(String email) {
		// Here you would typically:
		// 1. Check if email exists in database
		// 2. Generate a reset token
		// 3. Send reset link via email
		// For now, we'll just redirect with a message
		return "redirect:/";
	}
	
}