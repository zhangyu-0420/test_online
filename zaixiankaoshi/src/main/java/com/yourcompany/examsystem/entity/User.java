package com.yourcompany.examsystem.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;

@Data
@NoArgsConstructor
@TableName("user_table")
public class User {
    @TableId(type = IdType.AUTO)
    private int id;

    private String username;
    private String password;
    private String role;
    private String name;
    private String gender;
    private int phone;
    private String college;
    private Timestamp createdTime;
}
