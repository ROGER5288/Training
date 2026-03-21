package com.capgemini.training.services;

import com.capgemini.training.dao.EmployerDao;
import com.capgemini.training.entity.EmployerEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class EmployerService {
    
    @Autowired
    private EmployerDao employerDao;
    
    @Autowired
    private BCryptPasswordEncoder passwordEncoder;
    
    public EmployerEntity registerEmployer(String name, String email, String password, String companyName) {
        Optional<EmployerEntity> existing = employerDao.findByEmail(email);
        if (existing.isPresent()) {
            throw new RuntimeException("Email already registered");
        }
        
        EmployerEntity employer = new EmployerEntity(name, email, passwordEncoder.encode(password), companyName);
        return employerDao.save(employer);
    }
    
    public Optional<EmployerEntity> findByEmail(String email) {
        return employerDao.findByEmail(email);
    }
    
    public EmployerEntity getEmployerById(Long id) {
        return employerDao.findById(id).orElseThrow(() -> new RuntimeException("Employer not found"));
    }
    
    public boolean validatePassword(String rawPassword, String encodedPassword) {
        return passwordEncoder.matches(rawPassword, encodedPassword);
    }
}
