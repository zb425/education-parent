package com.education.rest.service.impl;

import com.education.mapper.TZbDiscussionCircleMapper;
import com.education.mapper.TZbDiscussionMapper;
import com.education.pojo.TZbDiscussion;
import com.education.pojo.TZbDiscussionCircle;
import com.education.pojo.TZbDiscussionCircleExample;
import com.education.pojo.TZbDiscussionExample;
import com.education.rest.service.QuestionService;
import com.education.util.PagePortal;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class QuestionServiceImpl implements QuestionService {
    @Autowired
    private TZbDiscussionMapper discussionMapper;
    @Autowired
    private TZbDiscussionCircleMapper discussionCircleMapper;

    @Override
    public PagePortal getQuestionList(int page, int rows) {
        PageHelper.startPage(page,rows);
        TZbDiscussionExample discussionExample=new TZbDiscussionExample();
        TZbDiscussionExample.Criteria criteria=discussionExample.createCriteria();
        criteria.andZbAuthorityEqualTo(1);
        List<TZbDiscussion> list=discussionMapper.selectByExample(discussionExample);
        PageInfo<TZbDiscussion> pageInfo=new PageInfo<>(list);
        PagePortal pagePortal=new PagePortal();
        pagePortal.setPageNow(page);
        pagePortal.setTotal(pageInfo.getTotal());
        pagePortal.setRows(pageInfo.getList());
        pagePortal.setTotalPage(pageInfo.getTotal()%15==0?(int)pageInfo.getTotal()/15:(int)pageInfo.getTotal()/15+1);
        return pagePortal;
    }

    @Override
    public int updateQuestion(int id) {
        TZbDiscussion discussion=discussionMapper.selectByPrimaryKey(id);
        discussion.setZbRead(discussion.getZbRead()+1);
        return discussionMapper.updateByPrimaryKeySelective(discussion);
    }

    @Override
    public PagePortal getQuestionRedList(int id, int page, int rows) {
        PageHelper.startPage(page,rows);
        TZbDiscussionCircleExample discussionExample=new TZbDiscussionCircleExample();
        TZbDiscussionCircleExample.Criteria criteria=discussionExample.createCriteria();
        criteria.andZbCircleDiscussionidEqualTo(id);
        List<TZbDiscussionCircle> list=discussionCircleMapper.selectByExample(discussionExample);
        PageInfo<TZbDiscussionCircle> pageInfo=new PageInfo<>(list);
        PagePortal pagePortal=new PagePortal();
        pagePortal.setPageNow(page);
        pagePortal.setTotal(pageInfo.getTotal());
        pagePortal.setRows(pageInfo.getList());
        pagePortal.setTotalPage(pageInfo.getTotal()%rows==0?(int)pageInfo.getTotal()/rows:(int)pageInfo.getTotal()/rows+1);
        return pagePortal;
    }

    @Override
    public TZbDiscussion getQuestionID(int id) {
        return discussionMapper.selectByPrimaryKey(id);
    }

    @Override
    public int saveQuestionRed(TZbDiscussionCircle discussionCircle) {
        discussionCircle.setZbCreateTime(new Date());
        discussionCircle.setZbUpdateTime(new Date());
        discussionCircle.setZbCircleImage("mm.png");

        TZbDiscussion discussion=discussionMapper.selectByPrimaryKey(discussionCircle.getZbCircleDiscussionid());
        discussion.setZbCircle(discussion.getZbCircle()+1);
        discussionMapper.updateByPrimaryKeySelective(discussion);

        return discussionCircleMapper.insertSelective(discussionCircle);
    }

    @Override
    public int saveQuestionList(TZbDiscussion discussion) {
        discussion.setZbImage("mm.png");
        discussion.setZbCreateTime(new Date());
        discussion.setZbUpdateTime(new Date());
        return discussionMapper.insertSelective(discussion);
    }
}
