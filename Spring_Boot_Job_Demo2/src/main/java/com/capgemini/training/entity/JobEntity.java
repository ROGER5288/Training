package com.capgemini.training.entity;

import jakarta.persistence.*;
import java.util.List;

@Entity
@Table(name = "job")
public class JobEntity {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(nullable = false)
    private String title;
    
    @Column(nullable = false, columnDefinition = "TEXT")
    private String description;
    
    @Column(nullable = false)
    private Double salary;
    
    @Column(nullable = false)
    private String location;
    
    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private JobStatus status = JobStatus.OPEN;
    
    @ManyToOne
    @JoinColumn(name = "employer_id", nullable = false)
    private EmployerEntity employer;
    
    @OneToMany(mappedBy = "job", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<ApplicationEntity> applications;
    
    public JobEntity() {
    }
    
    public JobEntity(String title, String description, Double salary, String location, EmployerEntity employer) {
        this.title = title;
        this.description = description;
        this.salary = salary;
        this.location = location;
        this.employer = employer;
        this.status = JobStatus.OPEN;
    }
    
    public Long getId() {
        return id;
    }
    
    public void setId(Long id) {
        this.id = id;
    }
    
    public String getTitle() {
        return title;
    }
    
    public void setTitle(String title) {
        this.title = title;
    }
    
    public String getDescription() {
        return description;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }
    
    public Double getSalary() {
        return salary;
    }
    
    public void setSalary(Double salary) {
        this.salary = salary;
    }
    
    public String getLocation() {
        return location;
    }
    
    public void setLocation(String location) {
        this.location = location;
    }
    
    public JobStatus getStatus() {
        return status;
    }
    
    public void setStatus(JobStatus status) {
        this.status = status;
    }
    
    public EmployerEntity getEmployer() {
        return employer;
    }
    
    public void setEmployer(EmployerEntity employer) {
        this.employer = employer;
    }
    
    public List<ApplicationEntity> getApplications() {
        return applications;
    }
    
    public void setApplications(List<ApplicationEntity> applications) {
        this.applications = applications;
    }
}
