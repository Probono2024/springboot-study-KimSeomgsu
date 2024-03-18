package com.hyo.hyoapp.hyoapp.answer;

import org.springframework.stereotype.Service;

import com.hyo.hyoapp.hyoapp.question.Question;

import lombok.RequiredArgsConstructor;

import java.time.LocalDateTime;

@RequiredArgsConstructor
@Service
public class AnswerService {
    private final AnswerRepository answerRepository;

    public void create(Question question, String content){
        Answer answer = new Answer();
        answer.setContent(content);
        answer.setCreateDate(LocalDateTime.now());
        answer.setQuestion(question);
        this.answerRepository.save(answer);
    }
}
