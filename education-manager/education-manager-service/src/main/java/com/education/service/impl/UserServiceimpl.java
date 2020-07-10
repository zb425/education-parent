package com.education.service.impl;

import com.education.mapper.TZbUserMapper;
import com.education.pojo.TZbUser;
import com.education.pojo.TZbUserExample;
import com.education.service.UserService;
import com.education.util.PageInfoShow;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class UserServiceimpl implements UserService {

    @Autowired
    private TZbUserMapper userMapper;
    @Override
    public PageInfoShow getAllUser(int page, int rows, String name, int status) {
        PageHelper.startPage(page,rows);
        TZbUserExample userExample=new TZbUserExample();
        TZbUserExample.Criteria criteria=userExample.createCriteria();
        criteria.andZbRealnameLike("%"+name+"%");
        if(status==-1){

        }else{
            criteria.andZbStatusEqualTo(status);
        }
        List<TZbUser> list=userMapper.selectByExample(userExample);
        PageInfo<TZbUser> pageInfo=new PageInfo<>(list);
        PageInfoShow pageInfoShow=new PageInfoShow();
        pageInfoShow.setRows(pageInfo.getList());
        pageInfoShow.setTotal(pageInfo.getTotal());
        pageInfoShow.setPageNow(page);
        pageInfoShow.setName(name);
        pageInfoShow.setStatus(status);
        pageInfoShow.setTotalPage(pageInfo.getTotal()%5==0?(int)pageInfo.getTotal()/5:(int)pageInfo.getTotal()/5+1);
        return pageInfoShow;
    }

    @Override
    public TZbUser getUserID(int id) {
        return userMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateUser(TZbUser user) {
        user.setZbUpdateTime(null);
        user.setZbCreateTime(null);
        user.setZbCity(null);
        user.setZbCollegeName(null);
        user.setZbDistrict(null);
        user.setZbEducation(null);
        user.setZbGender(null);
        user.setZbHeader(null);
        user.setZbMobile(null);
        user.setZbPassword(null);
        user.setZbProvince(null);
        user.setZbRealname(null);
        user.setZbTitle(null);
        user.setZbUsername(null);
        user.setZbWeight(null);
        return  userMapper.updateByPrimaryKeySelective(user);
    }

    @Override
    public int deleteUser(int id) {
        return userMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int saveUser(TZbUser user) {
        user.setZbCreateTime(new Date());
        user.setZbUpdateTime(new Date());
        return userMapper.insert(user);
    }

    @Override
    public TZbUser getUserToUsername(String username) {
        TZbUserExample userExample=new TZbUserExample();
        TZbUserExample.Criteria criteria=userExample.createCriteria();
        criteria.andZbUsernameEqualTo(username);
        return userMapper.selectByExample(userExample).get(0);
    }

    @Override
    public int updateToUser(TZbUser user) {

        return userMapper.updateByPrimaryKeySelective(user);
    }
}
