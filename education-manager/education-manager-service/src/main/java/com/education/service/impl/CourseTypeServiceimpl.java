package com.education.service.impl;

import com.education.mapper.TZbCoursetypeMapper;
import com.education.pojo.TZbCoursetype;
import com.education.service.CourseTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class CourseTypeServiceimpl implements CourseTypeService {

    @Autowired
    private TZbCoursetypeMapper coursetypeMapper;

    @Override
    public List<TZbCoursetype> selectAllCourseType() {
        return coursetypeMapper.selectByExample(null);
    }

    @Override
    public int saveCourseType(TZbCoursetype coursetype) {
        coursetype.setZbSort(1);
        coursetype.setZbCreateTime(new Date());
        coursetype.setZbUpdateTime(new Date());
        return coursetypeMapper.insert(coursetype);
    }

    @Override
    public TZbCoursetype getCourseTypeById(int id) {
        return coursetypeMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateCourseType(TZbCoursetype coursetype) {
        coursetype.setZbCode(null);
        coursetype.setZbParentCode(null);
        coursetype.setZbUpdateTime(null);
        coursetype.setZbCreateTime(null);
        return coursetypeMapper.updateByPrimaryKeySelective(coursetype);
    }

    @Override
    public int deleteCourseType(int id) {
        return coursetypeMapper.deleteByPrimaryKey(id);
    }
}
