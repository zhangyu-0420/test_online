package com.yourcompany.examsystem.service;

import com.yourcompany.examsystem.entity.ExamPaper;
import com.yourcompany.examsystem.mapper.ExamPaperMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ExamPaperServiceImpl implements ExamPaperService {
    @Autowired
    ExamPaperMapper examPaperMapper;

    @Override
    public ExamPaper getById(int paperId) {
        return examPaperMapper.selectById(paperId);
    }

}
