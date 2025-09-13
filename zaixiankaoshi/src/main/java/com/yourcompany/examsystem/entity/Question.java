package com.yourcompany.examsystem.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;

@TableName("question")
@Data
@NoArgsConstructor
public class Question {
    @TableId(type = IdType.AUTO)
    private int id;
    private int examPaperId;
    private String questionType;
    private String content;
    private String options;
    private String standardAnswer;
    private int score;
    private int questionOrder;
}
