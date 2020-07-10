package com.education.rest.controller;

import com.education.pojo.*;
import com.education.rest.service.ContentService;
import com.education.util.EducationResult;
import com.education.util.PagePortal;
import org.apache.commons.lang3.exception.ExceptionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class ContentController {

    private static final int rows=15;
    @Autowired
    private ContentService contentService;

    @RequestMapping("/content/{code}")
    @ResponseBody
    public EducationResult getContentList(@PathVariable("code") String code){
        try {
            List<TZbCoursetype> list=contentService.getContentList(code);
            return EducationResult.ok(list);
        }catch (Exception e){
            e.printStackTrace();
            return EducationResult.build(500, ExceptionUtils.getStackTrace(e));
        }
    }

    @RequestMapping("/isContent/{code}")
    @ResponseBody
    public EducationResult getIsContentList(@PathVariable String code){
        try {
            List<TZbCoursetype> list=contentService.getIsContentList(code);
            return EducationResult.ok(list);
        }catch (Exception e){
            e.printStackTrace();
            return EducationResult.build(500, ExceptionUtils.getStackTrace(e));
        }
    }

    @RequestMapping("/type/{type}/{page}")
    @ResponseBody
    public EducationResult getCourseTypeList(@PathVariable String type, @PathVariable Integer page){
        try {
            PagePortal pageInfoShow =contentService.getCourseTypeList(type,page,rows);
            return EducationResult.ok(pageInfoShow);
        }catch (Exception e){
            e.printStackTrace();
            return EducationResult.build(500, ExceptionUtils.getStackTrace(e));
        }
    }

    @RequestMapping("/homeroundList")
    @ResponseBody
    public EducationResult getHomeroundList(){
        try {
           List<TZbHomeround> homerounds=contentService.getHomeroundList();
            return EducationResult.ok(homerounds);
        }catch (Exception e){
            e.printStackTrace();
            return EducationResult.build(500, ExceptionUtils.getStackTrace(e));
        }
    }

    @RequestMapping("/indexShow")
    @ResponseBody
    public EducationResult getCourseList(){
        try{
            List<TZbCourse> list=contentService.getCourseList();
            return EducationResult.ok(list);
        }catch (Exception ex){
            ex.printStackTrace();
            return EducationResult.build(500, ExceptionUtils.getStackTrace(ex));
        }
    }

    @RequestMapping("/courseShow/{cid}")
    @ResponseBody
    public EducationResult getCourseSectionID(@PathVariable Integer cid){
        try {
            List<TZbCourseSection> list=contentService.getCourseSectionID(cid);
            return EducationResult.ok(list);
        }catch (Exception e){
            e.printStackTrace();
            return EducationResult.build(500, ExceptionUtils.getStackTrace(e));
        }
    }

    @RequestMapping("/courseComment/{cid}")
    @ResponseBody
    public EducationResult getCourseCommentList(@PathVariable("cid") Integer cid){
        try {
                List<TZbCourseComment> list=contentService.getCourseCommentList(cid);
                return EducationResult.ok(list);
        }catch (Exception e){
            e.printStackTrace();
            return EducationResult.build(500, ExceptionUtils.getStackTrace(e));
        }
    }

    @RequestMapping("/insertComment/{prentId}/{cid}/{content}/{username}")
    @ResponseBody
    public EducationResult insertComment(@PathVariable("prentId") Integer prentId, @PathVariable("cid") Integer cid, @PathVariable("content") String content, @PathVariable("username") String username){
        try {
            int i=contentService.insertCourseComment(prentId,cid,content,username);
            if(i>0){
                return EducationResult.ok(1);
            }
            return EducationResult.ok(0);
        }catch (Exception e){
            e.printStackTrace();
            return EducationResult.build(500, ExceptionUtils.getStackTrace(e));
        }
    }

    @RequestMapping("/getUser/{username}")
    @ResponseBody
    public EducationResult getUser(@PathVariable("username") String username){
        try {
            TZbUser user=contentService.getUser(username);
            return EducationResult.ok(user);
        }catch (Exception e){
            e.printStackTrace();
            return EducationResult.build(500, ExceptionUtils.getStackTrace(e));
        }
    }

    @RequestMapping("/getCourseTeacherSum/{username}")
    @ResponseBody
    public EducationResult getCourseTeacherSum(@PathVariable("username") String username){
        try {
            int sum=contentService.getCourseTeacherSum(username);
            return EducationResult.ok(sum);
        }catch (Exception e){
            e.printStackTrace();
            return EducationResult.build(500, ExceptionUtils.getStackTrace(e));
        }
    }

    @RequestMapping("/getCourseID/{id}")
    @ResponseBody
    public EducationResult getCourseID(@PathVariable("id") Integer id){
        try {
            TZbCourse course=contentService.getCourseID(id);
            return EducationResult.ok(course);
        }catch (Exception e){
            e.printStackTrace();
            return EducationResult.build(500, ExceptionUtils.getStackTrace(e));
        }
    }


    @RequestMapping("/CourseSection/{id}")
    @ResponseBody
    public EducationResult getCourseSectionId(@PathVariable("id") Integer id){
        try {
            TZbCourseSection courseSection=contentService.getCourseSection(id);
            return EducationResult.ok(courseSection);
        }catch (Exception e){
            e.printStackTrace();
            return EducationResult.build(500, ExceptionUtils.getStackTrace(e));
        }
    }
}
