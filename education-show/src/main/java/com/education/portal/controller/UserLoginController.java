package com.education.portal.controller;

import com.education.pojo.TZbStudentUser;
import com.education.pojo.TZbUser;
import com.education.portal.service.UserLoginService;
import com.education.util.EducationResult;
import com.education.util.JsonUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.net.URLEncoder;
import java.util.List;

@Controller
public class UserLoginController {
    @Autowired
    private UserLoginService userLoginService;

    @RequestMapping(value = "/courses/login",method = RequestMethod.POST)
    @ResponseBody
    public String getUserLogin(@RequestParam("username") String username, @RequestParam("password") String password,@RequestParam("remember") String remember, HttpServletRequest request,HttpServletResponse response){

        String json=userLoginService.getUserLogin(username,password);
        int id=username.indexOf("@");
        if(id>0){
            EducationResult educationResult= EducationResult.formatToList(json, TZbStudentUser.class);
            List<TZbStudentUser> list=(List<TZbStudentUser>)educationResult.getData();
            if(list.size()>0){
                try {
                    if(remember.equals("y")){
                        Cookie cookie=new Cookie("username",URLEncoder.encode(list.get(0).getZbStudentEmail(),"utf-8"));
                        cookie.setMaxAge(24*60*60);
                        cookie.setPath("/");
                        response.addCookie(cookie);
                    }
                    HttpSession session=request.getSession();
                    session.setAttribute("username",list.get(0).getZbStudentEmail());
                    session.setMaxInactiveInterval(24*60*60);
                    return JsonUtils.objectToJson(1);
                }catch (Exception e){
                    e.printStackTrace();
                    return JsonUtils.objectToJson(0);
                }
            }else{
                return JsonUtils.objectToJson(0);
            }
        }else{
            EducationResult educationResult= EducationResult.formatToList(json, TZbUser.class);
            List<TZbUser> list=(List<TZbUser>)educationResult.getData();
            if(list.size()>0){
                try {
                    if(remember.equals("y")){
                        Cookie cookie=new Cookie("username",URLEncoder.encode(list.get(0).getZbRealname(),"utf-8"));
                        cookie.setMaxAge(24*60*60);
                        cookie.setPath("/");
                        response.addCookie(cookie);
                    }
                    HttpSession session=request.getSession();
                    session.setAttribute("username",list.get(0).getZbRealname());
                    session.setMaxInactiveInterval(24*60*60);
                    return JsonUtils.objectToJson(1);
                }catch (Exception e){
                    e.printStackTrace();
                    return JsonUtils.objectToJson(0);
                }
            }else{
                return JsonUtils.objectToJson(0);
            }
        }

    }


    @RequestMapping(value = "/courses/studentRegister",method = RequestMethod.POST)
    @ResponseBody
    public String insertStudentUser(TZbStudentUser studentUser){
        String json=userLoginService.insertStudent(studentUser.getZbStudentEmail(),studentUser.getZbStudentPhone(),studentUser.getZbPassword());
        EducationResult educationResult= EducationResult.format(json);
        int i=(int)educationResult.getData();
        if(i>0){
            return JsonUtils.objectToJson(1);
        }else{
            return JsonUtils.objectToJson(0);
        }
    }

    @RequestMapping(value = "/tuichuStudent",method = RequestMethod.POST)
    @ResponseBody
    public String tuichuStudent(HttpServletResponse response,HttpServletRequest request){
        Cookie newCookie=new Cookie("username",null);
        newCookie.setMaxAge(0);
        newCookie.setPath("/");
        response.addCookie(newCookie);

        HttpSession session=request.getSession();
        session.removeAttribute("username");

        return JsonUtils.objectToJson(1);
    }

    @RequestMapping(value = "/studentPassword",method = RequestMethod.POST)
    @ResponseBody
    public String studentPassword(@RequestParam("email") String email){
        String json=userLoginService.getStudentEmail(email);
        EducationResult educationResult= EducationResult.format(json);
        int i=(int) educationResult.getData();
        if(i>0){
            return JsonUtils.objectToJson(1);
        }
        return JsonUtils.objectToJson(0);
    }

    @RequestMapping(value = "/updatePassword",method = RequestMethod.POST)
    @ResponseBody
    public String updatePassword(@RequestParam("phone") String phone,@RequestParam("password") String password){
        String json=userLoginService.updateStudentPassword(phone,password);
        EducationResult educationResult= EducationResult.format(json);
        int i=(int) educationResult.getData();
        if(i>0){
            return JsonUtils.objectToJson(1);
        }
        return JsonUtils.objectToJson(0);
    }
}
