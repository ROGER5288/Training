package com.capgemini.training.services;

import com.capgemini.training.dao.JobDao;
import com.capgemini.training.entity.EmployerEntity;
import com.capgemini.training.entity.JobEntity;
import com.capgemini.training.entity.JobStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobService {
    
    @Autowired
    private JobDao jobDao;
    
    public JobEntity postJob(String title, String description, Double salary, String location, EmployerEntity employer) {
        JobEntity job = new JobEntity(title, description, salary, location, employer);
        return jobDao.save(job);
    }
    
    public List<JobEntity> getAllJobs() {
        return jobDao.findAll();
    }
    
    public List<JobEntity> getOpenJobs() {
        return jobDao.findAll().stream()
                .filter(job -> job.getStatus() == JobStatus.OPEN)
                .toList();
    }
    
    public JobEntity getJobById(Long id) {
        return jobDao.findById(id).orElseThrow(() -> new RuntimeException("Job not found"));
    }
    
    public List<JobEntity> getJobsByEmployer(Long employerId) {
        return jobDao.findByEmployerId(employerId);
    }
    
    public List<JobEntity> searchByLocation(String location) {
        return jobDao.findByLocationContainingIgnoreCase(location);
    }
    
    public List<JobEntity> searchByTitle(String title) {
        return jobDao.findByTitleContainingIgnoreCase(title);
    }
    
    public JobEntity updateJobStatus(Long jobId, JobStatus status) {
        JobEntity job = getJobById(jobId);
        job.setStatus(status);
        return jobDao.save(job);
    }
    
    public void deleteJob(Long jobId) {
        jobDao.deleteById(jobId);
    }
}
