package com.example.fosterpaws.controller;

import com.example.fosterpaws.model.PetRequest;
import com.example.fosterpaws.repository.PetRequestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/requests")
@CrossOrigin
public class PetRequestController {

    @Autowired
    private PetRequestRepository repo;

    @PostMapping
    public PetRequest addRequest(@RequestBody PetRequest request) {
        return repo.save(request);
    }

    @GetMapping
    public List<PetRequest> getAllRequests() {
        return repo.findAll();
    }
    // Add this inside PetRequestController
    @PatchMapping("/{id}/status")
    public PetRequest updateStatus(@PathVariable Long id, @RequestParam String status) {
        PetRequest req = repo.findById(id).orElseThrow();
        req.setStatus(status); // OPEN, FILLED, CLOSED
        return repo.save(req);
    }
}