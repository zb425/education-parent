package com.education.controller;

import com.education.pojo.TZbCoursetype;
import com.education.service.CourseTypeService;
import com.education.util.JsonUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/classify")
public class courseTypeController {

    @Autowired
    private CourseTypeService courseTypeService;

    @RequestMapping("/index")
    public ModelAndView indexCourseType(){
        ModelAndView modelAndView=new ModelAndView("classify/classifyIndex");
        List<TZbCoursetype> list=courseTypeService.selectAllCourseType();
        modelAndView.addObject("courseType",list);
        return modelAndView;
    }

    @RequestMapping("/saveCourseType")
    @ResponseBody
    public String saveCourseType(TZbCoursetype coursetype){
        int i=courseTypeService.saveCourseType(coursetype);
        if(i>0){
            return JsonUtils.objectToJson(1);
        }else{
            return  JsonUtils.objectToJson(0);
        }
    }

    @RequestMapping(value = "/getById",method = RequestMethod.POST,produces ={"text/html;charset=UTF-8;"})
    @ResponseBody
    public String getCourseTypeById(@RequestParam("id") Integer id){
        TZbCoursetype coursetype=courseTypeService.getCourseTypeById(id);
        return JsonUtils.objectToJson(coursetype);
    }

    @RequestMapping(value = "/saveCourse",method = RequestMethod.POST)
    @ResponseBody
    public String saveCourse(TZbCoursetype coursetype){
       int i=courseTypeService.updateCourseType(coursetype);
        if(1>0){
            return JsonUtils.objectToJson(1);
        }
        else{
            return JsonUtils.objectToJson(0);
        }
    }

    @RequestMapping(value = "/deleteLogic",method = RequestMethod.POST)
    @ResponseBody
     public String deleteLogic(@RequestParam("id") Integer id){
        int i=courseTypeService.deleteCourseType(id);
        if(i>0){
            return JsonUtils.objectToJson(1);

        }else{
            return JsonUtils.objectToJson(0);
        }
    }
}
