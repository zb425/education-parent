package com.education.service;

import com.education.pojo.TZbStudentUser;
import com.education.util.PageInfoShow;

public interface StudentService {

    PageInfoShow getStudentList(int page, int rows, String name);

    int saveStudent(TZbStudentUser studentUser);

    int deleteStudentID(int id);

    TZbStudentUser getStudentID(int id);

    int updateStudent(TZbStudentUser studentUser);
}
