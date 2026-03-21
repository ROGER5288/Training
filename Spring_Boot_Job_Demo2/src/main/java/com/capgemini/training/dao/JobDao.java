package com.capgemini.training.dao;

import com.capgemini.training.entity.JobEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface JobDao extends JpaRepository<JobEntity, Long> {
    List<JobEntity> findByEmployerId(Long employerId);
    List<JobEntity> findByLocationContainingIgnoreCase(String location);
    List<JobEntity> findByTitleContainingIgnoreCase(String title);
}
