package com.education.service.impl;

import com.education.mapper.TZbCourseCommentMapper;
import com.education.mapper.TZbCourseMapper;
import com.education.mapper.TZbCourseSectionMapper;
import com.education.mapper.TZbCoursetypeMapper;
import com.education.pojo.*;
import com.education.service.CourseService;
import com.education.util.PageInfoShow;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class CourseServiceimpl implements CourseService {

    @Autowired
    private TZbCourseMapper courseMapper;
    @Autowired
    private TZbCourseCommentMapper courseCommentMapper;
    @Autowired
    private TZbCourseSectionMapper courseSectionMapper;
    @Autowired
    private TZbCoursetypeMapper courseTypeMapper;


    //获取所有的课程信息
    @Override
    public PageInfoShow getAllCourse(int page, int rows, String name) {
        PageHelper.startPage(page,rows);
        TZbCourseExample example=new TZbCourseExample();
        TZbCourseExample.Criteria criteria=example.createCriteria();
        criteria.andZbNameLike("%"+name+"%");
        List<TZbCourse> list=courseMapper.selectByExample(example);
        PageInfo<TZbCourse> pageInfo=new PageInfo<>(list);
        PageInfoShow pageInfoShow=new PageInfoShow();
        pageInfoShow.setTotal(pageInfo.getTotal());
        pageInfoShow.setRows(pageInfo.getList());
        pageInfoShow.setPageNow(page);
        pageInfoShow.setName(name);
        pageInfoShow.setTotalPage(pageInfo.getTotal()%5==0?(int)pageInfo.getTotal()/5:(int)pageInfo.getTotal()/5+1);
        return pageInfoShow;
    }
    //根据课程id查询
    @Override
    public TZbCourse getCourse(Integer id) {
        return courseMapper.selectByPrimaryKey(id);
    }
    //根据课程名称查询
    @Override
    public PageInfoShow getNameCourse(String name, int page, int rows) {
        PageHelper.startPage(page,rows);
        TZbCourseExample example=new TZbCourseExample();
        TZbCourseExample.Criteria criteria=example.createCriteria();
        criteria.andZbNameLike("%"+name+"%");
        List<TZbCourse> list=courseMapper.selectByExample(example);
        PageInfo<TZbCourse> pageInfo=new PageInfo<>(list);
        PageInfoShow pageInfoShow=new PageInfoShow();
        pageInfoShow.setTotal(pageInfo.getTotal());
        pageInfoShow.setRows(pageInfo.getList());
        pageInfoShow.setPageNow(page);
        pageInfoShow.setTotalPage(pageInfo.getTotal()%5==0?(int)pageInfo.getTotal()/5:(int)pageInfo.getTotal()/5+1);
        return pageInfoShow;
    }

    //根据id删除课程
    @Override
    public int deleteCourseID(Integer id) {
        TZbCourseCommentExample commentExample=new TZbCourseCommentExample();
        TZbCourseSectionExample sectionExample=new TZbCourseSectionExample();
        TZbCourseCommentExample.Criteria criteria=commentExample.createCriteria();
        TZbCourseSectionExample.Criteria criteria1=sectionExample.createCriteria();
        criteria.andZbCourseIdEqualTo(id);
        criteria1.andZbCourseIdEqualTo(id);
        courseCommentMapper.deleteByExample(commentExample);
        courseSectionMapper.deleteByExample(sectionExample);
        return courseMapper.deleteByPrimaryKey(id);
    }

    //根据id更新课程是否发布
    @Override
    public int updateCourseID(Integer id) {
        TZbCourseExample courseExample=new TZbCourseExample();
       TZbCourseExample.Criteria criteria=courseExample.createCriteria();
       TZbCourse course=courseMapper.selectByPrimaryKey(id);
       if(course.getZbOnsale()){
           course.setZbOnsale(false);
       }else{
           course.setZbOnsale(true);
       }
       course.setZbCreateTime(new Date());
        return courseMapper.updateByPrimaryKey(course);
    }

    //获取课程类别信息
    @Override
    public List<TZbCoursetype> getAllCourseType() {
       TZbCoursetypeExample courseExample=new TZbCoursetypeExample();
        List<TZbCoursetype> list=courseTypeMapper.selectByExample(courseExample);
        return list;
    }

    @Override
    public List<TZbCourse> getCourse() {
        TZbCourseExample example=new TZbCourseExample();
        return courseMapper.selectByExample(example);
    }

    //根据课程ID获取课程章节信息
    @Override
    public List<TZbCourseSection> getCourseSection(Integer courseID) {
        TZbCourseSectionExample courseSectionExample=new TZbCourseSectionExample();
        TZbCourseSectionExample.Criteria criteria=courseSectionExample.createCriteria();
        criteria.andZbCourseIdEqualTo(courseID);
        criteria.andZbParentIdEqualTo(0);
        return courseSectionMapper.selectByExample(courseSectionExample);
    }

    //添加课程章节信息
    @Override
    public int insertCourseSection(TZbCourseSection courseSection) {
        if(courseSection.getZbParentId()!=null){
            courseSection.setZbOnsale(true);
            courseSection.setZbSort(1);
            courseSection.setZbCreateTime(new Date());
            courseSection.setZbUpdateTime(new Date());
        }else{
            courseSection.setZbOnsale(true);
            courseSection.setZbSort(1);
            courseSection.setZbTime("");
            courseSection.setZbParentId(0);
            courseSection.setZbVideoUrl("");
            courseSection.setZbCreateTime(new Date());
            courseSection.setZbUpdateTime(new Date());
        }
        return courseSectionMapper.insert(courseSection);
    }

    @Override
    public int insertCourse(TZbCourse course) {
        course.setZbCreateTime(new Date());
        course.setZbUpdateTime(new Date());
        return courseMapper.insertSelective(course);
    }

    @Override
    public List<TZbCourseSection> getCourseSectionToPrent(int prentId) {
        TZbCourseSectionExample courseSectionExample=new TZbCourseSectionExample();
        TZbCourseSectionExample.Criteria criteria=courseSectionExample.createCriteria();
        criteria.andZbCourseIdEqualTo(prentId);
        return courseSectionMapper.selectByExample(courseSectionExample);
    }


    @Override
    public int updateCourseSection(TZbCourseSection courseSection) {
        return courseSectionMapper.updateByPrimaryKeySelective(courseSection);
    }

    @Override
    public TZbCourseSection getCouserSectionID(int id) {
        return courseSectionMapper.selectByPrimaryKey(id);
    }

    @Override
    public int deleteCourseSection(String[] str) {
        int sum=0;
        TZbCourseCommentExample commentExample=new TZbCourseCommentExample();
        TZbCourseCommentExample.Criteria criteria =commentExample.createCriteria();
        for (int i=0;i<str.length;i++){
            sum=courseSectionMapper.deleteByPrimaryKey(Integer.parseInt(str[i]));
            criteria.andZbSectionIdEqualTo(Integer.parseInt(str[i]));
            courseCommentMapper.deleteByExample(commentExample);
        }
        return sum;
    }

    @Override
    public int deleteSectionID(int id) {
        TZbCourseCommentExample commentExample=new TZbCourseCommentExample();
        TZbCourseSectionExample courseSectionExample=new TZbCourseSectionExample();
        TZbCourseCommentExample.Criteria criteria=commentExample.createCriteria();
        TZbCourseSectionExample.Criteria criteria1=courseSectionExample.createCriteria();
        criteria.andZbSectionIdEqualTo(id);
        criteria1.andZbParentIdEqualTo(id);
        courseCommentMapper.deleteByExample(commentExample);
        courseSectionMapper.deleteByExample(courseSectionExample);
        return courseSectionMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int updateSection(TZbCourseSection courseSection) {
        return courseSectionMapper.updateByPrimaryKeySelective(courseSection);
    }
}
