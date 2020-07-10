package com.education.portal.controller;

import com.education.portal.service.CourseModelService;
import com.education.util.EducationResult;
import com.education.util.PagePortal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

@Controller
public class CourseModelController {

    @Autowired
    private CourseModelService courseModelService;

    @RequestMapping("courseModel")
    public String getCourseType(Model model, @RequestParam("type") String type, @RequestParam(value = "page",defaultValue = "1") Integer page, @RequestParam(value = "name" ,defaultValue = "") String name, HttpServletRequest request){
        String json=courseModelService.getCourseType(type,page);
        EducationResult educationResult= EducationResult.formatToPojo(json, PagePortal.class);
        PagePortal pagePortal=(PagePortal) educationResult.getData();
        model.addAttribute("courseType",pagePortal);
        if(!name.equals("")){
            try {
                name=new String(name.getBytes("ISO-8859-1"),"utf-8");
            }catch (Exception e){
                e.printStackTrace();
            }
            request.getSession().setAttribute("name",name);
        }
        return "coursemodel/modelShow";
    }
}
