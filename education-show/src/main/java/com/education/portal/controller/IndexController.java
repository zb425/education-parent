package com.education.portal.controller;

import com.education.pojo.*;
import com.education.portal.service.ContentService;
import com.education.util.EducationResult;
import com.education.util.JsonUtils;
import com.education.util.PagePortal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class IndexController {

    @Autowired
    private ContentService contentService;

    @RequestMapping("/index")
    public String showIndex(Model model){
        String json=contentService.getCourseList();
      //  System.out.println(json+"---------");
        EducationResult educationResult= EducationResult.formatToList(json, TZbCoursetype.class);
        List<TZbCoursetype> list=(List<TZbCoursetype>)educationResult.getData();
        model.addAttribute("course",list);

        String json1=contentService.getCourseIndexList();
        EducationResult educationResult1= EducationResult.formatToList(json1, TZbCourse.class);
        List<TZbCourse> list1=(List<TZbCourse>)educationResult1.getData();
        model.addAttribute("indexCourse",list1);

        String json2=contentService.getHomeroundList();
        EducationResult educationResult2= EducationResult.formatToList(json2, TZbHomeround.class);
        List<TZbHomeround> homerounds=(List<TZbHomeround>)educationResult2.getData();
        model.addAttribute("home",homerounds);
        return "index";
    }


    @RequestMapping("/courses/index")
    public String showCourseIndex(Model model, @RequestParam("type") String type, @RequestParam("page") String page){
        String json=contentService.getCourseTypeList(type,page);
        EducationResult educationResult= EducationResult.formatToPojo(json, PagePortal.class);
        PagePortal pagePortal=(PagePortal) educationResult.getData();
        model.addAttribute("courseType",pagePortal);

        String json1=contentService.getIsCourseList();
        EducationResult educationResult1= EducationResult.formatToList(json1, TZbCoursetype.class);
        List<TZbCoursetype> list1=(List<TZbCoursetype>)educationResult1.getData();
        model.addAttribute("isCourse",list1);
        return "courses/index";
    }

    @RequestMapping("/courses/show")
    public String showCourseSection(Model model,@RequestParam("cid") Integer cid,@RequestParam("count") Integer count,@RequestParam("cuname") String cuname,@RequestParam("tuser") String tuser){
        String json=contentService.getCourseSectionID(cid);
        EducationResult educationResult= EducationResult.formatToList(json, TZbCourseSection.class);
        List<TZbCourseSection> list=(List<TZbCourseSection>)educationResult.getData();

        String json1=contentService.getCourseCommentList(cid);
        EducationResult educationResult1= EducationResult.formatToList(json1, TZbCourseComment.class);
        List<TZbCourseComment> list1=(List<TZbCourseComment>)educationResult1.getData();

        try {
            //cuname=new String(cuname.getBytes("ISO-8859-1"),"utf-8");
            //tuser=new String(tuser.getBytes("ISO-8859-1"),"utf-8");
        }catch (Exception e){
            e.printStackTrace();
        }

        String json2=contentService.getUser(tuser);
        EducationResult educationResult2= EducationResult.formatToPojo(json2, TZbUser.class);
        TZbUser user=(TZbUser)educationResult2.getData();

        String json3=contentService.getTeacherSum(tuser);
        EducationResult educationResult3= EducationResult.format(json3);
        int sum=(int)educationResult3.getData();

        String json4=contentService.getCourseID(cid);
        EducationResult educationResult4= EducationResult.formatToPojo(json4, TZbCourse.class);
        TZbCourse course=(TZbCourse) educationResult4.getData();

        model.addAttribute("courseShow",list);
        model.addAttribute("count",count);
        model.addAttribute("cuname",cuname);
        model.addAttribute("courseComment",list1);
        model.addAttribute("tuser",user);
        model.addAttribute("sum",sum);
        model.addAttribute("course",course);
        return "courses/show";
    }

    @RequestMapping(value = "/courses/comment",method = RequestMethod.POST)
    @ResponseBody
    public String insertComment(@RequestParam("pCourseId") Integer pCourseId,@RequestParam("cid") Integer cid,@RequestParam("content") String content,@RequestParam("username") String username){
        String json=contentService.insertCourseComment(pCourseId,cid,content,username);
        if(json!=null){
            return JsonUtils.objectToJson(1);
        }
      return JsonUtils.objectToJson(0);
    }

}
