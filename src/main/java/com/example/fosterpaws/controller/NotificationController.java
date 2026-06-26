package com.example.fosterpaws.controller;

import com.example.fosterpaws.model.Notification;
import com.example.fosterpaws.repository.NotificationRepository;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

@RequestMapping("/notifications")

@CrossOrigin("*")

public class NotificationController {

    @Autowired
    NotificationRepository repo;

    @GetMapping("/{userId}")
    public List<Notification> get(
            @PathVariable Integer userId
    ){

        return repo.findByUserId(
                userId
        );

    }

}