package com.education.controller;

import com.education.service.CommentService;
import com.education.util.JsonUtils;
import com.education.util.PageInfoShow;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/comment")
public class CommentController {

    private static final int rows=15;
    @Autowired
    private CommentService commentService;
    @RequestMapping("/index")
    public ModelAndView getCommentList(@RequestParam("name") String name,@RequestParam("page") Integer page){
        ModelAndView modelAndView=new ModelAndView("comment/index");
       PageInfoShow pageInfoShow= commentService.getCommentList(page,rows,name);
       modelAndView.addObject("commentList",pageInfoShow);
       return modelAndView;
    }

    @RequestMapping("/deleteComment")
    @ResponseBody
    public String deleteComment(HttpServletRequest request,@RequestParam("delComment") String delComment){
        String []comment=delComment.split(",");
        int i=commentService.deleteCommentOntoTow(comment);
        if(i>0){
            return JsonUtils.objectToJson(1);
        }else{
            return JsonUtils.objectToJson(0);
        }
    }

}
