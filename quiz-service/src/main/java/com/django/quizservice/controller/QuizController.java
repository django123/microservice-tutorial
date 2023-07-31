package com.django.quizservice.controller;

import com.django.quizservice.models.QuestionWrapper;
import com.django.quizservice.models.QuizDto;
import com.django.quizservice.models.Response;
import com.django.quizservice.services.QuizService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("quiz")
public class QuizController implements QuizApi{

    private final QuizService quizService;

    public QuizController(QuizService quizService) {
        this.quizService = quizService;
    }

    @Override
    public ResponseEntity<String> createQuiz(QuizDto quizDto) {
        return quizService.createQuiz(quizDto.getCategoryName(), quizDto.getNumQuestions(), quizDto.getTitle());
    }

    @Override
    public ResponseEntity<List<QuestionWrapper>> getQuizQuestions(Integer id) {
        return quizService.getQuizQuestions(id);
    }

    @Override
    public ResponseEntity<Integer> submitQuiz(Integer id, List<Response> responses) {
        return quizService.calculateResult(id, responses);
    }
}
