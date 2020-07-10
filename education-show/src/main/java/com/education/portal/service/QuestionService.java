package com.education.portal.service;

public interface QuestionService {

    String getQustionsList(String page);

    String updateQustion(String id);

    String getQuestionRed(String id, String page);

    String getQuestionID(String id);

    String saveQuestionRed(String id, String name, String content);

    String saveQuestionList(String title, String name, String content);
}
