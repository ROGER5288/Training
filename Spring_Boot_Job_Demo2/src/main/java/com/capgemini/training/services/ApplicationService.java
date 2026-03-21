package com.capgemini.training.services;

import com.capgemini.training.dao.ApplicationDao;
import com.capgemini.training.dao.JobDao;
import com.capgemini.training.entity.ApplicationEntity;
import com.capgemini.training.entity.ApplicationStatus;
import com.capgemini.training.entity.JobEntity;
import com.capgemini.training.entity.JobSeekerEntity;
import com.capgemini.training.entity.JobStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ApplicationService {
    
    @Autowired
    private ApplicationDao applicationDao;
    
    @Autowired
    private JobDao jobDao;
    
    public ApplicationEntity applyForJob(Long jobId, JobSeekerEntity jobSeeker) {
        JobEntity job = jobDao.findById(jobId).orElseThrow(() -> new RuntimeException("Job not found"));
        
        if (job.getStatus() != JobStatus.OPEN) {
            throw new RuntimeException("Job is not open");
        }
        
        // Check if job seeker has already applied with APPLIED status
        var existingApplication = applicationDao.findByJobIdAndJobSeekerIdAndStatus(jobId, jobSeeker.getId(), ApplicationStatus.APPLIED);
        if (existingApplication.isPresent()) {
            throw new RuntimeException("You have already applied for this job. Wait for employer's response or apply after rejection.");
        }
        
        ApplicationEntity application = new ApplicationEntity(job, jobSeeker);
        return applicationDao.save(application);
    }
    
    public boolean hasAppliedToJob(Long jobId, Long jobSeekerId) {
        return applicationDao.findByJobIdAndJobSeekerIdAndStatus(jobId, jobSeekerId, ApplicationStatus.APPLIED).isPresent();
    }
    
    public List<ApplicationEntity> getApplicationsByJobSeeker(Long jobSeekerId) {
        return applicationDao.findByJobSeekerId(jobSeekerId);
    }
    
    public List<ApplicationEntity> getApplicationsByJob(Long jobId) {
        return applicationDao.findByJobId(jobId);
    }
    
    public ApplicationEntity getApplicationById(Long id) {
        return applicationDao.findById(id).orElseThrow(() -> new RuntimeException("Application not found"));
    }
    
    public ApplicationEntity updateApplicationStatus(Long applicationId, ApplicationStatus status) {
        ApplicationEntity application = getApplicationById(applicationId);
        application.setStatus(status);
        return applicationDao.save(application);
    }
}
