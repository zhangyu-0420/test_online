package com.yourcompany.examsystem.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;

@TableName("exam_record")
@Data
@NoArgsConstructor
public class ExamRecord {
    @TableId(type = IdType.AUTO)
    private int id;
    private int studentId;
    private int examPaperId;
    private int score;
    private Timestamp startTime;
    private Timestamp endTime;
    private String status;
    private int timeUsed;
    private Boolean RetakeStatus;
    private String ExamRetakeInfo;
}
