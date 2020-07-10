package com.education.service;

import com.education.pojo.TZbCourse;
import com.education.pojo.TZbCourseSection;
import com.education.pojo.TZbCoursetype;
import com.education.util.PageInfoShow;

import java.util.List;


public interface CourseService {
    PageInfoShow getAllCourse(int page, int rows, String name);
    TZbCourse getCourse(Integer id);

    PageInfoShow getNameCourse(String name, int page, int rows);

    int deleteCourseID(Integer id);

    int updateCourseID(Integer id);

    List<TZbCoursetype> getAllCourseType();

    List<TZbCourse> getCourse();

    List<TZbCourseSection> getCourseSection(Integer courseID);

    int insertCourseSection(TZbCourseSection courseSection);

    int insertCourse(TZbCourse course);

    List<TZbCourseSection> getCourseSectionToPrent(int prentId);

    int updateCourseSection(TZbCourseSection courseSection);

    TZbCourseSection getCouserSectionID(int id);

    int deleteCourseSection(String[] str);

    int deleteSectionID(int id);

    int updateSection(TZbCourseSection courseSection);
}
