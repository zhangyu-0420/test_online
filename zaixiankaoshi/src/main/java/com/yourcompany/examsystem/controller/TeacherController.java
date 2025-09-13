package com.yourcompany.examsystem.controller;

import com.yourcompany.examsystem.entity.Student;
import com.yourcompany.examsystem.entity.Teacher;
import com.yourcompany.examsystem.mapper.TeacherMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/teacher")
public class TeacherController {
    @Autowired
    TeacherMapper teacherMapper;
    @PostMapping("/insert")
    public Result insert(@RequestBody Teacher teacher){
        teacherMapper.insert(teacher);
        return Result.success("添加成功");
    }
    @PostMapping("delete")
    public Result delete(@RequestParam Integer id){
        teacherMapper.deleteById(id);
        return Result.success("删除成功");
    }
    @PostMapping("/update")
    public Result update(@RequestBody Teacher teacher){
        teacherMapper.updateById(teacher);
        return Result.success("更改成功");
    }
    @PostMapping("/select")
    public Result select(@RequestParam int id){
        return Result.success("查询成功",teacherMapper.selectById(id));
    }
}
