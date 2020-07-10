package com.education.controller;

import com.education.pojo.TZbHomeround;
import com.education.service.HomeService;
import com.education.util.JsonUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.util.List;

@Controller
@RequestMapping("/homeimages")
public class HomeController {
    @Autowired
    private HomeService homeService;

    @RequestMapping("/main")
    public String getHomeList(Model model){
        List<TZbHomeround> homerounds=homeService.getHmoeroundList();
        model.addAttribute("home",homerounds);
        return "homeimages/main";
    }

    @RequestMapping(value = "/saveHomeImages",method = RequestMethod.POST)
    @ResponseBody
    public String saveHomeImages(@RequestParam(value = "file", required = false) MultipartFile file, TZbHomeround homeround, HttpServletRequest request){
        homeround.setZbPicture(file.getOriginalFilename());
        homeround.setZbUrl(file.getContentType());
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

        int i=homeService.saveHomeImages(homeround);
        if(i>0){
            return JsonUtils.objectToJson(1);
        }
       return  JsonUtils.objectToJson(0);
    }

    @RequestMapping(value = "/deleteHomeImages",method = RequestMethod.POST)
    @ResponseBody
    public String deleteHomeImages(@RequestParam("id") Integer id){
       int i=homeService.deleteHomeImages(id);
       if(i>0){
           return JsonUtils.objectToJson(1);
       }
       return JsonUtils.objectToJson(0);
    }
}
