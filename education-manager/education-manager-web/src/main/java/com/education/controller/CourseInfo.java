package com.education.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/course")
public class CourseInfo {

    @RequestMapping("/pagelist")
    public String showCourse(){
        return "pagelist";
    }
}
