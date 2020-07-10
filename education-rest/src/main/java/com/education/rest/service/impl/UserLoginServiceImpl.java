package com.education.rest.service.impl;

import com.education.mapper.TZbStudentUserMapper;
import com.education.mapper.TZbUserMapper;
import com.education.pojo.TZbStudentUser;
import com.education.pojo.TZbStudentUserExample;
import com.education.pojo.TZbUserExample;
import com.education.rest.service.UserLoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserLoginServiceImpl implements UserLoginService {
    @Autowired
    private TZbUserMapper userMapper;
    @Autowired
    private TZbStudentUserMapper studentUserMapper;

    @Override
    public List<?> getUser(String username, String password) {
        int id=username.indexOf("@");
        if(id>0){
            TZbStudentUserExample studentUserExample=new TZbStudentUserExample();
            TZbStudentUserExample.Criteria criteria=studentUserExample.createCriteria();
            criteria.andZbStudentEmailEqualTo(username);
            criteria.andZbPasswordEqualTo(password);
            return studentUserMapper.selectByExample(studentUserExample);
        }else{
            TZbUserExample userExample=new TZbUserExample();
            TZbUserExample.Criteria criteria=userExample.createCriteria();
            criteria.andZbUsernameEqualTo(username);
            criteria.andZbPasswordEqualTo(password);
            return userMapper.selectByExample(userExample);
        }

    }

    @Override
    public int insertStudentUser(String email, String username, String password) {
        TZbStudentUser studentUser=new TZbStudentUser();
        studentUser.setZbStudentEmail(email);
        studentUser.setZbStudentPhone(username);
        studentUser.setZbPassword(password);
        return studentUserMapper.insertSelective(studentUser);
    }

    @Override
    public int getStudentEmail(String email) {
        TZbStudentUserExample studentUserExample=new TZbStudentUserExample();
        TZbStudentUserExample.Criteria criteria=studentUserExample.createCriteria();
        criteria.andZbStudentPhoneEqualTo(email);
        List<TZbStudentUser> studentUsers=studentUserMapper.selectByExample(studentUserExample);
        if(studentUsers.size()>0){
            return  1;
        }
        return 0;
    }

    @Override
    public int updateStudentPassword(String phone, String password) {
        TZbStudentUserExample studentUserExample=new TZbStudentUserExample();
        TZbStudentUserExample.Criteria criteria=studentUserExample.createCriteria();
        criteria.andZbStudentPhoneEqualTo(phone);
        TZbStudentUser studentUser=studentUserMapper.selectByExample(studentUserExample).get(0);

        studentUser.setZbPassword(password);

        return studentUserMapper.updateByPrimaryKeySelective(studentUser);
    }
}
