package com.education.rest.controller;

import com.education.rest.service.CourseTypeService;
import com.education.util.EducationResult;
import com.education.util.PagePortal;
import org.apache.commons.lang3.exception.ExceptionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class CourseTypeController {

    private static final int rows=9;
    @Autowired
    private CourseTypeService courseTypeService;

    @RequestMapping("/getCourseType/{type}/{page}")
    @ResponseBody
    public EducationResult getCourseTypeList(@PathVariable String type, @PathVariable Integer page){
        try {
            PagePortal pageInfoShow =courseTypeService.getCourseType(type,page,rows);
            return EducationResult.ok(pageInfoShow);
        }catch (Exception e){
            e.printStackTrace();
            return EducationResult.build(500, ExceptionUtils.getStackTrace(e));
        }
    }

}
