package com.hyo.hyoapp;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.Optional;
import java.time.LocalDateTime;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.*;
import org.springframework.boot.test.context.SpringBootTest;

import com.hyo.hyoapp.hyoapp.answer.Answer;
import com.hyo.hyoapp.hyoapp.answer.AnswerRepository;
import com.hyo.hyoapp.hyoapp.question.QuestionRepository;

@SpringBootTest
class HyoappApplicationTests {

	@Autowired
	private QuestionRepository questionRepository;

	@Autowired
    private AnswerRepository answerRepository;

    @Test
    void testJpa() {
        Optional<Answer> oa = this.answerRepository.findById(1);
        assertTrue(oa.isPresent());
        Answer a = oa.get();
        assertEquals(2, a.getQuestion().getId());
	}


}
