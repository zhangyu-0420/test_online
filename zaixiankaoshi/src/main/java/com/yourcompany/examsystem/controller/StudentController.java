package com.yourcompany.examsystem.controller;

import com.yourcompany.examsystem.entity.Student;
import com.yourcompany.examsystem.mapper.StudentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/student")
public class StudentController {
    @Autowired
    StudentMapper studentMapper;

    @PostMapping("/insert")
    public Result insert(@RequestBody Student student){
        studentMapper.insert(student);
        return Result.success("添加成功");
    }

    @PostMapping("/select")
    public Result select(@RequestParam int id){
        Student dbstudent = studentMapper.selectById(id);
        return Result.success("查询成功",dbstudent);
    }

    @PostMapping("/delete")
    public Result delete(@RequestParam int id){
        studentMapper.deleteById(id);
        return Result.success("删除成功");
    }

    @PostMapping("/update")
    public Result update(@RequestBody Student student){
        studentMapper.updateById(student);
        return Result.success("更改成功");
    }
}
