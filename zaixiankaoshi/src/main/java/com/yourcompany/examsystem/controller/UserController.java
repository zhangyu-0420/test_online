package com.yourcompany.examsystem.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.yourcompany.examsystem.entity.User;
import com.yourcompany.examsystem.mapper.StudentMapper;
import com.yourcompany.examsystem.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserMapper userMapper;

    @Autowired
    StudentMapper studentMapper;

    @PostMapping("/login")
    public Result login(@RequestBody User user){
        User dbUser = userMapper.selectOne(
                new QueryWrapper<User>().eq("username", user.getUsername())
        );
        if(dbUser == null){
            return Result.error("用户名不存在");
        }
        if(!dbUser.getPassword().equals(user.getPassword())){
            return Result.error("密码错误");
        }
        return Result.success("登陆成功",dbUser);
    }

    @PostMapping("/insert")
    public Result insert(@RequestBody User user){
        userMapper.insert(user);
        return Result.success("添加成功");
    }

    @GetMapping("/delete")
    public Result deleteById(@RequestParam int id){
        userMapper.deleteById(id);
        return Result.success("删除成功");
    }

    @GetMapping("/select")
    public Result selectById(@RequestParam int id) {
        User dbUser = userMapper.selectById(id);
        return Result.success("查询成功", dbUser);
    }

    @PostMapping("/update")
    public Result updateById(@RequestBody User user){
        userMapper.updateById(user);
        return Result.success("更改成功");
    }
}
