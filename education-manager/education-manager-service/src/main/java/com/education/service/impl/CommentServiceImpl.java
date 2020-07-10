package com.education.service.impl;

import com.education.mapper.TZbCourseCommentMapper;
import com.education.pojo.TZbCourseComment;
import com.education.pojo.TZbCourseCommentExample;
import com.education.service.CommentService;
import com.education.util.PageInfoShow;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommentServiceImpl implements CommentService {

    @Autowired
    private TZbCourseCommentMapper commentMapper;
    @Override
    public PageInfoShow getCommentList(int page, int rows, String name) {
        PageHelper.startPage(page,rows);
        TZbCourseCommentExample commentExample=new TZbCourseCommentExample();
        TZbCourseCommentExample.Criteria criteria=commentExample.createCriteria();
        criteria.andZbUsernameLike("%"+name+"%");
        List<TZbCourseComment> list=commentMapper.selectByExample(commentExample);
        PageInfo<TZbCourseComment> pageInfo=new PageInfo<>(list);
        PageInfoShow pageInfoShow=new PageInfoShow();
        pageInfoShow.setTotal(pageInfo.getTotal());
        pageInfoShow.setRows(pageInfo.getList());
        pageInfoShow.setPageNow(page);
        pageInfoShow.setName(name);
        pageInfoShow.setTotalPage(pageInfo.getTotal()%15==0?(int)pageInfo.getTotal()/15:(int)pageInfo.getTotal()/15+1);
        return pageInfoShow;
    }

    @Override
    public int deleteCommentOntoTow(String[] comment) {
        int sum=0;
        for (int i=0;i<comment.length;i++){
           sum= commentMapper.deleteByPrimaryKey(Integer.parseInt(comment[i]));
        }
        return sum;
    }
}
