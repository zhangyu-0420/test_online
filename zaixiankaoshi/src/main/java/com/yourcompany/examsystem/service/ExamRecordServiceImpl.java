package com.yourcompany.examsystem.service;

import com.yourcompany.examsystem.entity.ExamRecord;
import com.yourcompany.examsystem.mapper.ExamRecordMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ExamRecordServiceImpl implements ExamRecordService {
    @Autowired
    ExamRecordMapper examRecordMapper;

    @Override
    public ExamRecord selectExamRecord(int examPaperId, int studentId) {
        return examRecordMapper.selectByExamIdAndStudentId(examPaperId, studentId);
    }
}
