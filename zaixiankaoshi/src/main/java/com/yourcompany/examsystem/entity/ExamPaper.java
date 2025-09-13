package com.yourcompany.examsystem.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;
import java.util.List;

@TableName("exam_paper")
@Data
@NoArgsConstructor
public class ExamPaper {
    @TableId(type = IdType.AUTO)
    private int id;
    private int teacherId;
    private String courseName;
    private String title;
    private int totalScore;
    private int timeLimit;
    private String status;
    private Timestamp createdTime;
    private Timestamp updatedTime;
}
