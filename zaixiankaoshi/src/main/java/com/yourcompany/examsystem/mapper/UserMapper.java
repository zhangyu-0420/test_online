package com.yourcompany.examsystem.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.yourcompany.examsystem.entity.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper extends BaseMapper<User> {

}
