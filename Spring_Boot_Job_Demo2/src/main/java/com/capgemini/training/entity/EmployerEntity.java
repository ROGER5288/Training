package com.capgemini.training.entity;

import jakarta.persistence.*;
import java.util.List;

@Entity
@Table(name = "employer")
public class EmployerEntity {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(nullable = false)
    private String name;
    
    @Column(nullable = false, unique = true)
    private String email;
    
    @Column(nullable = false)
    private String password;
    
    @Column(nullable = false)
    private String companyName;
    
    @OneToMany(mappedBy = "employer", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<JobEntity> jobs;
    
    public EmployerEntity() {
    }
    
    public EmployerEntity(String name, String email, String password, String companyName) {
        this.name = name;
        this.email = email;
        this.password = password;
        this.companyName = companyName;
    }
    
    public Long getId() {
        return id;
    }
    
    public void setId(Long id) {
        this.id = id;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getEmail() {
        return email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    
    public String getPassword() {
        return password;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }
    
    public String getCompanyName() {
        return companyName;
    }
    
    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }
    
    public List<JobEntity> getJobs() {
        return jobs;
    }
    
    public void setJobs(List<JobEntity> jobs) {
        this.jobs = jobs;
    }
}
