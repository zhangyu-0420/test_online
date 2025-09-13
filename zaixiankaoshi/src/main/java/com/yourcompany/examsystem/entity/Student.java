package com.yourcompany.examsystem.entity;


import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.security.Timestamp;
import java.time.LocalDateTime;

@TableName("student_info")
@Data
@NoArgsConstructor
public class Student {
    @TableId(type = IdType.AUTO)
    private int id;

    @JsonProperty("userId")
    private int userId;

    @JsonProperty("studentId")
    private String studentId;

    @JsonProperty("selectedCourses")
    private String selectedCourses;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonProperty("createdTime")
    private LocalDateTime createdTime;

}
