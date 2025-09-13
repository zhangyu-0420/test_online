package com.yourcompany.examsystem.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.yourcompany.examsystem.entity.Question;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface QuestionMapper extends BaseMapper<Question> {
    @Select("SELECT * FROM question " +
            "WHERE exam_paper_id = #{examPaperId} " +
            "ORDER BY question_order ASC")
    List<Question> selectByExamPaperId(@Param("examPaperId") int examPaperId);
}
