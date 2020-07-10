package com.education.portal.controller;

import com.education.pojo.TZbCoursetype;
import com.education.portal.pojo.SearchResult;
import com.education.portal.service.ContentService;
import com.education.portal.service.SerachService;
import com.education.util.EducationResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.io.UnsupportedEncodingException;
import java.util.List;

@Controller
public class SearchController {
    @Autowired
    private SerachService serachService;
    @Autowired
    private ContentService contentService;

    @RequestMapping("/search")
    public String search(@RequestParam("search") String keyword,
                         @RequestParam(defaultValue="1")Integer page,
                         @RequestParam(defaultValue="15")Integer rows, Model model) {

        //get乱码处理
        try {
            keyword = new String(keyword.getBytes("iso8859-1"), "utf-8");
        } catch (UnsupportedEncodingException e) {
            keyword = "";
            e.printStackTrace();
        }
        SearchResult searchResult = serachService.search(keyword, page, rows);


        String json1=contentService.getIsCourseList();
        EducationResult educationResult1= EducationResult.formatToList(json1, TZbCoursetype.class);
        List<TZbCoursetype> list1=(List<TZbCoursetype>)educationResult1.getData();
        model.addAttribute("isCourse",list1);
        //参数传递 给页面
        model.addAttribute("query", keyword);
        model.addAttribute("totalPages", searchResult.getPageConunt());
        model.addAttribute("courseType", searchResult.getCourseList());
        model.addAttribute("page", searchResult.getCurPage());

        return "courses/search";
    }

    @RequestMapping("/courses/search")
    public void searchToSearch(@RequestParam("search") String keyword,
                               @RequestParam(defaultValue="1")Integer page,
                               @RequestParam(defaultValue="3")Integer rows, Model model){
        this.search(keyword,page,rows,model);
    }
}
