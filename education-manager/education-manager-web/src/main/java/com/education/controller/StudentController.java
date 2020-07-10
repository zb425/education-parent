package com.education.controller;

import com.education.pojo.TZbStudentUser;
import com.education.service.StudentService;
import com.education.util.JsonUtils;
import com.education.util.PageInfoShow;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/student")
public class StudentController {

    private static  final  int rows=15;
    @Autowired
    private StudentService studentService;

    @RequestMapping("/index")
    public ModelAndView getStudentList(@RequestParam("Sname") String name, @RequestParam("page") Integer page){
        ModelAndView modelAndView=new ModelAndView("student/index");
        PageInfoShow pageInfoShow=studentService.getStudentList(page,rows,name);
        modelAndView.addObject("studentList",pageInfoShow);
        return modelAndView;
    }

    @RequestMapping("saveStudent")
    @ResponseBody
    public String saveStudent(TZbStudentUser studentUser){
        int i=studentService.saveStudent(studentUser);
        if(i>0){
            return JsonUtils.objectToJson(1);
        }else{
            return JsonUtils.objectToJson(0);
        }
    }

    @RequestMapping(value = "deleteStudent",method = RequestMethod.POST)
    @ResponseBody
    public String deleteStudent(@RequestParam("id") Integer id){
        int i=studentService.deleteStudentID(id);
        if(i>0){
            return JsonUtils.objectToJson(1);

        }else{
            return JsonUtils.objectToJson(0);
        }
    }

    @RequestMapping(value = "getStudentID",method = RequestMethod.POST)
    @ResponseBody
    public String getStudentID(@RequestParam("id") Integer id){
        TZbStudentUser studentUser=studentService.getStudentID(id);
        return JsonUtils.objectToJson(studentUser);
    }

    @RequestMapping("updateStudent")
    @ResponseBody
    public String updateStudent(TZbStudentUser studentUser){
        int i=studentService.updateStudent(studentUser);
        if(i>0){
            return JsonUtils.objectToJson(1);
        }else{
            return JsonUtils.objectToJson(0);
        }
    }
}
