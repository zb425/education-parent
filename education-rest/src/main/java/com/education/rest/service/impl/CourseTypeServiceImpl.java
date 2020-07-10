package com.education.rest.service.impl;

import com.education.mapper.TZbCourseMapper;
import com.education.pojo.TZbCourse;
import com.education.pojo.TZbCourseExample;
import com.education.rest.service.CourseTypeService;
import com.education.util.PagePortal;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseTypeServiceImpl implements CourseTypeService {

    @Autowired
    private TZbCourseMapper courseMapper;

    @Override
    public PagePortal getCourseType(String type, int page, int rows) {
        PagePortal pagePortal=new PagePortal();
        PageHelper.startPage(page,rows);
        TZbCourseExample courseExample=new TZbCourseExample();
        TZbCourseExample.Criteria criteria=courseExample.createCriteria();
        criteria.andZbCoursetypeEqualTo(type);
        List<TZbCourse> list=courseMapper.selectByExample(courseExample);
        PageInfo<TZbCourse> pageInfo=new PageInfo<>(list);
        pagePortal.setPageNow(page);
        pagePortal.setTotal(pageInfo.getTotal());
        pagePortal.setRows(pageInfo.getList());
        pagePortal.setType(type);
        pagePortal.setTotalPage(pageInfo.getTotal()%9==0?(int)pageInfo.getTotal()/9:(int)pageInfo.getTotal()/9+1);
        return pagePortal;
    }
}
