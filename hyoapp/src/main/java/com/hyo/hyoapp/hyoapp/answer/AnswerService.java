package com.hyo.hyoapp.hyoapp.answer;

import org.springframework.stereotype.Service;

import com.hyo.hyoapp.hyoapp.question.Question;
import com.hyo.hyoapp.hyoapp.user.SiteUser;

import lombok.RequiredArgsConstructor;

import java.time.LocalDateTime;

@RequiredArgsConstructor
@Service
public class AnswerService {
    private final AnswerRepository answerRepository;

    public Answer create(Question question, String content, SiteUser author){
        Answer answer = new Answer();
        answer.setContent(content);
        answer.setCreateDate(LocalDateTime.now());
        answer.setQuestion(question);
        answer.setAuthor(author);
        this.answerRepository.save(answer);
        return answer;
    }


}
