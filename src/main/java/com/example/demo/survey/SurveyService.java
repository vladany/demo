package com.example.demo.survey;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
// Component geht auch um autowired zu nutzen
@Service
public class SurveyService {

    @Autowired
    private SurveyRepository surveyRepository;

    public Survey saveSurvey(Survey survey) {
        return surveyRepository.save(survey);
    }

    public List<Survey> getAllSurveys() {
        return surveyRepository.findAll();
    }

    public List<Survey> getSurveyByCategory(String category) {
        return surveyRepository.findByCategory(category);
    }
}