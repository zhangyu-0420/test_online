package com.yourcompany.examsystem.controller;

import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.yourcompany.examsystem.entity.ExamPaper;
import com.yourcompany.examsystem.entity.ExamRecord;
import com.yourcompany.examsystem.entity.Question;
import com.yourcompany.examsystem.mapper.ExamPaperMapper;
import com.yourcompany.examsystem.service.ExamPaperService;
import com.yourcompany.examsystem.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student/exam")
public class StudentExamController {
    @Autowired
    private ExamPaperMapper examPaperMapper;
    @GetMapping("/papers")
    public Result getPapers(@RequestParam int id) {
        ExamPaper examPaper = examPaperMapper.selectById(id);
        return Result.success("获取试卷",examPaper);
    }
    @Autowired
    private QuestionService questionService;
    @GetMapping("start")
    public Result examStart(@RequestParam int studentId, @RequestParam int examId) {
        ExamPaper examPaper = examPaperMapper.selectById(examId);
        examPaper.setStatus("已开始");
        examPaperMapper.updateById(examPaper);
        List<Question> questions = questionService.getQuestionsByExamId(examId);
        return Result.success("考试已开始",questions);
    }
}
