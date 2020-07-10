package com.education.portal.service;

public interface UserLoginService {
    String getUserLogin(String username, String password);

    String insertStudent(String email, String username, String password);

    String getStudentEmail(String email);

    String updateStudentPassword(String phone, String password);
}
