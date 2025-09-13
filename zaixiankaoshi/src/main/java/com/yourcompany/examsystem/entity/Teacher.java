package com.yourcompany.examsystem.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;
import java.time.LocalDateTime;


@Data
@TableName("teacher_info")
@NoArgsConstructor
public class Teacher {
    @TableId(type = IdType.AUTO)
    private int id;
    private int userId;
    private String employeeId;
    private String teachingCourse;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonProperty("createdTime")
    private LocalDateTime createdTime;

}
