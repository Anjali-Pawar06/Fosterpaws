package com.example.fosterpaws.repository;

import com.example.fosterpaws.model.PetRequest;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PetRequestRepository extends JpaRepository<PetRequest, Long> {
}