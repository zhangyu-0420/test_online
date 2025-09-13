package com.yourcompany.examsystem.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.yourcompany.examsystem.entity.Student;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface StudentMapper extends BaseMapper<Student> {

}
