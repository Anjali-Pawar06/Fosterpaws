package com.example.fosterpaws.model;

import jakarta.persistence.*;

@Entity
@Table(name = "foster_applications")
public class FosterApplication {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long requestId;

    private Long fosterId;

    private String experience;

    private String idProofUrl;

    private String status;

    // NEW
    private String ownerContact;

    private String ownerMessage;

    public Long getId() {
        return id;
    }

    public Long getRequestId() {
        return requestId;
    }

    public void setRequestId(Long requestId) {
        this.requestId = requestId;
    }

    public Long getFosterId() {
        return fosterId;
    }

    public void setFosterId(Long fosterId) {
        this.fosterId = fosterId;
    }

    public String getExperience() {
        return experience;
    }

    public void setExperience(String experience) {
        this.experience = experience;
    }

    public String getIdProofUrl() {
        return idProofUrl;
    }

    public void setIdProofUrl(String idProofUrl) {
        this.idProofUrl = idProofUrl;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getOwnerContact() {
        return ownerContact;
    }

    public void setOwnerContact(String ownerContact) {
        this.ownerContact = ownerContact;
    }

    public String getOwnerMessage() {
        return ownerMessage;
    }

    public void setOwnerMessage(String ownerMessage) {
        this.ownerMessage = ownerMessage;
    }
}