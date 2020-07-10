package com.education.service.impl;

import com.education.mapper.TZbStudentUserMapper;
import com.education.pojo.TZbStudentUser;
import com.education.pojo.TZbStudentUserExample;
import com.education.service.StudentService;
import com.education.util.PageInfoShow;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private TZbStudentUserMapper studentUserMapper;

    @Override
    public PageInfoShow getStudentList(int page, int rows, String name) {
        PageHelper.startPage(page,rows);
        TZbStudentUserExample studentUserExample=new TZbStudentUserExample();
        TZbStudentUserExample.Criteria criteria=studentUserExample.createCriteria();
        criteria.andZbUsernameLike("%"+name+"%");
        List<TZbStudentUser> list=studentUserMapper.selectByExample(studentUserExample);
        PageInfo<TZbStudentUser> pageInfo=new PageInfo<>(list);
        PageInfoShow pageInfoShow=new PageInfoShow();
        pageInfoShow.setTotal(pageInfo.getTotal());
        pageInfoShow.setRows(pageInfo.getList());
        pageInfoShow.setPageNow(page);
        pageInfoShow.setName(name);
        pageInfoShow.setTotalPage(pageInfo.getTotal()%15==0?(int)pageInfo.getTotal()/15:(int)pageInfo.getTotal()/15+1);
        return pageInfoShow;
    }

    @Override
    public int saveStudent(TZbStudentUser studentUser) {

        return studentUserMapper.insertSelective(studentUser);
    }

    @Override
    public int deleteStudentID(int id) {
        return studentUserMapper.deleteByPrimaryKey(id);
    }

    @Override
    public TZbStudentUser getStudentID(int id) {
        return studentUserMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateStudent(TZbStudentUser studentUser) {
        return studentUserMapper.updateByPrimaryKeySelective(studentUser);
    }
}
