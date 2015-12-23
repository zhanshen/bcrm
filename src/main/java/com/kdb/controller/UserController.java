package com.kdb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController {
    @RequestMapping("/greeting")
    public String greeting(ModelMap modelMap){
        modelMap.put("greeting", "Hello，您好！");
        return "greeting";
    }
}
