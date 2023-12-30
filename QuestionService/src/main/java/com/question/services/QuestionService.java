package com.question.services;

import com.question.entities.Question;

import java.util.List;

public interface QuestionService {

    Question create(Question question);
    List<Question> get();
    Question get(int id);

    List<Question> getQuestionsOfQuiz(int quizId);

}
