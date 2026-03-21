package com.capgemini.training.dao;

import com.capgemini.training.entity.EmployerEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface EmployerDao extends JpaRepository<EmployerEntity, Long> {
    Optional<EmployerEntity> findByEmail(String email);
}
