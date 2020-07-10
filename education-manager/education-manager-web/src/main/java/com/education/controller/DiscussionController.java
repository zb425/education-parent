package com.education.controller;

import com.education.service.DiscussionService;
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
@RequestMapping("/discussion")
public class DiscussionController {
    private static final  int rows=5;
    @Autowired
    private DiscussionService discussionService;

    @RequestMapping("/discussionIndex")
    public String getDiscussionList(Model model, @RequestParam("que") String que,@RequestParam(value = "page",defaultValue = "1") Integer page){
       PagePortal pagePortal =discussionService.getDiscussionList(que,page,rows);
       model.addAttribute("discussion",pagePortal);
       return "/discussion/discussionIndex";
    }

    @RequestMapping(value = "/delete",method = RequestMethod.POST)
    @ResponseBody
    public String deleteDiscussion(@RequestParam("id") Integer id){
        int i=discussionService.deleteDiscussion(id);
        if(i>0){
            return JsonUtils.objectToJson(1);
        }
        return JsonUtils.objectToJson(0);
    }

    @RequestMapping(value = "/update",method = RequestMethod.POST)
    @ResponseBody
    public String updateDiscussion(@RequestParam("id") Integer id){
        int i=discussionService.updateDIscussion(id);
        if(i>0){
            return JsonUtils.objectToJson(1);
        }
        return JsonUtils.objectToJson(0);
    }

    @RequestMapping("/discussionRead")
    public String getDiscussionList(Model model, @RequestParam("id") Integer id,@RequestParam(value = "page",defaultValue = "1") Integer page){
        PagePortal pagePortal =discussionService.getDiscussionIDList(id,page,rows);
        model.addAttribute("discussionRead",pagePortal);
        model.addAttribute("id",id);
        return "/discussion/discussionRead";
    }

    @RequestMapping(value = "/deleteRed",method = RequestMethod.POST)
    @ResponseBody
    public String deleteRedDiscussion(@RequestParam("id") Integer id){
        int i=discussionService.deleteRedDiscussion(id);
        if(i>0){
            return JsonUtils.objectToJson(1);
        }
        return JsonUtils.objectToJson(0);
    }

    @RequestMapping(value = "/updateRed",method = RequestMethod.POST)
    @ResponseBody
    public String updateRedDiscussion(@RequestParam("id") Integer id){
        int i=discussionService.updateRedDiscussion(id);
        if(i>0){
            return JsonUtils.objectToJson(1);
        }
        return JsonUtils.objectToJson(0);
    }
}
