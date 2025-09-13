package com.yourcompany.examsystem.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.yourcompany.examsystem.entity.ExamPaper;
import com.yourcompany.examsystem.entity.ExamRecord;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface ExamRecordMapper extends BaseMapper<ExamRecord> {
    @Select("SELECT * FROM exam_record " +
            "WHERE exam_paper_id = #{examPaperId} " +
            "AND student_id = #{studentId}")
    ExamRecord selectByExamIdAndStudentId(
            @Param("examPaperId") int examPaperId,
            @Param("studentId") int studentId);
}
