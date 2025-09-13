package com.yourcompany.examsystem.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;

@TableName("answer_detail")
@Data
@NoArgsConstructor
public class AnswerDetail {
    @TableId(type = IdType.AUTO)
    private int id;
    private int examRecordId;
    private int questionId;
    private int studentId;
    private boolean isCorrect;
    private int scoreEarnd;
}
