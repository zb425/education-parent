package com.education.controller;

import com.education.pojo.TZbUser;
import com.education.service.UserService;
import com.education.util.JsonUtils;
import com.education.util.PageInfoShow;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.io.File;

@Controller
@RequestMapping("/course")
public class UserCRUDController {

    private final static Integer rows=20;
    @Autowired
    private UserService userService;

    //获取所有的教师
    @RequestMapping("/userPageList")
    public ModelAndView showUser(@RequestParam("page") Integer page,@RequestParam("username") String username,@RequestParam("status") Integer status){
        ModelAndView modelAndView=new ModelAndView("/user/userPageList");
        PageInfoShow pageInfoShow=userService.getAllUser(page,rows,username,status);
        modelAndView.addObject("userPage",pageInfoShow);
        return modelAndView;
    }

    @RequestMapping(value = "getById",method = RequestMethod.POST,produces ={"text/html;charset=UTF-8;"})
    @ResponseBody
    public String userID(@RequestParam("id") Integer id){
        TZbUser user=userService.getUserID(id);
        return JsonUtils.objectToJson(user);
    }

    @RequestMapping("/doMerge")
    @ResponseBody
    public String doMerge(TZbUser user){
        int i=userService.updateUser(user);
        if(i>0){
            return JsonUtils.objectToJson(0);
        }
        return JsonUtils.objectToJson(1);
    }

    @RequestMapping(value = "/deleteById",method = RequestMethod.POST)
    @ResponseBody
    public String deleteUser(@RequestParam("id") Integer id){
        int i=userService.deleteUser(id);
        if(i>0){
            return  JsonUtils.objectToJson(1);
        }
        return JsonUtils.objectToJson(0);
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
        int i=userService.saveUser(user);
        if(i>0){
            return  JsonUtils.objectToJson(1);
        }
        return JsonUtils.objectToJson(0);
    }
}
