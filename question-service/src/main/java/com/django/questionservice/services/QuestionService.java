package com.django.questionservice.services;

import com.django.questionservice.entities.Question;
import com.django.questionservice.entities.QuestionWrapper;
import com.django.questionservice.entities.Response;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface QuestionService {

    ResponseEntity<List<Question>>getAllQuestions();

    ResponseEntity<List<Question>> getQuestionsByCategory(String category);

    ResponseEntity<String> addQuestion(Question question);

    ResponseEntity<List<Integer>> getQuestionsForQuiz(String categoryName, Integer numQuestions);

    ResponseEntity<List<QuestionWrapper>>getQuestionsFromId(List<Integer> questionsIds);

    ResponseEntity<Integer> getScore(List<Response> responses);
}
