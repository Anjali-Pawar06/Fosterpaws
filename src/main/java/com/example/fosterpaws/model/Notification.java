package com.example.fosterpaws.model;

import jakarta.persistence.*;

@Entity
@Table(name="notifications")
public class Notification {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;

    private Integer userId;

    private String message;

    public Notification(){}

    public Notification(
            Integer userId,
            String message
    ){
        this.userId=userId;
        this.message=message;
    }

    public Long getId(){
        return id;
    }

    public Integer getUserId(){
        return userId;
    }

    public void setUserId(Integer userId){
        this.userId=userId;
    }

    public String getMessage(){
        return message;
    }

    public void setMessage(String message){
        this.message=message;
    }

}