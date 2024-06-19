package com.example.demo.survey;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/questions")
public class SurveyController {
    @Autowired
    private SurveyService surveyService;

    @PostMapping("/addsurvey")
    public Survey createSurvey(@RequestBody Survey survey) {
        return surveyService.saveSurvey(survey);
    }

    @GetMapping("/allquestions")
    public List<Survey> getAllSurveys() {
        return surveyService.getAllSurveys();
    }
    @GetMapping("category/{category}")
    public List<Survey> getAllCategory(@PathVariable("category") String category) {
        return surveyService.getSurveyByCategory(category);
    }
}