package com.education.portal.service.impl;

import com.education.portal.service.QuestionService;
import com.education.util.HttpClientUtil;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class QuestionServiceImpl implements QuestionService {
    @Value("${REST_BASE_URL}")
    private String REST_BASE_URL;
    @Value("${REST_QUESTION_URL}")
    private String REST_QUESTION_URL;
    @Value("${REST_QUESTION_UPDATE_URL}")
    private String REST_QUESTION_UPDATE_URL;
    @Value("${REST_QUESTION_RED_URL}")
    private String REST_QUESTION_RED_URL;
    @Value("${REST_QUESTION_ID_URL}")
    private String REST_QUESTION_ID_URL;
    @Value("${REST_QUESTION_SAVE_URL}")
    private String REST_QUESTION_SAVE_URL;
    @Value("${REST_QUESTIONLIST_SAVE_URL}")
    private String REST_QUESTIONLIST_SAVE_URL;
    @Override
    public String getQustionsList(String page) {
        String json= HttpClientUtil.doGet(REST_BASE_URL+REST_QUESTION_URL+page);
        return json;
    }

    @Override
    public String updateQustion(String id) {
        String json= HttpClientUtil.doGet(REST_BASE_URL+REST_QUESTION_UPDATE_URL+id);
        return json;
    }

    @Override
    public String getQuestionRed(String id, String page) {
        String json= HttpClientUtil.doGet(REST_BASE_URL+REST_QUESTION_RED_URL+id+"/"+page);
        return json;
    }

    @Override
    public String getQuestionID(String id) {
        String json= HttpClientUtil.doGet(REST_BASE_URL+REST_QUESTION_ID_URL+id);
        return json;
    }

    @Override
    public String saveQuestionRed(String id, String name, String content) {
        String json= HttpClientUtil.doGet(REST_BASE_URL+REST_QUESTION_SAVE_URL+name+"/"+content+"/"+id);
        return json;
    }

    @Override
    public String saveQuestionList(String title, String name, String content) {
        String json= HttpClientUtil.doGet(REST_BASE_URL+REST_QUESTIONLIST_SAVE_URL+name+"/"+content+"/"+title);
        return json;
    }
}
