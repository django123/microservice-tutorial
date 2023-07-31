package com.django.quizservice.controller;

import com.django.quizservice.models.QuestionWrapper;
import com.django.quizservice.models.QuizDto;
import com.django.quizservice.models.Response;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public interface QuizApi {

    @PostMapping("/create")
    ResponseEntity<String>createQuiz(@RequestBody QuizDto quizDto);

    @PostMapping("/get/{id}")
    ResponseEntity<List<QuestionWrapper>>getQuizQuestions(@PathVariable Integer id);

    @PostMapping("/submit/{id}")
    ResponseEntity<Integer>submitQuiz(@PathVariable Integer id, @RequestBody List<Response> responses);
}
