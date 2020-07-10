package com.education.portal.service.impl;

import com.education.portal.pojo.SearchResult;
import com.education.portal.service.SerachService;
import com.education.util.EducationResult;
import com.education.util.HttpClientUtil;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class SerachServiceImpl implements SerachService {

    @Value("${SEARCH_BASE_URL}")
    private String SEARCH_BASE_URL;

    @Override
    public SearchResult search(String keyword, int page, int rows) {
        //调用服务查询课程列表
        Map<String, String> param = new HashMap<>();
        param.put("keyword", keyword);
        param.put("page", page + "");
        param.put("rows", rows + "");
        //调用服务
        String json = HttpClientUtil.doGet(SEARCH_BASE_URL, param);
        //转换成java对象
        EducationResult educationResult = EducationResult.formatToPojo(json, SearchResult.class);
        //取返回的结果
        SearchResult searchResult = (SearchResult) educationResult.getData();
        return searchResult;
    }
}
