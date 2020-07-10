package com.education.portal.service.impl;

import com.education.portal.service.UserLoginService;
import com.education.util.HttpClientUtil;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class UserLoginImpl implements UserLoginService {
    @Value("${REST_BASE_URL}")
    private String REST_BASE_URL;
    @Value("${USER_LOGIN_URL}")
    private String USER_LOGIN_URL;
    @Value("${STUDENT_USER_REGISTER_URL}")
    private String STUDENT_USER_REGISTER_URL;
    @Value("${REST_STUDENT_EMAIL_URL}")
    private String REST_STUDENT_EMAIL_URL;
    @Value("${REST_STUDENT_PASSWORD_URL}")
    private String REST_STUDENT_PASSWORD_URL;

    @Override
    public String getUserLogin(String username, String password) {
        String json= HttpClientUtil.doGet(REST_BASE_URL+USER_LOGIN_URL+username+"/"+password);
        return json;
    }

    @Override
    public String insertStudent(String email, String username, String password) {
        String json= HttpClientUtil.doGet(REST_BASE_URL+STUDENT_USER_REGISTER_URL+email+"/"+username+"/"+password);
        return json;
    }

    @Override
    public String getStudentEmail(String email) {
        String json= HttpClientUtil.doGet(REST_BASE_URL+REST_STUDENT_EMAIL_URL+email);
        return json;
    }

    @Override
    public String updateStudentPassword(String phone, String password) {
        String json= HttpClientUtil.doGet(REST_BASE_URL+REST_STUDENT_PASSWORD_URL+phone+"/"+password);
        return json;
    }
}
