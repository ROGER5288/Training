package com.capgemini.training.services;

import com.capgemini.training.dao.JobSeekerDao;
import com.capgemini.training.entity.JobSeekerEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class JobSeekerService {
    
    @Autowired
    private JobSeekerDao jobSeekerDao;
    
    @Autowired
    private BCryptPasswordEncoder passwordEncoder;
    
    public JobSeekerEntity registerJobSeeker(String name, String email, String password, String skills, String resumeLink) {
        Optional<JobSeekerEntity> existing = jobSeekerDao.findByEmail(email);
        if (existing.isPresent()) {
            throw new RuntimeException("Email already registered");
        }
        
        JobSeekerEntity jobSeeker = new JobSeekerEntity(name, email, passwordEncoder.encode(password), skills, resumeLink);
        return jobSeekerDao.save(jobSeeker);
    }
    
    public Optional<JobSeekerEntity> findByEmail(String email) {
        return jobSeekerDao.findByEmail(email);
    }
    
    public JobSeekerEntity getJobSeekerById(Long id) {
        return jobSeekerDao.findById(id).orElseThrow(() -> new RuntimeException("Job Seeker not found"));
    }
    
    public boolean validatePassword(String rawPassword, String encodedPassword) {
        return passwordEncoder.matches(rawPassword, encodedPassword);
    }
}
