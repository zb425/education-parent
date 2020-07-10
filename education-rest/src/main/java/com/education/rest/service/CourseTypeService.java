package com.education.rest.service;

import com.education.util.PagePortal;

public interface CourseTypeService {

    PagePortal getCourseType(String type, int page, int rows);
}
