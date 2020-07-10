package com.education.rest.service;


import java.util.List;

public interface UserLoginService {
    List<?> getUser(String username, String password);

    int insertStudentUser(String email, String username, String password);

    int getStudentEmail(String email);

    int updateStudentPassword(String phone, String password);
}
