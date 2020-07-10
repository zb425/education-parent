package com.education.controller;

import com.education.pojo.TZbUser;
import com.education.service.LoginService;
import com.education.service.UserService;
import com.education.util.JsonUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.File;

@Controller
public class LoginController {

    @Autowired
    private LoginService loginService;
    @Autowired
    private UserService userService;

    @RequestMapping("/index")
    public ModelAndView indexUser(){
        ModelAndView modelAndView=new ModelAndView("/login");
        return modelAndView;
    }

    @RequestMapping("/mainIndex")
    public ModelAndView mainIndex(){
        ModelAndView modelAndView=new ModelAndView("/index");
        return modelAndView;
    }

    @RequestMapping(value = "/login",method = RequestMethod.POST)
    @ResponseBody
    public String loginUser(@RequestParam(value = "username",defaultValue = "") String username, @RequestParam(value = "password",defaultValue = "") String password, HttpServletRequest request){
        TZbUser user=loginService.getUser(username,password);
        if(user!=null){
            request.getSession().setAttribute("username",username);
            request.getSession().setAttribute("wegith",user.getZbWeight());
            return JsonUtils.objectToJson(1);
        }
        return JsonUtils.objectToJson(0);
    }

    @RequestMapping("/loginOut")
    @ResponseBody
    public String loginOutUser(HttpServletRequest request, HttpServletResponse response) throws  Exception{
        ModelAndView modelAndView=new ModelAndView("/login");
        HttpSession session=request.getSession();
        session.removeAttribute("username");
        return JsonUtils.objectToJson(1);
    }

    @RequestMapping(value = "/getUserToUsername",method = RequestMethod.POST,produces ={"text/html;charset=UTF-8;"})
    @ResponseBody
    public String getUserToUsername(@RequestParam("username") String username){
        TZbUser user=userService.getUserToUsername(username);
        return JsonUtils.objectToJson(user);
    }

    @RequestMapping(value = "/saveUser",method = RequestMethod.POST)
    @ResponseBody
    public String saveUser(@RequestParam(value = "file", required = false) MultipartFile file, TZbUser user, HttpServletRequest request){
        user.setZbHeader(file.getOriginalFilename());
        String path=request.getSession().getServletContext().getRealPath("upload");
        File tageFile=new File(path);
        if(!tageFile.exists()){
            tageFile.mkdirs();
        }
        tageFile=new File(path,file.getOriginalFilename());
        try {
            file.transferTo(tageFile);
        }catch (Exception e){
            e.printStackTrace();
        }
        int i=userService.updateToUser(user);
        if(i>0){
            return JsonUtils.objectToJson(1);
        }else{
            return JsonUtils.objectToJson(0);
        }
    }
}
