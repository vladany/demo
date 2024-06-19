package com.example.demo.survey;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Data
@Entity
public class Quiz {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer Id;
    private String title;

    @ManyToMany // Viele Umfragen-Sektionen können verschiedene Fragen haben
    private List<Survey> survey;

}
