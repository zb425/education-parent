package com.education.service.impl;

import com.education.mapper.TZbUserMapper;
import com.education.pojo.TZbUser;
import com.education.pojo.TZbUserExample;
import com.education.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LoginServiceImpl implements LoginService {

    @Autowired
    private TZbUserMapper userMapper;
    @Override
    public TZbUser getUser(String username, String password) {
        TZbUserExample userExample=new TZbUserExample();
        TZbUserExample.Criteria criteria=userExample.createCriteria();
        criteria.andZbUsernameEqualTo(username);
        criteria.andZbPasswordEqualTo(password);
        List<TZbUser> users=userMapper.selectByExample(userExample);
        if(!(users.size()>0)){
            return null;
        }
       return userMapper.selectByExample(userExample).get(0);
    }
}
