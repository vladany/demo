package com.example.demo.survey;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/quiz")
public class QuizController {

    @Autowired
    QuizService quizService;

    @PostMapping("/create")
    public ResponseEntity<String> createQuiz(@RequestParam String category, @RequestParam int numQ, @RequestParam String title) {
       // return new ResponseEntity<>("Im here", HttpStatus.OK);
        return quizService.createQuiz(category, numQ, title);
    }
    // RequestParam: what do I write in the uri comes here
    // PathVariable: Where to search in program/code for

    @GetMapping("/get/{id}")
    public ResponseEntity<Optional<Quiz>> getSurveyQuestions(@PathVariable Integer id) {
        // return new ResponseEntity<>("Im here", HttpStatus.OK);
        return quizService.getQuizById(id);
    }

    @PostMapping("submit/{id]")
    public ResponseEntity<Integer> submitQuiz(@PathVariable Integer id, @RequestBody List<Response> responses) {
       return quizService.calculateResult(id, responses);
    }
}
