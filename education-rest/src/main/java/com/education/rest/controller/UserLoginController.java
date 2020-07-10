package com.education.rest.controller;

import com.education.rest.service.UserLoginService;
import com.education.util.EducationResult;
import org.apache.commons.lang3.exception.ExceptionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class UserLoginController {

    @Autowired
    private UserLoginService userLoginService;

    @RequestMapping("/login/{username}/{password}")
    @ResponseBody
    public EducationResult getUserLogin(@PathVariable("username") String username, @PathVariable("password") String password){
        try {
            List<?> list=userLoginService.getUser(username,password);
            return EducationResult.ok(list);
        }catch (Exception e){
            e.printStackTrace();
            return EducationResult.build(500, ExceptionUtils.getStackTrace(e));
        }
    }

    @RequestMapping("/register/{email}/{username}/{password}")
    @ResponseBody
    public EducationResult insertStudentUser(@PathVariable("email") String email, @PathVariable("username") String username, @PathVariable("password") String password){
        try {
            int i=userLoginService.insertStudentUser(email,username,password);
            return EducationResult.ok(i);
        }catch (Exception e){
            e.printStackTrace();
            return EducationResult.build(500, ExceptionUtils.getStackTrace(e));
        }
    }

    @RequestMapping("/getStudentEmail/{email}")
    @ResponseBody
    public EducationResult getStudentEmail(@PathVariable("email") String email){
        try {
           int studentUser=userLoginService.getStudentEmail(email);
           if(studentUser>0){
                return EducationResult.ok(1);
           }
            return EducationResult.ok(0);
        }catch (Exception e){
            e.printStackTrace();
            return EducationResult.build(500, ExceptionUtils.getStackTrace(e));
        }
    }


    @RequestMapping("/getStudentPassword/{phone}/{password}")
    @ResponseBody
    public EducationResult getStudentPassword(@PathVariable("phone") String phone, @PathVariable("password") String password){
        try {
            int studentUser=userLoginService.updateStudentPassword(phone,password);
            if(studentUser>0){
                return EducationResult.ok(1);
            }
            return EducationResult.ok(0);
        }catch (Exception e){
            e.printStackTrace();
            return EducationResult.build(500, ExceptionUtils.getStackTrace(e));
        }
    }
}
