package com.capgemini.training.security;

import com.capgemini.training.dao.EmployerDao;
import com.capgemini.training.dao.JobSeekerDao;
import com.capgemini.training.entity.EmployerEntity;
import com.capgemini.training.entity.JobSeekerEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CustomUserDetailsService implements UserDetailsService {
    
    @Autowired
    private EmployerDao employerDao;
    
    @Autowired
    private JobSeekerDao jobSeekerDao;
    
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        // Try to find Employer
        Optional<EmployerEntity> employer = employerDao.findByEmail(username);
        if (employer.isPresent()) {
            return User.builder()
                    .username(employer.get().getEmail())
                    .password(employer.get().getPassword())
                    .roles("EMPLOYER")
                    .build();
        }
        
        // Try to find JobSeeker
        Optional<JobSeekerEntity> jobSeeker = jobSeekerDao.findByEmail(username);
        if (jobSeeker.isPresent()) {
            return User.builder()
                    .username(jobSeeker.get().getEmail())
                    .password(jobSeeker.get().getPassword())
                    .roles("JOBSEEKER")
                    .build();
        }
        
        throw new UsernameNotFoundException("User not found with email: " + username);
    }
}
