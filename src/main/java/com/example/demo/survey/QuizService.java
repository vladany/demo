package com.example.demo.survey;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class QuizService {

    @Autowired
    QuizRepository quizRepository;


    public ResponseEntity<String> createQuiz(String category, int numQ, String title) {

        List<Survey> questions = quizRepository.findRandomQuestionsByCategory(category, numQ);
        Quiz quiz = new Quiz();
        quiz.setTitle(title);
        quiz.setSurvey(questions);
        quizRepository.save(quiz);
        return new ResponseEntity<>("Sucesss", HttpStatus.CREATED);
    }

    public ResponseEntity<Optional<Quiz>> getQuizById(Integer id) {
        Optional<Quiz> questions = quizRepository.findById(id);
        return new ResponseEntity<>(questions, HttpStatus.OK);
    }

    public ResponseEntity<Integer> calculateResult(Integer id, response) {
    Quiz quiz = quizRepository.findById(id).get();
    List<Survey> survey = quiz.getSurvey();

quizRepository.save(responses);
    }

}
