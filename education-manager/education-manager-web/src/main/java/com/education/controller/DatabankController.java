package com.education.controller;

import com.education.pojo.TZbDatabank;
import com.education.service.DatabankService;
import com.education.util.JsonUtils;
import com.education.util.PagePortal;
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

@Controller
@RequestMapping("/databank")
public class DatabankController {
    private static  final  int rows=15;
    @Autowired
    private DatabankService databankService;

    @RequestMapping("/databankIndex")
    public String getDatabankList(Model model, @RequestParam("que") String que,@RequestParam(value = "page",defaultValue = "1") Integer page){
        PagePortal pagePortal =databankService.getDatabankList(que,page,rows);
        model.addAttribute("databank",pagePortal);
        return "/databank/databankIndex";
    }

    @RequestMapping(value = "/saveDatabank",method = RequestMethod.POST)
    @ResponseBody
    public String saveDatabank(@RequestParam(value = "file", required = false) MultipartFile file, @RequestParam("name")String databankName, TZbDatabank databank, HttpServletRequest request) throws  Exception{

        databank.setZbDatabankUsername(databankName);
        databank.setZbDatabankUrl(file.getOriginalFilename());
        String path=request.getSession().getServletContext().getRealPath("databank");
        File tageFile=new File(path,file.getOriginalFilename());
        if(!tageFile.exists()){
            tageFile.mkdirs();
        }

        //第一种方式
       /* Random random=new Random();
        String str=String.valueOf( System.currentTimeMillis())+random.nextInt(100);
        databank.setZbDatabankUrl(str);
        tageFile=new File(path,str);*/

        //第二种方式
        /*if(tageFile.exists()){
            String num=String.valueOf((int)(1+Math.random()*10000));
            databank.setZbDatabankUrl(num+file.getOriginalFilename());
            tageFile=new File(path,num+file.getOriginalFilename());
        }else{
            tageFile=new File(path,file.getOriginalFilename());
        }*/
        try {
            file.transferTo(tageFile);
        }catch (Exception e){
            e.printStackTrace();
        }
        int i=databankService.saveDatabank(databank);
        if(i>0){
            return JsonUtils.objectToJson(1);
        }
        return JsonUtils.objectToJson(0);
    }

    @RequestMapping(value = "/updateDatabank",method = RequestMethod.POST)
    @ResponseBody
    public String updateDatabank(@RequestParam(value = "id") Integer id){
        int i=databankService.updateDatabank(id);
       if(i>0){
            return JsonUtils.objectToJson(1);
       }
        return JsonUtils.objectToJson(0);
    }

    @RequestMapping(value = "/deleteDatabank",method = RequestMethod.POST)
    @ResponseBody
    public String deleteDatabank(@RequestParam(value = "id") Integer id,@RequestParam(value = "name") String name,HttpServletRequest request){
        int i=databankService.deleteDatabank(id);
        if(i>0){
            String path=request.getSession().getServletContext().getRealPath("databank");
            String fileName=name;
            File file=new File(path,fileName);
            if(file.exists()){
                file.delete();
            }
            return JsonUtils.objectToJson(1);
        }
        return JsonUtils.objectToJson(0);
    }
}
