package com.yourcompany.examsystem.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.yourcompany.examsystem.entity.User;

public interface UserService extends IService<User> {
    User login(String username, String password);


}
