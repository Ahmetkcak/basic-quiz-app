package com.quiz.services;

import com.quiz.entities.Quiz;

import java.util.List;

public interface QuizService {
    Quiz create(Quiz quiz);
    List<Quiz> get();
    Quiz get(int id);
}
