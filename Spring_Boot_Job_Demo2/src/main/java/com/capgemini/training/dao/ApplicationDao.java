package com.capgemini.training.dao;

import com.capgemini.training.entity.ApplicationEntity;
import com.capgemini.training.entity.ApplicationStatus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ApplicationDao extends JpaRepository<ApplicationEntity, Long> {
    List<ApplicationEntity> findByJobSeekerId(Long jobSeekerId);
    List<ApplicationEntity> findByJobId(Long jobId);
    Optional<ApplicationEntity> findByJobIdAndJobSeekerIdAndStatus(Long jobId, Long jobSeekerId, ApplicationStatus status);
}
