package com.example.demo.survey;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface QuizRepository extends JpaRepository<Quiz, Integer> {


    @Query(value = "SELECT * FROM survey s WHERE s.category=:category ORDER BY RANDOM() LIMIT :numQ", nativeQuery = true)
    List<Survey> findRandomQuestionsByCategory(String category, int numQ);
}
