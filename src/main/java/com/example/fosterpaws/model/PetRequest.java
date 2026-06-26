package com.example.fosterpaws.model;

import jakarta.persistence.*;

@Entity
public class PetRequest {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String petImage;
    private String petType;
    private String breed;
    private int days;
    private String requirements;
    private String ownerName;
    private String status = "OPEN";

    // Getters & Setters
    public Long getId() { return id; }

    public String getPetType() { return petType; }
    public void setPetType(String petType) { this.petType = petType; }

    public String getBreed() { return breed; }
    public void setBreed(String breed) { this.breed = breed; }

    public int getDays() { return days; }
    public void setDays(int days) { this.days = days; }

    public String getRequirements() { return requirements; }
    public void setRequirements(String requirements) { this.requirements = requirements; }

    public String getOwnerName() { return ownerName; }
    public void setOwnerName(String ownerName) { this.ownerName = ownerName; }

    public void setStatus(String status) {
    }

    public String getPetImage() {
        return petImage;
    }

    public void setPetImage(String petImage) {
        this.petImage = petImage;
    }
}