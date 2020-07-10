package com.education.rest.controller;

import com.education.pojo.TZbDiscussion;
import com.education.pojo.TZbDiscussionCircle;
import com.education.rest.service.QuestionService;
import com.education.util.EducationResult;
import com.education.util.PagePortal;
import org.apache.commons.lang3.exception.ExceptionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class QuestionController {
    private static final int rows=15;
    @Autowired
    private QuestionService questionService;

    @RequestMapping("/getQuestionList/{page}")
    @ResponseBody
    public EducationResult getQuestionList(@PathVariable("page") Integer page){
        try {
            PagePortal pagePortal=questionService.getQuestionList(page,rows);
            return EducationResult.ok(pagePortal);
        }catch (Exception e){
            e.printStackTrace();
            return EducationResult.build(500, ExceptionUtils.getStackTrace(e));
        }
    }

    @RequestMapping("/questionRed/{id}/{page}")
    @ResponseBody
    public EducationResult questionRed(@PathVariable("id") Integer id, @PathVariable("page") Integer page){
        try {
            PagePortal pagePortal=questionService.getQuestionRedList(id,page,rows);
            return EducationResult.ok(pagePortal);
        }catch (Exception e){
            e.printStackTrace();
            return EducationResult.build(500, ExceptionUtils.getStackTrace(e));
        }
    }

    @RequestMapping("/updateQuestion/{id}")
    @ResponseBody
    public EducationResult updateQuestion(@PathVariable("id") Integer id){
        try {
            int i=questionService.updateQuestion(id);
            return EducationResult.ok(i);
        }catch (Exception e){
            e.printStackTrace();
            return EducationResult.build(500, ExceptionUtils.getStackTrace(e));
        }
    }

    @RequestMapping("/getQuestionID/{id}")
    @ResponseBody
    public EducationResult getQuestionID(@PathVariable("id") Integer id){
        try {
            TZbDiscussion discussion=questionService.getQuestionID(id);
            return EducationResult.ok(discussion);
        }catch (Exception e){
            e.printStackTrace();
            return EducationResult.build(500, ExceptionUtils.getStackTrace(e));
        }
    }

    @RequestMapping("/saveQuestionRed/{name}/{content}/{id}")
    @ResponseBody
    public EducationResult getQuestionID(@PathVariable("id") String id, @PathVariable("name") String name, @PathVariable("content") String content){
        try {
            TZbDiscussionCircle discussionCircle=new TZbDiscussionCircle();
            discussionCircle.setZbCircleContent(content);
            discussionCircle.setZbCircleUsername(name);
            discussionCircle.setZbCircleDiscussionid(Integer.parseInt(id));
            int i=questionService.saveQuestionRed(discussionCircle);
            return EducationResult.ok(i);
        }catch (Exception e){
            e.printStackTrace();
            return EducationResult.build(500, ExceptionUtils.getStackTrace(e));
        }
    }

    @RequestMapping("/saveQuestionList/{name}/{content}/{title}")
    @ResponseBody
    public EducationResult saveQuestionList(@PathVariable("title") String title, @PathVariable("name") String name, @PathVariable("content") String content){
        try {
            TZbDiscussion discussion=new TZbDiscussion();
            discussion.setZbContent(content);
            discussion.setZbName(title);
            discussion.setZbUsername(name);
            int i=questionService.saveQuestionList(discussion);
            return EducationResult.ok(i);
        }catch (Exception e){
            e.printStackTrace();
            return EducationResult.build(500, ExceptionUtils.getStackTrace(e));
        }
    }

}
