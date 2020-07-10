package com.education.portal.service;

public interface ContentService {
    String getCourseList();
    String getIsCourseList();

    String getCourseTypeList(String type, String page);

    String getCourseIndexList();

    String getCourseSectionID(int id);

    String getCourseCommentList(int id);

    String insertCourseComment(Integer prentId, Integer cid, String content, String username);

    String getUser(String username);

    String getTeacherSum(String username);

    String getCouseSection(int id);

    String getCourseID(int id);

    String getHomeroundList();

}
