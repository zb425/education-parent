package com.education.rest.service;

import com.education.pojo.*;
import com.education.util.PagePortal;

import java.util.List;

public interface ContentService {
    List<TZbCoursetype> getContentList(String code);
    List<TZbCoursetype> getIsContentList(String code);

    PagePortal getCourseTypeList(String type, int page, int rows);

    List<TZbCourse> getCourseList();

    List<TZbHomeround> getHomeroundList();

    List<TZbCourseSection> getCourseSectionID(int id);

    List<TZbCourseComment> getCourseCommentList(int id);

    int insertCourseComment(Integer prentId, Integer cid, String content, String username);

    TZbUser getUser(String username);

    TZbCourse getCourseID(int id);

    int getCourseTeacherSum(String username);

    TZbCourseSection getCourseSection(int id);


}
