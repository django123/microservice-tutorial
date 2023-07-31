package com.django.questionservice.web;

import com.django.questionservice.entities.Question;
import com.django.questionservice.entities.QuestionWrapper;
import com.django.questionservice.entities.Response;
import com.django.questionservice.services.QuestionService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/questions")
public class QuestionController implements QuestionApi{

    private final QuestionService questionService;

    public QuestionController(QuestionService questionService) {
        this.questionService = questionService;
    }

    @Override
    public ResponseEntity<List<Question>> getAllQuestions() {
        return questionService.getAllQuestions();
    }

    @Override
    public ResponseEntity<List<Question>> getQuestionsByCategory(String category) {
        return questionService.getQuestionsByCategory(category);
    }

    @Override
    public ResponseEntity<String> addQuestion(Question question) {
        return questionService.addQuestion(question);
    }

    @Override
    public ResponseEntity<List<Integer>> getQuestionsForQuiz(String categoryName, Integer numQuestions) {
        return questionService.getQuestionsForQuiz(categoryName,numQuestions);
    }

    @Override
    public ResponseEntity<List<QuestionWrapper>> getQuestionsFromId(List<Integer> questionIds) {
        return questionService.getQuestionsFromId(questionIds);
    }

    @Override
    public ResponseEntity<Integer> getScore(List<Response> responses) {
        return questionService.getScore(responses);
    }
}
