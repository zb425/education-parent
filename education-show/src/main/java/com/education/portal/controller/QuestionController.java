package com.education.portal.controller;

import com.education.pojo.TZbDiscussion;
import com.education.portal.service.QuestionService;
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


@Controller
@RequestMapping("/questions")
public class QuestionController {
    @Autowired
    private QuestionService questionService;

    @RequestMapping("/index")
    public String getQuestionList(Model model, @RequestParam(value = "page",defaultValue = "1") Integer page){
        String json=questionService.getQustionsList(String.valueOf(page));
        EducationResult educationResult= EducationResult.formatToPojo(json, PagePortal.class);
        PagePortal pagePortal=(PagePortal) educationResult.getData();
        model.addAttribute("question",pagePortal);
        return "questions/index";
    }

    @RequestMapping(value = "/updateRed",method = RequestMethod.POST)
    @ResponseBody
    public String updateRed(@RequestParam("id") Integer id){
        String json=questionService.updateQustion(String.valueOf(id));
        EducationResult educationResult= EducationResult.format(json);
        int i=(int)educationResult.getData();
        if(i>0){
            return JsonUtils.objectToJson(1);
        }
        return JsonUtils.objectToJson(0);
    }

    @RequestMapping(value = "/questionRed")
    public String questionRed(Model model,@RequestParam("id") Integer id,@RequestParam(value = "page",defaultValue = "1") Integer page){
        String json=questionService.getQuestionRed(String.valueOf(id),String.valueOf(page));
        EducationResult educationResult= EducationResult.formatToPojo(json, PagePortal.class);
        PagePortal pagePortal=(PagePortal)educationResult.getData();

        String json1=questionService.getQuestionID(String.valueOf(id));
        EducationResult educationResult1= EducationResult.formatToPojo(json1, TZbDiscussion.class);
        TZbDiscussion discussion=(TZbDiscussion)educationResult1.getData();
        model.addAttribute("questionRed",pagePortal);
        model.addAttribute("discussion",discussion);
        model.addAttribute("id",id);
       return "questions/questionRed";
    }

    @RequestMapping(value = "/saveQuestions",method = RequestMethod.POST)
    @ResponseBody
    public String updateRed(@RequestParam("id") String id,@RequestParam("username")String username,@RequestParam("content")String content){

        String json=questionService.saveQuestionRed(id,username,content);
        EducationResult educationResult= EducationResult.format(json);
        int i=(int)educationResult.getData();
        if(i>0){
            return JsonUtils.objectToJson(1);
        }
        return JsonUtils.objectToJson(0);
    }

    @RequestMapping(value = "/saveQuestionList",method = RequestMethod.POST)
    @ResponseBody
    public String saveQuestionList(@RequestParam("title") String title,@RequestParam("username")String username,@RequestParam("content")String content){
       String json=questionService.saveQuestionList(title,username,content);
        EducationResult educationResult= EducationResult.format(json);
        int i=(int)educationResult.getData();
        if(i>0){
            return JsonUtils.objectToJson(1);
        }
        return JsonUtils.objectToJson(0);
    }
}
