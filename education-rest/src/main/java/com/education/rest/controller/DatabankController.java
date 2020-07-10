package com.education.rest.controller;

import com.education.pojo.TZbDatabank;
import com.education.rest.service.DatabankService;
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
public class DatabankController {
    private static  final  int rows=15;
    private static final  int topPage=1;
    private static  final int topRows=5;
    @Autowired
    private DatabankService databankService;

    @RequestMapping("/getDatabankList/{que}/{page}")
    @ResponseBody
    public EducationResult getDatabankList(@PathVariable("que") String que, @PathVariable("page") Integer page){
        try {
            PagePortal pagePortal=databankService.getDatabankList(que,page,rows);
            return EducationResult.ok(pagePortal);
        }catch (Exception e){
            e.printStackTrace();
            return EducationResult.build(500, ExceptionUtils.getStackTrace(e));
        }
    }

    @RequestMapping("/updateDatabank/{id}")
    @ResponseBody
    public EducationResult updateDatabank(@PathVariable("id") Integer id){
        try {
            int i=databankService.updateDatabank(id);
            return EducationResult.ok(i);
        }catch (Exception e){
            e.printStackTrace();
            return EducationResult.build(500, ExceptionUtils.getStackTrace(e));
        }
    }

    @RequestMapping("/getDatabankTopList/{top}")
    @ResponseBody
    public EducationResult getDatabankTopList(@PathVariable("top") String top){
        try {
            List<TZbDatabank> databanks=databankService.getDatabankTopList(top,topPage,topRows);
            return EducationResult.ok(databanks);
        }catch (Exception e){
            e.printStackTrace();
            return EducationResult.build(500, ExceptionUtils.getStackTrace(e));
        }
    }
}
