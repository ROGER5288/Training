package com.capgemini.training.entity;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "application")
public class ApplicationEntity {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @ManyToOne
    @JoinColumn(name = "job_id", nullable = false)
    private JobEntity job;
    
    @ManyToOne
    @JoinColumn(name = "job_seeker_id", nullable = false)
    private JobSeekerEntity jobSeeker;
    
    @Column(nullable = false)
    private LocalDateTime appliedDate;
    
    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private ApplicationStatus status = ApplicationStatus.APPLIED;
    
    public ApplicationEntity() {
    }
    
    public ApplicationEntity(JobEntity job, JobSeekerEntity jobSeeker) {
        this.job = job;
        this.jobSeeker = jobSeeker;
        this.appliedDate = LocalDateTime.now();
        this.status = ApplicationStatus.APPLIED;
    }
    
    public Long getId() {
        return id;
    }
    
    public void setId(Long id) {
        this.id = id;
    }
    
    public JobEntity getJob() {
        return job;
    }
    
    public void setJob(JobEntity job) {
        this.job = job;
    }
    
    public JobSeekerEntity getJobSeeker() {
        return jobSeeker;
    }
    
    public void setJobSeeker(JobSeekerEntity jobSeeker) {
        this.jobSeeker = jobSeeker;
    }
    
    public LocalDateTime getAppliedDate() {
        return appliedDate;
    }
    
    public void setAppliedDate(LocalDateTime appliedDate) {
        this.appliedDate = appliedDate;
    }
    
    public ApplicationStatus getStatus() {
        return status;
    }
    
    public void setStatus(ApplicationStatus status) {
        this.status = status;
    }
}
