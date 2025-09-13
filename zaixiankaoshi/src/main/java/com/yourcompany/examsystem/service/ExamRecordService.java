package com.yourcompany.examsystem.service;

import com.yourcompany.examsystem.entity.ExamRecord;

public interface ExamRecordService {
    public ExamRecord selectExamRecord(int examPaperId, int studentId);
}
