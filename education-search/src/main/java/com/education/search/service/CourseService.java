package com.education.search.service;


import com.education.util.EducationResult;

public interface CourseService {
    EducationResult importCourse() throws  Exception;

    EducationResult synCourse() throws  Exception;
}
