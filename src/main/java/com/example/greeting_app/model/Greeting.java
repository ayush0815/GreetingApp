package com.example.greeting_app.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class Greeting {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String message;

}

