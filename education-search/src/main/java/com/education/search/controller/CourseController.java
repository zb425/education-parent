package com.education.search.controller;

import com.education.search.service.CourseService;
import com.education.util.EducationResult;
import org.apache.commons.lang3.exception.ExceptionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class CourseController {
    @Autowired
    private CourseService courseService;


    @RequestMapping("/importall")
    @ResponseBody
    public EducationResult importAll() {
        try {
            EducationResult result=courseService.importCourse();
            return result;
        } catch (Exception e) {
            e.printStackTrace();
            return EducationResult.build(500, ExceptionUtils.getStackTrace(e));
        }
    }

    @RequestMapping("/synCourse")
    @ResponseBody
    public EducationResult synCourse(){
        try {
            EducationResult result=courseService.synCourse();
            return result;
        }catch (Exception e){
            e.printStackTrace();
            return EducationResult.build(500, ExceptionUtils.getStackTrace(e));
        }
    }
}
