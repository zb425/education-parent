package com.education.service.impl;

import com.education.mapper.TZbDiscussionCircleMapper;
import com.education.mapper.TZbDiscussionMapper;
import com.education.pojo.TZbDiscussion;
import com.education.pojo.TZbDiscussionCircle;
import com.education.pojo.TZbDiscussionCircleExample;
import com.education.pojo.TZbDiscussionExample;
import com.education.service.DiscussionService;
import com.education.util.PagePortal;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DiscussionServiceImpl implements DiscussionService {

    @Autowired
    private TZbDiscussionMapper discussionMapper;
    @Autowired
    private TZbDiscussionCircleMapper discussionCircleMapper;
    @Override
    public PagePortal getDiscussionList(String que, int page, int rows) {
        PageHelper.startPage(page,rows);
        TZbDiscussionExample discussionExample=new TZbDiscussionExample();
        TZbDiscussionExample.Criteria criteria=discussionExample.createCriteria();
        criteria.andZbNameLike("%"+que+"%");
        List<TZbDiscussion> list=discussionMapper.selectByExample(discussionExample);
        PageInfo<TZbDiscussion> pageInfo=new PageInfo<>(list);
        PagePortal pagePortal=new PagePortal();
        pagePortal.setTotal(pageInfo.getTotal());
        pagePortal.setRows(pageInfo.getList());
        pagePortal.setPageNow(page);
        pagePortal.setTypeName(que);
        pagePortal.setTotalPage(pageInfo.getTotal()%5==0?(int)pageInfo.getTotal()/5:(int)pageInfo.getTotal()/5+1);
        return pagePortal;
    }

    @Override
    public int deleteDiscussion(int id) {
        return discussionMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int updateDIscussion(int id) {
        TZbDiscussion discussion=discussionMapper.selectByPrimaryKey(id);
        if(discussion.getZbAuthority()==1){
            discussion.setZbAuthority(0);
        }else{
            discussion.setZbAuthority(1);
        }
        return discussionMapper.updateByPrimaryKeySelective(discussion);
    }

    @Override
    public PagePortal getDiscussionIDList(int id, int page, int rows) {
        PageHelper.startPage(page,rows);
        TZbDiscussionCircleExample discussionExample=new TZbDiscussionCircleExample();
        TZbDiscussionCircleExample.Criteria criteria=discussionExample.createCriteria();
        criteria.andZbCircleDiscussionidEqualTo(id);
        List<TZbDiscussionCircle> list=discussionCircleMapper.selectByExample(discussionExample);
        PageInfo<TZbDiscussionCircle> pageInfo=new PageInfo<>(list);
        PagePortal pagePortal=new PagePortal();
        pagePortal.setTotal(pageInfo.getTotal());
        pagePortal.setRows(pageInfo.getList());
        pagePortal.setPageNow(page);
        pagePortal.setTotalPage(pageInfo.getTotal()%5==0?(int)pageInfo.getTotal()/5:(int)pageInfo.getTotal()/5+1);
        return pagePortal;
    }

    @Override
    public int deleteRedDiscussion(int id) {
        return discussionCircleMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int updateRedDiscussion(int id) {
        TZbDiscussionCircle discussion=discussionCircleMapper.selectByPrimaryKey(id);
        if(discussion.getZbCircleAuthority()==1){
            discussion.setZbCircleAuthority(0);
        }else{
            discussion.setZbCircleAuthority(1);
        }
        return discussionCircleMapper.updateByPrimaryKeySelective(discussion);
    }
}
