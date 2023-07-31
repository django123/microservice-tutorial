package com.django.questionservice.web;

import com.django.questionservice.entities.Question;
import com.django.questionservice.entities.QuestionWrapper;
import com.django.questionservice.entities.Response;
import io.swagger.v3.oas.annotations.parameters.RequestBody;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Tag(name="question")
public interface QuestionApi {

    @GetMapping("/allQuestions")
    ResponseEntity<List<Question>> getAllQuestions();

    @GetMapping("/category/{category}")
    ResponseEntity<List<Question>> getQuestionsByCategory(@PathVariable String category);

    @PostMapping("/add")
    ResponseEntity<String> addQuestion(@RequestBody Question question);

    @GetMapping("/generate")
    ResponseEntity<List<Integer>> getQuestionsForQuiz
            (@RequestParam String categoryName, @RequestParam Integer numQuestions );


    @PostMapping("/getQuestions")
    ResponseEntity<List<QuestionWrapper>> getQuestionsFromId(@RequestBody List<Integer> questionIds);

    @PostMapping("/getScore")
    ResponseEntity<Integer> getScore(@RequestBody List<Response> responses);
}
