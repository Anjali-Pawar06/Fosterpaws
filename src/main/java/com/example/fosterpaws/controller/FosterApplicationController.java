package com.example.fosterpaws.controller;

import com.example.fosterpaws.model.FosterApplication;
import com.example.fosterpaws.repository.FosterApplicationRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/applications")
@CrossOrigin
public class FosterApplicationController {

    @Autowired
    private FosterApplicationRepository repo;

    @GetMapping
    public List<FosterApplication> getAll() {
        return repo.findAll();
    }

    @GetMapping("/request/{requestId}")
    public List<FosterApplication> byRequest(
            @PathVariable Long requestId
    ){
        return repo.findByRequestId(requestId);
    }

    @GetMapping("/foster/{fosterId}")
    public List<FosterApplication> byFoster(
            @PathVariable Long fosterId
    ){
        return repo.findByFosterId(fosterId);
    }

    @PostMapping
    public FosterApplication apply(
            @RequestBody FosterApplication app
    ){

        app.setStatus("PENDING");

        return repo.save(app);
    }

    // ACCEPT
    @PutMapping("/{id}/accept")
    public FosterApplication accept(
            @PathVariable Long id,
            @RequestBody FosterApplication updated
    ){

        FosterApplication app =
                repo.findById(id).orElseThrow();

        app.setStatus("ACCEPTED");

        app.setOwnerContact(
                updated.getOwnerContact()
        );

        app.setOwnerMessage(
                updated.getOwnerMessage()
        );

        return repo.save(app);
    }

    // REJECT
    @PutMapping("/{id}/reject")
    public FosterApplication reject(
            @PathVariable Long id
    ){

        FosterApplication app =
                repo.findById(id).orElseThrow();

        app.setStatus("REJECTED");

        return repo.save(app);
    }

}