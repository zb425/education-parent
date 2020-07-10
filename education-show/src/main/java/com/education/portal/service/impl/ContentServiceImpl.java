package com.education.portal.service.impl;

import com.education.portal.service.ContentService;
import com.education.util.HttpClientUtil;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class ContentServiceImpl implements ContentService {
    @Value("${REST_BASE_URL}")
    private String REST_BASE_URL;
    @Value("${REST_CONTENT_URL}")
    private String REST_CONTENT_URL;
    @Value("${REST_CONTENT_AD1_CID}")
    private String REST_CONTENT_AD1_CID;
    @Value("${REST_CONTENT_TYP_URL}")
    private String REST_CONTENT_TYP_URL;
    @Value("${REST_ISCONENT_URL}")
    private String REST_ISCONENT_URL;
    @Value("${REST_COURSE_INDEX_URL}")
    private String REST_COURSE_INDEX_URL;
    @Value("${REST_COURSE_SECTION_URL}")
    private String REST_COURSE_SECTION_URL;
    @Value("${REST_COURSE_COMMENT_URL}")
    private String REST_COURSE_COMMENT_URL;
    @Value("${REST_COURSE_COMMENT_ADD_URL}")
    private String REST_COURSE_COMMENT_ADD_URL;
    @Value("${REST_USER_URL}")
    private String REST_USER_URL;
    @Value("${REST_TEACHER_URL}")
    private String REST_TEACHER_URL;
    @Value("${REST_COURSE_SECTION_ID_URL}")
    private String REST_COURSE_SECTION_ID_URL;
    @Value("${REST_COURSE_ID_URL}")
    private String REST_COURSE_ID_URL;
    @Value("${REST_HOMEROUND_URL}")
    private String REST_HOMEROUND_URL;

    @Override
    public String getCourseList() {
        //System.out.println(REST_BASE_URL+REST_CONTENT_URL+REST_CONTENT_AD1_CID);
        String json= HttpClientUtil.doGet(REST_BASE_URL+REST_CONTENT_URL+REST_CONTENT_AD1_CID);
       // System.out.println(json+"  ");
        return json;
    }

    @Override
    public String getIsCourseList() {
        String json= HttpClientUtil.doGet(REST_BASE_URL+REST_ISCONENT_URL+REST_CONTENT_AD1_CID);
        return json;
    }

    @Override
    public String getCourseTypeList(String type,String page) {
        String json= HttpClientUtil.doGet(REST_BASE_URL+REST_CONTENT_TYP_URL+type+"/"+page);
        return json;
    }

    @Override
    public String getCourseIndexList() {
        String json= HttpClientUtil.doGet(REST_BASE_URL+REST_COURSE_INDEX_URL);
        return json;
    }

    @Override
    public String getCourseSectionID(int id) {
        String json= HttpClientUtil.doGet(REST_BASE_URL+REST_COURSE_SECTION_URL+id);
        return json;
    }

    @Override
    public String getCourseCommentList(int id) {
        String json= HttpClientUtil.doGet(REST_BASE_URL+REST_COURSE_COMMENT_URL+id);
        return json;
    }

    @Override
    public String insertCourseComment(Integer prentId, Integer cid, String content,String username) {
        String json= HttpClientUtil.doGet(REST_BASE_URL+REST_COURSE_COMMENT_ADD_URL+prentId+"/"+cid+"/"+content+"/"+username);
        return json;
    }

    @Override
    public String getUser(String username) {
        String json= HttpClientUtil.doGet(REST_BASE_URL+REST_USER_URL+username);
        return json;
    }

    @Override
    public String getTeacherSum(String username) {
        String json= HttpClientUtil.doGet(REST_BASE_URL+REST_TEACHER_URL+username);
        return json;
    }

    @Override
    public String getCouseSection(int id) {
        String json= HttpClientUtil.doGet(REST_BASE_URL+REST_COURSE_SECTION_ID_URL+id);
        return json;
    }

    @Override
    public String getCourseID(int id) {
        String json= HttpClientUtil.doGet(REST_BASE_URL+REST_COURSE_ID_URL+id+"");
        return json;
    }

    @Override
    public String getHomeroundList() {
        String json= HttpClientUtil.doGet(REST_BASE_URL+REST_HOMEROUND_URL);
        return json;
    }
}
