package com.symund.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class StudentController {

    @RequestMapping("/welcome")
    public String homepage(Model model){

        model.addAttribute("name","Cydeo");
        model.addAttribute("course","MVC");

        return "student/welcome";
    }

    @RequestMapping("/ziya")
    public String homepage2(Model model){


        return "student/welcome";
    }
}
