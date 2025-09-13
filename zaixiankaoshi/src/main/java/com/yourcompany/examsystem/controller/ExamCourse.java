package com.yourcompany.examsystem.controller;

import com.yourcompany.examsystem.entity.Question;
import com.yourcompany.examsystem.mapper.QuestionMapper;
import com.yourcompany.examsystem.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/teacher/course")
public class ExamCourse {
    @Autowired
    QuestionService questionService;
    @Autowired
            QuestionMapper questionMapper;
    List<Question> questions;
    @GetMapping("/show")
    public Result showExamPaper(@RequestParam int examId){
        questions=questionService.getQuestionsByExamId(examId);
        return Result.success("展示试卷题目",questions);
    }
    @PostMapping("/update")
    public Result updateQuestion(@RequestBody Question question){
        questionMapper.updateById(question);
        return Result.success("题目更改成功",question);
    }
}
