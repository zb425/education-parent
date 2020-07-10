package com.education.rest.service.impl;

import com.education.mapper.*;
import com.education.pojo.*;
import com.education.rest.service.ContentService;
import com.education.util.PagePortal;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Random;

@Service
public class ContentServiceImpl implements ContentService {
    @Value("${COURSE_INDEX_SHOW}")
    private int COURSE_INDEX_SHOW;
    @Autowired
    private TZbCourseMapper courseMapper;
    @Autowired
    private TZbCoursetypeMapper coursetypeMapper;
    @Autowired
    private TZbCourseSectionMapper courseSectionMapper;
    @Autowired
    private TZbCourseCommentMapper courseCommentMapper;
    @Autowired
    private TZbUserMapper userMapper;
    @Autowired
    private TZbHomeroundMapper homeroundMapper;

    @Override
    public List<TZbCoursetype> getContentList(String code) {
        TZbCoursetypeExample courseExample=new TZbCoursetypeExample();
        TZbCoursetypeExample.Criteria criteria=courseExample.createCriteria();
        criteria.andZbParentCodeEqualTo(code);
        List<TZbCoursetype> list=coursetypeMapper.selectByExample(courseExample);

        return list;
    }

    @Override
    public List<TZbCoursetype> getIsContentList(String code) {

        TZbCoursetypeExample courseExample=new TZbCoursetypeExample();
        TZbCoursetypeExample.Criteria criteria=courseExample.createCriteria();
        criteria.andZbParentCodeNotEqualTo(code);
        List<TZbCoursetype> list=coursetypeMapper.selectByExample(courseExample);

        return list;
    }

    @Override
    public PagePortal getCourseTypeList(String type, int page, int rows) {

        PagePortal pageInfoShow=new PagePortal();
        PageHelper.startPage(page,rows);
        TZbCourseExample courseExample=new TZbCourseExample();
        TZbCourseExample.Criteria criteria=courseExample.createCriteria();
        if(type.equals("all")){
            criteria.andZbOnsaleEqualTo(true);
            pageInfoShow.setTypeName("全部(以上线)");
        }else if(type.equals("isall")){
            criteria.andZbOnsaleEqualTo(false);
            pageInfoShow.setTypeName("即将上线");
        }else if(type.equals("free")){
            criteria.andZbFreeEqualTo(true);
            pageInfoShow.setTypeName("免费");
        }else if(type.equals("isFree")){
            criteria.andZbFreeEqualTo(false);
            pageInfoShow.setTypeName("会员");
        }else{
            String []str=type.split("-");
            if(str.length>1){
                criteria.andZbCoursetypeEqualTo(str[0]);
                pageInfoShow.setTypeName(str[1]);
            }else {
                criteria.andZbUsernameEqualTo(type);
                pageInfoShow.setTypeName("老师"+"("+str[0]+")");
            }

        }
        List<TZbCourse> list=courseMapper.selectByExample(courseExample);

        PageInfo<TZbCourse> pageInfo=new PageInfo<>(list);
        pageInfoShow.setPageNow(page);
        pageInfoShow.setTotal(pageInfo.getTotal());
        pageInfoShow.setRows(pageInfo.getList());
        pageInfoShow.setType(type);
        pageInfoShow.setTotalPage(pageInfo.getTotal()%15==0?(int)pageInfo.getTotal()/15:(int)pageInfo.getTotal()/15+1);
        return pageInfoShow;
    }


    @Override
    public List<TZbHomeround> getHomeroundList() {
        return homeroundMapper.selectByExample(null);
    }

    @Override
    public List<TZbCourse> getCourseList() {
        Random random=new Random();
        int a=random.nextInt(3)+1;
        PageHelper.startPage(a,COURSE_INDEX_SHOW);
        TZbCourseExample courseExample=new TZbCourseExample();
        List<TZbCourse> list=courseMapper.selectByExample(courseExample);
        return list;
    }

    @Override
    public List<TZbCourseSection> getCourseSectionID(int id) {

        TZbCourseSectionExample courseSectionExample=new TZbCourseSectionExample();
        TZbCourseSectionExample.Criteria criteria=courseSectionExample.createCriteria();
        criteria.andZbCourseIdEqualTo(id);
        List<TZbCourseSection> list=courseSectionMapper.selectByExample(courseSectionExample);

        return list;
    }

    @Override
    public List<TZbCourseComment> getCourseCommentList(int id) {

        TZbCourseCommentExample commentExample=new TZbCourseCommentExample();
        TZbCourseCommentExample.Criteria criteria=commentExample.createCriteria();
        criteria.andZbCourseIdEqualTo(id);
        List<TZbCourseComment> list=courseCommentMapper.selectByExample(commentExample);

        return list;
    }

    @Override
    public TZbCourse getCourseID(int id) {
        return courseMapper.selectByPrimaryKey(id);
    }

    @Override
    public int insertCourseComment(Integer prentId,Integer cid,String content,String username) {
        TZbCourseComment courseComment=new TZbCourseComment();
        courseComment.setZbCourseId(prentId);
        courseComment.setZbContent(content);
        courseComment.setZbSectionId(cid);
        courseComment.setZbCreateTime(new Date());
        courseComment.setZbRefContent(content);
        courseComment.setZbUpdateTime(new Date());
        courseComment.setZbToUsername(username);
        courseComment.setZbType((byte) 0);
        courseComment.setZbSectionTitle(String.valueOf(cid));
        courseComment.setZbUsername(username);
        courseComment.setZbRefId(cid);
        int i=courseCommentMapper.insertSelective(courseComment);
        return i;
    }

    @Override
    public TZbUser getUser(String username) {
        TZbUserExample userExample=new TZbUserExample();
        TZbUserExample.Criteria criteria=userExample.createCriteria();
        criteria.andZbUsernameEqualTo(username);
        return userMapper.selectByExample(userExample).get(0);
    }

    @Override
    public int getCourseTeacherSum(String username) {
        TZbCourseExample courseExample=new TZbCourseExample();
        TZbCourseExample.Criteria criteria=courseExample.createCriteria();
        criteria.andZbUsernameEqualTo(username);
        int sum=courseMapper.selectByExample(courseExample).size();
        return sum;
    }

    @Override
    public TZbCourseSection getCourseSection(int id) {
        return courseSectionMapper.selectByPrimaryKey(id);
    }
}
