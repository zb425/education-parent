package com.education.portal.service.impl;

import com.education.portal.service.CourseModelService;
import com.education.util.HttpClientUtil;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class CourseModelServiceImpl implements CourseModelService {
    @Value("${REST_BASE_URL}")
    private String REST_BASE_URL;
    @Value("${REST_COURSE_TYPE_URL}")
    private String REST_COURSE_TYPE_URL;
    @Override
    public String getCourseType(String code,int page) {
        String json= HttpClientUtil.doGet(REST_BASE_URL+REST_COURSE_TYPE_URL+code+"/"+page+"");
        return json;
    }
}
