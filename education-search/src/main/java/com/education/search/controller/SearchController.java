package com.education.search.controller;

import com.education.search.pojo.SearchResult;
import com.education.search.service.SearchService;
import com.education.util.EducationResult;
import org.apache.commons.lang3.exception.ExceptionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SearchController {
    @Autowired
    private SearchService searchService;
    @RequestMapping("/q")
    @ResponseBody
    public EducationResult search(@RequestParam(defaultValue="")String keyword,
                                  @RequestParam(defaultValue="1")Integer page,
                                  @RequestParam(defaultValue="15")Integer rows) {

        try {
            //转换字符集
            keyword = new String(keyword.getBytes("iso8859-1"), "utf-8");
            SearchResult searchResult = searchService.search(keyword, page, rows);
            return EducationResult.ok(searchResult);
        } catch (Exception e) {
            e.printStackTrace();
            return EducationResult.build(500, ExceptionUtils.getStackTrace(e));
        }
    }
}
