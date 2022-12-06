package com.symund.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController {

    @RequestMapping("/user")
    public String userInfo(){
        return "/user/userinfo.html"; // got to user directory and execute userinfo.html inside it
    }
}
