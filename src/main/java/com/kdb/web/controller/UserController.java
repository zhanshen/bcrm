package com.kdb.web.controller;

import com.kdb.mapper.UserMapper;
import com.kdb.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

@Controller
public class UserController {
    @Resource
    private UserMapper userMapper;

    @RequestMapping("/user")
    public String getUser(ModelMap modelMap){

        User user = userMapper.findById(1);

        modelMap.put("user", user);

        return "user";
    }
}
