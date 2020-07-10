package com.education.service;

import com.education.pojo.TZbCoursetype;

import java.util.List;

public interface CourseTypeService {

    List<TZbCoursetype> selectAllCourseType();

    int saveCourseType(TZbCoursetype coursetype);

    TZbCoursetype getCourseTypeById(int id);

    int updateCourseType(TZbCoursetype coursetype);

    int deleteCourseType(int id);
}
