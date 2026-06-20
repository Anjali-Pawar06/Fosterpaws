package com.example.fosterpaws.repository;

import com.example.fosterpaws.model.FosterApplication;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface FosterApplicationRepository extends JpaRepository<FosterApplication, Long> {
    List<FosterApplication> findByRequestId(Long requestId);
    List<FosterApplication> findByFosterId(Long fosterId);
}