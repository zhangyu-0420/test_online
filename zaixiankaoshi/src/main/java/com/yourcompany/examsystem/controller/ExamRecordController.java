package com.yourcompany.examsystem.controller;

import com.yourcompany.examsystem.entity.ExamRecord;
import com.yourcompany.examsystem.mapper.ExamRecordMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/teacher/exam")
public class ExamRecordController {
    @Autowired
    ExamRecordMapper examRecordMapper;
    @GetMapping("/select")
    public Result selectExamRecord(@RequestParam int examPaperId,@RequestParam int studentId) {
        ExamRecord examRecord = examRecordMapper.selectByExamIdAndStudentId(examPaperId, studentId);
        return Result.success("展示学生考试记录",examRecord);
    }
}
