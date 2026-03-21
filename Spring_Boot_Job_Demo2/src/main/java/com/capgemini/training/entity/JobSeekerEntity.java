package com.capgemini.training.entity;

import jakarta.persistence.*;
import java.util.List;

@Entity
@Table(name = "job_seeker")
public class JobSeekerEntity {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(nullable = false)
    private String name;
    
    @Column(nullable = false, unique = true)
    private String email;
    
    @Column(nullable = false)
    private String password;
    
    @Column(nullable = false, columnDefinition = "TEXT")
    private String skills;
    
    @Column(nullable = false)
    private String resumeLink;
    
    @OneToMany(mappedBy = "jobSeeker", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<ApplicationEntity> applications;
    
    public JobSeekerEntity() {
    }
    
    public JobSeekerEntity(String name, String email, String password, String skills, String resumeLink) {
        this.name = name;
        this.email = email;
        this.password = password;
        this.skills = skills;
        this.resumeLink = resumeLink;
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
    
    public String getSkills() {
        return skills;
    }
    
    public void setSkills(String skills) {
        this.skills = skills;
    }
    
    public String getResumeLink() {
        return resumeLink;
    }
    
    public void setResumeLink(String resumeLink) {
        this.resumeLink = resumeLink;
    }
    
    public List<ApplicationEntity> getApplications() {
        return applications;
    }
    
    public void setApplications(List<ApplicationEntity> applications) {
        this.applications = applications;
    }
}
