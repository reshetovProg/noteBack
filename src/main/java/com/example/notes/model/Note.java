package com.example.notes.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
import org.springframework.data.annotation.CreatedDate;

import java.util.Date;

@Entity
@Data
public class Note {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    Long id;
    String title;
    String text;
    @CreatedDate
    Date date;
}
