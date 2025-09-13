package com.yourcompany.examsystem;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.yourcompany.examsystem.mapper")
public class OnlineExamApplication {
    public static void main(String[] args) {
        SpringApplication.run(OnlineExamApplication.class, args);
    }
}
