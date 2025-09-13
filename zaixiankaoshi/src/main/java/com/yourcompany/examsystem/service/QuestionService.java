package com.yourcompany.examsystem.service;

import com.yourcompany.examsystem.entity.Question;
import com.yourcompany.examsystem.mapper.QuestionMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Service
public class QuestionService {
    @Autowired
    private QuestionMapper questionMapper;

    public List<Question> getQuestionsByExamId(int examId) {
        return questionMapper.selectByExamPaperId(examId);
    }
}
